package com.example.contact.model;

import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.contact.R;

import java.util.List;

public class PhoneContact {
    private String number;
    private String kindNumber;
    private String textPhone;
    private int imageViewPhone;
    private List<String> spinnerPhone;

    public PhoneContact(String number, String kindNumber, String textPhone, int imageViewPhone, List<String> spinnerPhone) {
        this.number = number;
        this.kindNumber = kindNumber;
        this.textPhone = textPhone;
        this.imageViewPhone = imageViewPhone;
        this.spinnerPhone = spinnerPhone;
    }

    public String getNumber() {
        return number;
    }

    public String getKindNumber() {
        return kindNumber;
    }

    public String getTextPhone() {
        return textPhone;
    }

    public int getImageView() {
        return imageViewPhone;
    }

    public List<String> getSpinnerPhone() {
        return spinnerPhone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setKindNumber(String kindNumber) {
        this.kindNumber = kindNumber;
    }

    public void setTextPhone(String textPhone) {
        this.textPhone = textPhone;
    }

    public void setImageView(int imageView) {
        this.imageViewPhone = imageView;
    }

    public void setSpinnerPhone(List<String> spinnerPhone) {
        this.spinnerPhone = spinnerPhone;
    }
}