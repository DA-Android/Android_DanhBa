package com.example.contact.model;

import java.util.Date;
import java.util.List;

public class DateContact {

    private String date;
    private String kindDate;
    private String textViewDate;
    private int imageViewDate;
    private List<String> spinnerDate;

    public DateContact(String date, String kindDate, String textViewDate, int imageViewDate, List<String> spinnerDate) {
        this.date = date;
        this.kindDate = kindDate;
        this.textViewDate = textViewDate;
        this.imageViewDate = imageViewDate;
        this.spinnerDate = spinnerDate;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKindDate() {
        return kindDate;
    }

    public void setKindDate(String kindDate) {
        this.kindDate = kindDate;
    }

    public String getTextViewDate() {
        return textViewDate;
    }

    public void setTextViewDate(String textViewDate) {
        this.textViewDate = textViewDate;
    }

    public int getImageViewDate() {
        return imageViewDate;
    }

    public void setImageViewDate(int imageViewDate) {
        this.imageViewDate = imageViewDate;
    }

    public List<String> getSpinnerDate() {
        return spinnerDate;
    }

    public void setSpinnerDate(List<String> spinnerDate) {
        this.spinnerDate = spinnerDate;
    }



}
