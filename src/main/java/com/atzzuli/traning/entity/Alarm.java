package com.atzzuli.traning.entity;

public class Alarm {
    public String alarmid;
    public String alarmfom;
    public String alarmum;

    @Override
    public String toString() {
        return "Alarm{" +
                "alarmid='" + alarmid + '\'' +
                ", alarmfom='" + alarmfom + '\'' +
                ", alarmum='" + alarmum + '\'' +
                '}';
    }

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid;
    }

    public String getAlarmfom() {
        return alarmfom;
    }

    public void setAlarmfom(String alarmfom) {
        this.alarmfom = alarmfom;
    }

    public String getAlarmum() {
        return alarmum;
    }

    public void setAlarmum(String alarmum) {
        this.alarmum = alarmum;
    }
}
