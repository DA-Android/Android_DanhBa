package com.example.contact.model;

public class EmailContact {
    private String EMail;
    private String textEMail;
    private int imageView;
    public EmailContact(String EMail, String textEMail, int imageView) {
        this.EMail = EMail;
        this.textEMail = textEMail;
        this.imageView = imageView;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getTextEMail() {
        return textEMail;
    }

    public void setTextEMail(String textEMail) {
        this.textEMail = textEMail;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
