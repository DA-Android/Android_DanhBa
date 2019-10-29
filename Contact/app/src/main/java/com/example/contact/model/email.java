package com.example.contact.model;

public class email {
    private int IDMAIL ;
    private String MAIL;
    private int IDCONTACTSMAIL;

    public int getIDMAIL() {
        return IDMAIL;
    }

    public void setIDMAIL(int IDMAIL) {
        this.IDMAIL = IDMAIL;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public int getIDCONTACTSMAIL() {
        return IDCONTACTSMAIL;
    }

    public void setIDCONTACTSMAIL(int IDCONTACTSMAIL) {
        this.IDCONTACTSMAIL = IDCONTACTSMAIL;
    }

    public email(int IDMAIL, String MAIL, int IDCONTACTSMAIL) {
        this.IDMAIL = IDMAIL;
        this.MAIL = MAIL;
        this.IDCONTACTSMAIL = IDCONTACTSMAIL;
    }
}
