package org.woehlke.learn.learnneo4j.components;

import java.io.*;
import java.util.concurrent.Callable;

public class StreamGobbler implements Callable<StreamGobbler> {


    protected final InputStream inputStream;
    protected final String prefix;
    protected final OutputStream outputStream;
    protected final Object lock = new Object();
    protected boolean end = false;

    public StreamGobbler(final InputStream inputStream,final OutputStream outputStream){
            this.inputStream=inputStream;
            this.outputStream=outputStream;
            this.prefix="";
    }
    
    @Override
    public StreamGobbler call() throws Exception {
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);

        try {
            String line;
            while ((line = br.readLine()) != null) {
                if (outputStream != null) {
                    if (prefix != null) {
                        outputStream.write(prefix.getBytes());
                    }
                    outputStream.write(line.getBytes());
                    outputStream.write(StringPool.BYTES_NEW_LINE);
                }
            }
        }
        catch (IOException ioe) {
            if (outputStream != null) {
                ioe.printStackTrace(new PrintStream(outputStream));
            }
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                }
                catch (IOException ignore) {
                }
            }
            try {
                br.close();
            }
            catch (IOException ignore) {
            }
        }

        synchronized (lock) {
            lock.notifyAll();
            end = true;
        }
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
