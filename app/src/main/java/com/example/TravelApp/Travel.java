package com.example.TravelApp;


public class Travel {

    String days;
    private String NameCountry;
    private String Namecity;
    private String pay;
    private int imag;


    public Travel(int imag, String NameCountry, String Namecity, String days, String pay) {
        this.NameCountry = NameCountry;
        this.Namecity = Namecity;
        this.days = days;
        this.pay = pay;
        this.imag = imag;
    }

    public String getNameCountry() {
        return NameCountry;
    }


    public void setNameCountry(String NameCountry) {
        this.NameCountry = NameCountry;
    }

    public int getimag() {
        return imag;
    }

    public void setimage(int imag) {
        this.imag = imag;
    }

    public String getNamecity() {
        return Namecity;
    }

    public void setNamecity(String Namecity) {
        this.Namecity = Namecity;
    }

    public String getdays() {
        return days;
    }

    public void setdays(String days) {
        this.days = days;
    }

    public String getpay() {
        return pay;
    }

    public void setpay(String pay) {
        this.pay = pay;
    }
}