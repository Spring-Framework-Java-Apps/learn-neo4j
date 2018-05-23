package org.woehlke.learn.learnneo4j.frontend.control.closed.terminal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.middleware.StreamGobbler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executors;

@Service
public class TerminalServiceImpl implements TerminalService {

    private static Logger log = LoggerFactory.getLogger(TerminalServiceImpl.class.getName());

    public void getAllAvailablePorts() {
        int exitCode = 0;
        try {
            log.info("start: getAllAvailablePorts");
            ProcessBuilder builder = new ProcessBuilder();
            builder.command("bash", "", "port echo all");
            File homeDir = new File(System.getProperty("user.home"));
            builder.directory(homeDir);
            File outFile = new File(homeDir.getAbsolutePath()+File.separator+"ports_all_available.txt");
            File outFileErrors = new File(homeDir.getAbsolutePath()+File.separator+"ports_all_available_errors.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(outFile);
            FileOutputStream fileOutputErrorStream = new FileOutputStream(outFileErrors);
            Process process = builder.start();
            StreamGobbler streamGobbler =
                    new StreamGobbler(process.getInputStream(), fileOutputStream);
            StreamGobbler streamGobblerErrors =
                    new StreamGobbler(process.getErrorStream(), fileOutputErrorStream);
            Executors.newSingleThreadExecutor().submit(streamGobbler);
            Executors.newSingleThreadExecutor().submit(streamGobblerErrors);
            exitCode = process.waitFor();
            log.info("DONE: getAllAvailablePorts");
        } catch (IOException ioe) {
            log.error("ERROR: getAllAvailablePorts"+ioe.getMessage());
            ioe.printStackTrace();
            exitCode = 1;
        } catch (InterruptedException ie) {
            ie.printStackTrace();
            exitCode = 2;
            log.error("ERROR: getAllAvailablePorts"+ie.getMessage());
        }
        assert exitCode == 0;
    }
}
