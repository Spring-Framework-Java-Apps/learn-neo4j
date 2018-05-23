package org.woehlke.learn.learnneo4j.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
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

    @NotNull
    private String pageSubTitle;

    @Valid
    private Seo seo = new Seo();

    @Validated
    public static class Seo {

        @NotNull
        private String googleMapsApiKey;

        @NotNull
        private String googleAnalyticsKey;

        @NotNull
        private String twitterCardSite;

        @NotNull
        private String twitterCardCreator;

        @NotNull
        private String msvalidateKey;

        @NotNull
        private String googleSiteVerification;

        @NotNull
        private String facebookAppId;

        public String getGoogleMapsApiKey() {
            return googleMapsApiKey;
        }

        public void setGoogleMapsApiKey(String googleMapsApiKey) {
            this.googleMapsApiKey = googleMapsApiKey;
        }

        public String getGoogleAnalyticsKey() {
            return googleAnalyticsKey;
        }

        public void setGoogleAnalyticsKey(String googleAnalyticsKey) {
            this.googleAnalyticsKey = googleAnalyticsKey;
        }

        public String getTwitterCardSite() {
            return twitterCardSite;
        }

        public void setTwitterCardSite(String twitterCardSite) {
            this.twitterCardSite = twitterCardSite;
        }

        public String getTwitterCardCreator() {
            return twitterCardCreator;
        }

        public void setTwitterCardCreator(String twitterCardCreator) {
            this.twitterCardCreator = twitterCardCreator;
        }

        public String getMsvalidateKey() {
            return msvalidateKey;
        }

        public void setMsvalidateKey(String msvalidateKey) {
            this.msvalidateKey = msvalidateKey;
        }

        public String getGoogleSiteVerification() {
            return googleSiteVerification;
        }

        public void setGoogleSiteVerification(String googleSiteVerification) {
            this.googleSiteVerification = googleSiteVerification;
        }

        public String getFacebookAppId() {
            return facebookAppId;
        }

        public void setFacebookAppId(String facebookAppId) {
            this.facebookAppId = facebookAppId;
        }

        @Override
        public String toString() {
            return "Seo{" +
                "googleMapsApiKey='" + googleMapsApiKey + '\'' +
                ", googleAnalyticsKey='" + googleAnalyticsKey + '\'' +
                ", twitterCardSite='" + twitterCardSite + '\'' +
                ", twitterCardCreator='" + twitterCardCreator + '\'' +
                ", msvalidateKey='" + msvalidateKey + '\'' +
                ", googleSiteVerification='" + googleSiteVerification + '\'' +
                ", facebookAppId='" + facebookAppId + '\'' +
                '}';
        }
    }

    public String[] getWebSecurityConfigPublicPathsAsArray() {
        int size = webSecurityConfigPublicPaths.size();
        String[] myArray = new String[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = webSecurityConfigPublicPaths.get(i);
        }
        return myArray;
    }

    public String getPageSubTitle() {
        return pageSubTitle;
    }

    public void setPageSubTitle(String pageSubTitle) {
        this.pageSubTitle = pageSubTitle;
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

    public Seo getSeo() {
        return seo;
    }

    public void setSeo(Seo seo) {
        this.seo = seo;
    }

    @Override
    public String toString() {
        return "MyApplicationProperties{" +
            "filesystemWorkdir='" + filesystemWorkdir + '\'' +
            ", loginUsername='" + loginUsername + '\'' +
            ", loginPassword='" + loginPassword + '\'' +
            ", webSecurityConfigPublicPaths=" + webSecurityConfigPublicPaths +
            ", createTestDataAtStartup=" + createTestDataAtStartup +
            ", seo=" + seo +
            '}';
    }
}
