package com.example.contact.model;

import java.util.Arrays;

public class people implements Comparable<people> {
    private int ID ;
    private  byte[] HINH;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String ADDRESS;
    private int IDNUMBER;
    private String NUMBERS;
    private String NUMBERKIND;
    private int IDCONTACTSNUMBER;
    private int IDMAIL ;
    private String MAIL;
    private int IDCONTACTSMAIL;
    private int IDDATE;
    private String DATETIME;
    private String DATEKIND;
    private int IDCONTACTSDATE;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte[] getHINH() {
        return HINH;
    }

    public void setHINH(byte[] HINH) {
        this.HINH = HINH;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

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

    public int getIDDATE() {
        return IDDATE;
    }

    public void setIDDATE(int IDDATE) {
        this.IDDATE = IDDATE;
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

    public int getIDCONTACTSDATE() {
        return IDCONTACTSDATE;
    }

    public void setIDCONTACTSDATE(int IDCONTACTSDATE) {
        this.IDCONTACTSDATE = IDCONTACTSDATE;
    }

    public people(int ID, byte[] HINH, String FIRST_NAME, String LAST_NAME, String ADDRESS, int IDNUMBER, String NUMBERS, String NUMBERKIND, int IDCONTACTSNUMBER, int IDMAIL, String MAIL, int IDCONTACTSMAIL, int IDDATE, String DATETIME, String DATEKIND, int IDCONTACTSDATE) {
        this.ID = ID;
        this.HINH = HINH;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.ADDRESS = ADDRESS;
        this.IDNUMBER = IDNUMBER;
        this.NUMBERS = NUMBERS;
        this.NUMBERKIND = NUMBERKIND;
        this.IDCONTACTSNUMBER = IDCONTACTSNUMBER;
        this.IDMAIL = IDMAIL;
        this.MAIL = MAIL;
        this.IDCONTACTSMAIL = IDCONTACTSMAIL;
        this.IDDATE = IDDATE;
        this.DATETIME = DATETIME;
        this.DATEKIND = DATEKIND;
        this.IDCONTACTSDATE = IDCONTACTSDATE;
    }

    @Override
    public int compareTo(people people) {
        return FIRST_NAME.compareToIgnoreCase(people.FIRST_NAME);
    }
}
