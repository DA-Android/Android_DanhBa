package com.example.contact.model;

import java.util.Arrays;

public class people implements Comparable<people> {
    private int ID ;
    private  byte[] HINH;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String ADDRESS;
    private String NUMBERS1;
    private String NUMBERKIND1;
    private String NUMBERS2;
    private String NUMBERKIND2;
    private String NUMBERS3;
    private String NUMBERKIND3;
    private String NUMBERS4;
    private String NUMBERKIND4;
    private String NUMBERS5;
    private String NUMBERKIND5;
    private String NUMBERS6;
    private String NUMBERKIND6;
    private String MAIL1;
    private String MAIL2;
    private String MAIL3;
    private String MAIL4;
    private String MAIL5;
    private String MAIL6;
    private String DATETIME1;
    private String DATEKIND1;
    private String DATETIME2;
    private String DATEKIND2;
    private String DATETIME3;
    private String DATEKIND3;
    private String DATETIME4;
    private String DATEKIND4;
    private String DATETIME5;
    private String DATEKIND5;
    private String DATETIME6;
    private String DATEKIND6;

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

    public String getNUMBERS1() {
        return NUMBERS1;
    }

    public void setNUMBERS1(String NUMBERS1) {
        this.NUMBERS1 = NUMBERS1;
    }

    public String getNUMBERKIND1() {
        return NUMBERKIND1;
    }

    public void setNUMBERKIND1(String NUMBERKIND1) {
        this.NUMBERKIND1 = NUMBERKIND1;
    }

    public String getNUMBERS2() {
        return NUMBERS2;
    }

    public void setNUMBERS2(String NUMBERS2) {
        this.NUMBERS2 = NUMBERS2;
    }

    public String getNUMBERKIND2() {
        return NUMBERKIND2;
    }

    public void setNUMBERKIND2(String NUMBERKIND2) {
        this.NUMBERKIND2 = NUMBERKIND2;
    }

    public String getNUMBERS3() {
        return NUMBERS3;
    }

    public void setNUMBERS3(String NUMBERS3) {
        this.NUMBERS3 = NUMBERS3;
    }

    public String getNUMBERKIND3() {
        return NUMBERKIND3;
    }

    public void setNUMBERKIND3(String NUMBERKIND3) {
        this.NUMBERKIND3 = NUMBERKIND3;
    }

    public String getNUMBERS4() {
        return NUMBERS4;
    }

    public void setNUMBERS4(String NUMBERS4) {
        this.NUMBERS4 = NUMBERS4;
    }

    public String getNUMBERKIND4() {
        return NUMBERKIND4;
    }

    public void setNUMBERKIND4(String NUMBERKIND4) {
        this.NUMBERKIND4 = NUMBERKIND4;
    }

    public String getNUMBERS5() {
        return NUMBERS5;
    }

    public void setNUMBERS5(String NUMBERS5) {
        this.NUMBERS5 = NUMBERS5;
    }

    public String getNUMBERKIND5() {
        return NUMBERKIND5;
    }

    public void setNUMBERKIND5(String NUMBERKIND5) {
        this.NUMBERKIND5 = NUMBERKIND5;
    }

    public String getNUMBERS6() {
        return NUMBERS6;
    }

    public void setNUMBERS6(String NUMBERS6) {
        this.NUMBERS6 = NUMBERS6;
    }

    public String getNUMBERKIND6() {
        return NUMBERKIND6;
    }

    public void setNUMBERKIND6(String NUMBERKIND6) {
        this.NUMBERKIND6 = NUMBERKIND6;
    }

    public String getMAIL1() {
        return MAIL1;
    }

    public void setMAIL1(String MAIL1) {
        this.MAIL1 = MAIL1;
    }

    public String getMAIL2() {
        return MAIL2;
    }

    public void setMAIL2(String MAIL2) {
        this.MAIL2 = MAIL2;
    }

    public String getMAIL3() {
        return MAIL3;
    }

    public void setMAIL3(String MAIL3) {
        this.MAIL3 = MAIL3;
    }

    public String getMAIL4() {
        return MAIL4;
    }

    public void setMAIL4(String MAIL4) {
        this.MAIL4 = MAIL4;
    }

    public String getMAIL5() {
        return MAIL5;
    }

    public void setMAIL5(String MAIL5) {
        this.MAIL5 = MAIL5;
    }

    public String getMAIL6() {
        return MAIL6;
    }

    public void setMAIL6(String MAIL6) {
        this.MAIL6 = MAIL6;
    }

    public String getDATETIME1() {
        return DATETIME1;
    }

    public void setDATETIME1(String DATETIME1) {
        this.DATETIME1 = DATETIME1;
    }

