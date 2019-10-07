package com.example.contact.model;

public class listitem {
    private String countryName;
    //image
    private String flagName;
    private String tendau;

    public String getTendau() {
        return tendau;
    }

    public void setTendau(String tendau) {
        this.tendau = tendau;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getFlagName() {
        return flagName;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public listitem(String countryName, String flagName, String tendau) {
        this.countryName= countryName;
        this.flagName= flagName;
        this.tendau=tendau;
    }


}
