package Miniprojet;

public class Collaborater extends Person {

    private String colaboreterId;
    private String deskPhoneNumber;
    private String mobilePhoneNumber;
    private String mailAdress;
    private OrganisationUnity unité;



    public Collaborater(String firstName, String lastName, String colaboreterId, String deskPhoneNumber, String mobilePhoneNumber, String mailAdress) {

        super (firstName, lastName);
        this.colaboreterId = colaboreterId;
        this.deskPhoneNumber = deskPhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.mailAdress = mailAdress;
    }

    public Collaborater(String colaboreterId, String deskPhoneNumber, String mobilePhoneNumber, String mailAdress) {
        this.colaboreterId = colaboreterId;
        this.deskPhoneNumber = deskPhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.mailAdress = mailAdress;
    }

    public Collaborater() {

        super ();
    }



    public String getColaboreterId() {
        return colaboreterId;
    }

    public void setColaboreterId(String colaboreterId) {
        this.colaboreterId = colaboreterId;
    }

    public String getDeskPhoneNumber() {
        return deskPhoneNumber;
    }

    public void setDeskPhoneNumber(String deskPhoneNumber) {
        this.deskPhoneNumber = deskPhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public OrganisationUnity getUnité() {
        return unité;
    }

    public void setUnité(OrganisationUnity unité) {
        this.unité = unité;
    }
}


