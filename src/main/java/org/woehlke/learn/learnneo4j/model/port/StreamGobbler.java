package org.woehlke.learn.learnneo4j.model.port;

import java.io.*;
import java.util.concurrent.Callable;

public class StreamGobbler implements Callable<StreamGobbler> {

    protected final InputStream inStream;
    protected final OutputStream outStream;
    boolean end = false;
    Object lock = new Object();

    public StreamGobbler(final InputStream inStream, final OutputStream outStream){
        this.inStream=inStream;
        this.outStream=outStream;
    }
    
    @Override
    public StreamGobbler call() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outStream));
        try {
            String line;
            while ((line = in.readLine()) != null) {
                if (out != null) {
                   out.write(line);
                   out.newLine();
                }
            }
        } catch (IOException ioe) {
            if (outStream != null) {
                ioe.printStackTrace(new PrintStream(outStream));
            }
        } finally {
            if (outStream != null) {
                try {
                    outStream.flush();
                }
                catch (IOException ignore) {
                }
            }
            try {
                in.close();
            }
            catch (IOException ignore) {
            }
        }
        synchronized (lock) {
            lock.notifyAll();
            end = true;
        }
        return this;
    }


    /**
     * Waits for gobbler to end.
     */
    public void waitFor() {
        try {
            synchronized (lock) {
                if (!end) {
                    lock.wait();
                }
            }
        }
        catch (InterruptedException ignore) {
            Thread.currentThread().interrupt();
        }
    }

}
