package org.woehlke.learn.learnneo4j.frontend.control.closed.terminal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.middleware.StreamGobbler;

import javax.transaction.Transactional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executors;

@Service
@Transactional
public class TerminalServiceImpl implements TerminalService {

    @Override
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

    private static final Log log = LogFactory.getLog(TerminalServiceImpl.class);
}
