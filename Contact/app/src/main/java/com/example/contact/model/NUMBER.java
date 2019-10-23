package com.example.contact.model;

public class NUMBER {
    private int IDNUMBER;
    private String NUMBERS;
    private String NUMBERKIND;
    private int IDCONTACTSNUMBER;

    public int getIDNUMBER() {
        return IDNUMBER;
    }

    public void setIDNUMBER(int IDNUMBER) {
        this.IDNUMBER = IDNUMBER;
    }

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

    public int getIDCONTACTSNUMBER() {
        return IDCONTACTSNUMBER;
    }

    public void setIDCONTACTSNUMBER(int IDCONTACTSNUMBER) {
        this.IDCONTACTSNUMBER = IDCONTACTSNUMBER;
    }

    public NUMBER(int IDNUMBER, String NUMBERS, String NUMBERKIND, int IDCONTACTSNUMBER) {
        this.IDNUMBER = IDNUMBER;
        this.NUMBERS = NUMBERS;
        this.NUMBERKIND = NUMBERKIND;
        this.IDCONTACTSNUMBER = IDCONTACTSNUMBER;
    }
}
