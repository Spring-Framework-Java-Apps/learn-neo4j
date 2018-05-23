package org.woehlke.learn.learnneo4j.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;


@Component
@Validated
@ConfigurationProperties(prefix = "org.woehlke.learn.learnneo4j")
public class MyApplicationProperties {

    @NotNull
    private String filesystemWorkdir;

    @NotNull
    private String loginUsername;

    @NotNull
    private String loginPassword;

    @NotNull
    private List<String> webSecurityConfigPublicPaths;

    @NotNull
    private Boolean createTestDataAtStartup;

    public String[] getWebSecurityConfigPublicPathsAsArray() {
        int size = webSecurityConfigPublicPaths.size();
        String[] myArray = new String[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = webSecurityConfigPublicPaths.get(i);
        }
        return myArray;
    }

    public String getFilesystemWorkdir() {
        return filesystemWorkdir;
    }

    public void setFilesystemWorkdir(String filesystemWorkdir) {
        this.filesystemWorkdir = filesystemWorkdir;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public List<String> getWebSecurityConfigPublicPaths() {
        return webSecurityConfigPublicPaths;
    }

    public void setWebSecurityConfigPublicPaths(List<String> webSecurityConfigPublicPaths) {
        this.webSecurityConfigPublicPaths = webSecurityConfigPublicPaths;
    }

    public Boolean getCreateTestDataAtStartup() {
        return createTestDataAtStartup;
    }

    public void setCreateTestDataAtStartup(Boolean createTestDataAtStartup) {
        this.createTestDataAtStartup = createTestDataAtStartup;
    }

    @Override
    public String toString() {
        return "PortinfoProperties{" +
            "loginUsername='" + loginUsername + '\'' +
            ", loginPassword='" + loginPassword + '\'' +
            ", webSecurityConfigPublicPaths=" + webSecurityConfigPublicPaths +
            '}';
    }
}
