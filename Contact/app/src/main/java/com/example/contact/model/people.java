package com.example.contact.model;

import java.util.Arrays;

public class people implements Comparable<people> {
    private int ID ;
    private  byte[] HINH;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String NUMBER_PHONE;
    private String NUMBER_HOME;
    private String NUMBER_COMPANY;
    private String NUMBER_ZALO;
    private String ADDRESS;

    public people(int ID, byte[] HINH, String FIRST_NAME, String LAST_NAME, String EMAIL, String NUMBER_PHONE, String NUMBER_HOME, String NUMBER_COMPANY, String NUMBER_ZALO, String ADDRESS) {
        this.ID = ID;
        this.HINH = HINH;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.EMAIL = EMAIL;
        this.NUMBER_PHONE = NUMBER_PHONE;
        this.NUMBER_HOME = NUMBER_HOME;
        this.NUMBER_COMPANY = NUMBER_COMPANY;
        this.NUMBER_ZALO = NUMBER_ZALO;
        this.ADDRESS = ADDRESS;
    }

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

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNUMBER_PHONE() {
        return NUMBER_PHONE;
    }

    public void setNUMBER_PHONE(String NUMBER_PHONE) {
        this.NUMBER_PHONE = NUMBER_PHONE;
    }

    public String getNUMBER_HOME() {
        return NUMBER_HOME;
    }

    public void setNUMBER_HOME(String NUMBER_HOME) {
        this.NUMBER_HOME = NUMBER_HOME;
    }

    public String getNUMBER_COMPANY() {
        return NUMBER_COMPANY;
    }

    public void setNUMBER_COMPANY(String NUMBER_COMPANY) {
        this.NUMBER_COMPANY = NUMBER_COMPANY;
    }

    public String getNUMBER_ZALO() {
        return NUMBER_ZALO;
    }

    public void setNUMBER_ZALO(String NUMBER_ZALO) {
        this.NUMBER_ZALO = NUMBER_ZALO;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    @Override
    public int compareTo(people people) {
        return FIRST_NAME.compareToIgnoreCase(people.FIRST_NAME);
    }
}
