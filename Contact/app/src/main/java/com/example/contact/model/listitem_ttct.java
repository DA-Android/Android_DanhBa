package com.example.contact.model;

public class listitem_ttct {
    private String NUMBERS;
    private String NUMBERKIND;
    private String MAIL;
    private String DATETIME;
    private String DATEKIND;

    public String getNUMBERS() {
        return NUMBERS;
    }

    public void setNUMBERS(String NUMBERS) {
        this.NUMBERS = NUMBERS;
    }

    public String getNUMBERKIND() {
        return NUMBERKIND;
    }

    public void setNUMBERKIND(String NUMBERKIND) {
        this.NUMBERKIND = NUMBERKIND;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public String getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(String DATETIME) {
        this.DATETIME = DATETIME;
    }

    public String getDATEKIND() {
        return DATEKIND;
    }

    public void setDATEKIND(String DATEKIND) {
        this.DATEKIND = DATEKIND;
    }

    public listitem_ttct(String NUMBERS, String NUMBERKIND, String MAIL, String DATETIME, String DATEKIND) {
        this.NUMBERS = NUMBERS;
        this.NUMBERKIND = NUMBERKIND;
        this.MAIL = MAIL;
        this.DATETIME = DATETIME;
        this.DATEKIND = DATEKIND;
    }
}
