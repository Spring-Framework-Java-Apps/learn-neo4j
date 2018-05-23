package org.woehlke.learn.learnneo4j.frontend.model;

public enum PageSymbol {

    CUBES("<i class=\"fa fa-cubes\" aria-hidden=\"true\"></i>"),
    GRADUATION_CAP("<i class=\"fa fa-graduation-cap\" aria-hidden=\"true\"></i>"),
    PUZZLE_PIECE("<i class=\"fa fa-puzzle-piece\" aria-hidden=\"true\"></i>"),
    UNIVERSITY("<i class=\"fa fa-university\" aria-hidden=\"true\"></i>"),
    MAP_MARKER("<i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>"),
    IMPRESSUM("<i class=\"fa fa-info-circle\" aria-hidden=\"true\"></i>"),
    SUCHE("<i class=\"fa fa-search\" aria-hidden=\"true\"></i>"),
    USER_CIRCLE("<i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>"),
    LIST_ALT("<i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i>"),
    EMPIRE("<i class=\"fa fa-empire\" aria-hidden=\"true\"></i>"),
    MAP_ICON("<i class=\"fa fa-map-o\" aria-hidden=\"true\"></i>"),
    MARS("<i class=\"fa fa-mars\" aria-hidden=\"true\"></i>"),
    VENUS("<i class=\"fa fa-venus\" aria-hidden=\"true\"></i>"),
    TWITTER_SQUARE("<i class=\"fa fa-twitter-square\" aria-hidden=\"true\"></i>"),
    SOUNDCLOUD("<i class=\"fa fa-soundcloud\" aria-hidden=\"true\"></i>"),
    YOUTUBE("<i class=\"fa fa-youtube\" aria-hidden=\"true\"></i>"),
    FACEBOOK("<i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i>"),
    WEBSEITE("<i class=\"fa fa-link\" aria-hidden=\"true\"></i>"),
    WIKIPEDIA("<i class=\"fa fa-wikipedia-w\" aria-hidden=\"true\"></i>"),
    STARTSEITE("<i class=\"fa fa-play-circle\" aria-hidden=\"true\"></i>"),
    ID_CARD("<i class=\"fa fa-id-card\" aria-hidden=\"true\"></i>"),
    EYE("<i class=\"fa fa-eye\" aria-hidden=\"true\"></i>"),
    BALANCE_SCALE("<i class=\"fa fa-balance-scale\" aria-hidden=\"true\"></i>"),
    NEWSPAPER("<i class=\"fa fa-newspaper-o\" aria-hidden=\"true\"></i>"),
    CLIPBOARD("<i class=\"fa fa-clipboard\" aria-hidden=\"true\"></i>"),
    BOLT("<i class=\"fa fa-bolt\" aria-hidden=\"true\"></i>"),
    LOGIN("<i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>"),
    LOGOUT("<i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>"),
    SUPERPOWERS("<i class=\"fa fa-superpowers\" aria-hidden=\"true\"></i>"),
    USERS("<i class=\"fa fa-users\" aria-hidden=\"true\"></i>"),
    HOME_ICON("<i class=\"fa fa-home\" aria-hidden=\"true\"></i>"),
    HANDSHAKE("<i class=\"fa fa-handshake-o\" aria-hidden=\"true\"></i>"),
    DATABASE("<i class=\"fa fa-database\" aria-hidden=\"true\"></i>"),
    PICTURE("<i class=\"fa fa-picture-o\" aria-hidden=\"true\"></i>"),
    GOOGLE_PLUS("<i class=\"fa fa-google-plus-official\" aria-hidden=\"true\"></i>"),
    GOOGLE_SEARCH("<i class=\"fa fa-google\" aria-hidden=\"true\"></i>"),
    BING_SEARCH("<i class=\"fa fa-windows\" aria-hidden=\"true\"></i>"),
    NETZPOLITIK_ORG("<i class=\"fa fa-newspaper-o\" aria-hidden=\"true\"></i>"),
    INSTAGRAM("<i class=\"fa fa-google-plus-official\" aria-hidden=\"true\"></i>"),
    VIMEO("<i class=\"fa fa-vimeo-square\" aria-hidden=\"true\"></i>"),
    XING("<i class=\"fa fa-xing-square\" aria-hidden=\"true\"></i>"),
    LINKED_IN("<i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i>"),
    STACKOVERFLOW("<i class=\"fa fa-stack-overflow\" aria-hidden=\"true\"></i>"),
    GITHUB("<i class=\"fa fa-github\" aria-hidden=\"true\"></i>"),
    PLAY_CIRCLE("<i class=\"fa fa-play-circle\" aria-hidden=\"true\"></i>"),
    EXCLAMATION_TRIANGLE("<i class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i>");

    private String symbolHtml;

    PageSymbol(String symbolHtml){
        this.symbolHtml = symbolHtml;
    }

    public String getSymbolHtml() {
        return symbolHtml;
    }
}
