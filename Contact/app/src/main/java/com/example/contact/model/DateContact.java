package com.example.contact.model;

import java.util.Date;

public class DateContact {

    private Date date;
    private String kindDate;

    public DateContact(Date date, String kindDate) {
        this.date = date;
        this.kindDate = kindDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getKindDate() {
        return kindDate;
    }

    public void setKindDate(String kindDate) {
        this.kindDate = kindDate;
    }
}
