package com.example.contact.model;

public class DATE {
    private int IDDATE;
    private DATE DATETIME;
    private String DATEKIND;
    private int IDCONTACTSDATE;

    public int getIDDATE() {
        return IDDATE;
    }

    public void setIDDATE(int IDDATE) {
        this.IDDATE = IDDATE;
    }

    public DATE getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(DATE DATETIME) {
        this.DATETIME = DATETIME;
    }

    public String getDATEKIND() {
        return DATEKIND;
    }

    public void setDATEKIND(String DATEKIND) {
        this.DATEKIND = DATEKIND;
    }

    public int getIDCONTACTSDATE() {
        return IDCONTACTSDATE;
    }

    public void setIDCONTACTSDATE(int IDCONTACTSDATE) {
        this.IDCONTACTSDATE = IDCONTACTSDATE;
    }

    public DATE(int IDDATE, DATE DATETIME, String DATEKIND, int IDCONTACTSDATE) {
        this.IDDATE = IDDATE;
        this.DATETIME = DATETIME;
        this.DATEKIND = DATEKIND;
        this.IDCONTACTSDATE = IDCONTACTSDATE;
    }
}
