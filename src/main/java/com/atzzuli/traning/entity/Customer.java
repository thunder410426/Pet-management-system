package com.atzzuli.traning.entity;

public class Customer {
    public String cusid;
    public String cusname;
    public String custel;
    public String cussex;
    public String cuspet1;
    public String cuspet2;
    public String cuspet3;
    public String cuspet4;

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCustel() {
        return custel;
    }

    public void setCustel(String custel) {
        this.custel = custel;
    }

    public String getCussex() {
        return cussex;
    }

    public void setCussex(String cussex) {
        this.cussex = cussex;
    }

    public String getCuspet1() {
        return cuspet1;
    }

    public void setCuspet1(String cuspet1) {
        this.cuspet1 = cuspet1;
    }

    public String getCuspet2() {
        return cuspet2;
    }

    public void setCuspet2(String cuspet2) {
        this.cuspet2 = cuspet2;
    }

    public String getCuspet3() {
        return cuspet3;
    }

    public void setCuspet3(String cuspet3) {
        this.cuspet3 = cuspet3;
    }

    public String getCuspet4() {
        return cuspet4;
    }

    public void setCuspet4(String cuspet4) {
        this.cuspet4 = cuspet4;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusid='" + cusid + '\'' +
                ", cusname='" + cusname + '\'' +
                ", custel='" + custel + '\'' +
                ", cussex='" + cussex + '\'' +
                ", cuspet1='" + cuspet1 + '\'' +
                ", cuspet2='" + cuspet2 + '\'' +
                ", cuspet3='" + cuspet3 + '\'' +
                ", cuspet4='" + cuspet4 + '\'' +
                '}';
    }
}