    public String getDATEKIND1() {
        return DATEKIND1;
    }

    public void setDATEKIND1(String DATEKIND1) {
        this.DATEKIND1 = DATEKIND1;
    }

    public String getDATETIME2() {
        return DATETIME2;
    }

    public void setDATETIME2(String DATETIME2) {
        this.DATETIME2 = DATETIME2;
    }

    public String getDATEKIND2() {
        return DATEKIND2;
    }

    public void setDATEKIND2(String DATEKIND2) {
        this.DATEKIND2 = DATEKIND2;
    }

    public String getDATETIME3() {
        return DATETIME3;
    }

    public void setDATETIME3(String DATETIME3) {
        this.DATETIME3 = DATETIME3;
    }

    public String getDATEKIND3() {
        return DATEKIND3;
    }

    public void setDATEKIND3(String DATEKIND3) {
        this.DATEKIND3 = DATEKIND3;
    }

    public String getDATETIME4() {
        return DATETIME4;
    }

    public void setDATETIME4(String DATETIME4) {
        this.DATETIME4 = DATETIME4;
    }

    public String getDATEKIND4() {
        return DATEKIND4;
    }

    public void setDATEKIND4(String DATEKIND4) {
        this.DATEKIND4 = DATEKIND4;
    }

    public String getDATETIME5() {
        return DATETIME5;
    }

    public void setDATETIME5(String DATETIME5) {
        this.DATETIME5 = DATETIME5;
    }

    public String getDATEKIND5() {
        return DATEKIND5;
    }

    public void setDATEKIND5(String DATEKIND5) {
        this.DATEKIND5 = DATEKIND5;
    }

    public String getDATETIME6() {
        return DATETIME6;
    }

    public void setDATETIME6(String DATETIME6) {
        this.DATETIME6 = DATETIME6;
    }

    public String getDATEKIND6() {
        return DATEKIND6;
    }

    public void setDATEKIND6(String DATEKIND6) {
        this.DATEKIND6 = DATEKIND6;
    }

    public people(int ID, byte[] HINH, String FIRST_NAME, String LAST_NAME, String ADDRESS, String NUMBERS1, String NUMBERKIND1, String NUMBERS2, String NUMBERKIND2, String NUMBERS3, String NUMBERKIND3, String NUMBERS4, String NUMBERKIND4, String NUMBERS5, String NUMBERKIND5, String NUMBERS6, String NUMBERKIND6, String MAIL1, String MAIL2, String MAIL3, String MAIL4, String MAIL5, String MAIL6, String DATETIME1, String DATEKIND1, String DATETIME2, String DATEKIND2, String DATETIME3, String DATEKIND3, String DATETIME4, String DATEKIND4, String DATETIME5, String DATEKIND5, String DATETIME6, String DATEKIND6) {
        this.ID = ID;
        this.HINH = HINH;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.ADDRESS = ADDRESS;
        this.NUMBERS1 = NUMBERS1;
        this.NUMBERKIND1 = NUMBERKIND1;
        this.NUMBERS2 = NUMBERS2;
        this.NUMBERKIND2 = NUMBERKIND2;
        this.NUMBERS3 = NUMBERS3;
        this.NUMBERKIND3 = NUMBERKIND3;
        this.NUMBERS4 = NUMBERS4;
        this.NUMBERKIND4 = NUMBERKIND4;
        this.NUMBERS5 = NUMBERS5;
        this.NUMBERKIND5 = NUMBERKIND5;
        this.NUMBERS6 = NUMBERS6;
        this.NUMBERKIND6 = NUMBERKIND6;
        this.MAIL1 = MAIL1;
        this.MAIL2 = MAIL2;
        this.MAIL3 = MAIL3;
        this.MAIL4 = MAIL4;
        this.MAIL5 = MAIL5;
        this.MAIL6 = MAIL6;
        this.DATETIME1 = DATETIME1;
        this.DATEKIND1 = DATEKIND1;
        this.DATETIME2 = DATETIME2;
        this.DATEKIND2 = DATEKIND2;
        this.DATETIME3 = DATETIME3;
        this.DATEKIND3 = DATEKIND3;
        this.DATETIME4 = DATETIME4;
        this.DATEKIND4 = DATEKIND4;
        this.DATETIME5 = DATETIME5;
        this.DATEKIND5 = DATEKIND5;
        this.DATETIME6 = DATETIME6;
        this.DATEKIND6 = DATEKIND6;
    }

    @Override
    public int compareTo(people people) {
        return FIRST_NAME.compareToIgnoreCase(people.FIRST_NAME);
    }
}
