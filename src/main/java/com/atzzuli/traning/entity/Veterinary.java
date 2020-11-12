package com.atzzuli.traning.entity;

/**
 * @author 刘京毫
 */
public class Veterinary {
    public String veterinaryid;
    public String veterinaryname;
    public String veterinaryage;
    public String veterinaryspecialty;
    public String veterinarynum;
    public String veterinarysex;


    public void setVeterinaryid(String veterinaryid) {
        this.veterinaryid = veterinaryid;
    }

    public void setVeterinaryname(String veterinaryname) {
        this.veterinaryname = veterinaryname;
    }

    public void setVeterinaryage(String veterinaryage) {
        this.veterinaryage = veterinaryage;
    }

    public void setVeterinaryspecialty(String veterinaryspecialty) {
        this.veterinaryspecialty = veterinaryspecialty;
    }

    public void setVeterinarynum(String veterinarynum) {
        this.veterinarynum = veterinarynum;
    }

    public void setVeterinarysex(String veterinarysex) {
        this.veterinarysex = veterinarysex;
    }

    public String getVeterinaryid() {
        return veterinaryid;
    }

    public String getVeterinaryname() {
        return veterinaryname;
    }

    public String getVeterinaryage() {
        return veterinaryage;
    }

    public String getVeterinaryspecialty() {
        return veterinaryspecialty;
    }

    public String getVeterinarynum() {
        return veterinarynum;
    }

    public String getVeterinarysex() {
        return veterinarysex;
    }

    @Override
    public String toString() {
        return "veterinary{" +
                "veterinaryid=" + veterinaryid +
                ", veterinaryname=" + veterinaryname +
                ", veterinaryage=" + veterinaryage +
                ", veterinaryspecialty=" + veterinaryspecialty +
                ", veterinarynum=" + veterinarynum +
                ", veterinarysex=" + veterinarysex +
                '}';
    }
}

