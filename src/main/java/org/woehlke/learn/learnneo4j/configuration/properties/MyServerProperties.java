package org.woehlke.learn.learnneo4j.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Component
@Validated
@ConfigurationProperties(prefix = "server")
public class MyServerProperties {

    @Valid
    private Error error = new Error();

    @Valid
    private Compression compression = new Compression();

    @Validated
    public static class Error {

        @NotNull
        private String path;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

    }

    @Validated
    public static class Compression {

        @NotNull
        private Boolean enabled;

        @NotNull
        private Integer minResponseSize;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getMinResponseSize() {
            return minResponseSize;
        }

        public void setMinResponseSize(Integer minResponseSize) {
            this.minResponseSize = minResponseSize;
        }
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Compression getCompression() {
        return compression;
    }

    public void setCompression(Compression compression) {
        this.compression = compression;
    }

    @Override
    public String toString() {
        List<String> outputLines = new ArrayList<>();
        outputLines.add(" server.error.path =                                   " + this.getError().getPath());
        outputLines.add(" server.compression.enabled =                          " + this.getCompression().getEnabled());
        outputLines.add(" server.compression.min-response-size =                " + this.getCompression().getMinResponseSize());
        StringBuffer sb = new StringBuffer();
        for (String outputLine : outputLines) {
            sb.append(outputLine);
            sb.append("\n");
        }
        return sb.toString();
    }
}
