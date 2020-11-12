package com.atzzuli.traning.entity;

/**
 * @author 刘京毫
 */
public class Pet {
    public String pname;
    public Integer page;
    public String powner;
    public String ptype;
    public String pdisease;
    public String pseverity;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPowner() {
        return powner;
    }

    public void setPowner(String powner) {
        this.powner = powner;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPdisease() {
        return pdisease;
    }

    public void setPdisease(String pdisease) {
        this.pdisease = pdisease;
    }

    public String getPseverity() {
        return pseverity;
    }

    public void setPseverity(String pseverity) {
        this.pseverity = pseverity;
    }

    @Override
    public String toString() {
        return "Sallerinfo{" +
                "pname='" + pname + '\'' +
                ", page=" + page +
                ", powner='" + powner + '\'' +
                ", ptype='" + ptype + '\'' +
                ", pdisease='" + pdisease + '\'' +
                ", pseverity='" + pseverity + '\'' +
                '}';
    }
}
