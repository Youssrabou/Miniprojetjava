package Miniprojet;

class Site {

    String siteCode;
    String siteName;
    String siteAdress;

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteAdress() {
        return siteAdress;
    }

    public void setSiteAdress(String siteAdress) {
        this.siteAdress = siteAdress;
    }

    public void Site(String siteCode, String siteName, String siteAdress) {
        this.siteCode = siteCode;
        this.siteName = siteName;
        this.siteAdress = siteAdress;
    }

    public void Site() {



    }

    public static void main(String[] args) {

    }
}
