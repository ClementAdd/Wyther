package com.example.wyther;

import android.util.Log;

public class Item {
    String city, temp, hour, key;

    public Item(String city, String tmp, String hour, String key) {
        this.city = city;
        this.temp = tmp;
        this.hour = hour;
        this.key = key;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getCondition() {
        switch (key) {
            case "ensoleille":
                return R.drawable.ensoleille;
            case "nuit-nuageuse":
                return R.drawable.nuitnuageuse;
            case "nuit-claire":
                return R.drawable.nuitclaire;
            case "nuit-bien-degagee":
                return R.drawable.nuitbiendegagee;
            case "averses-de-pluie-faible":
                return R.drawable.aversesdepluiefaible;
            case "pluie-faible":
                return R.drawable.pluiefaible;
                case "couvert-avec-averses":
                return R.drawable.couvertavecaverses;
            case "faiblement-nuageux":
                return R.drawable.faiblementnuageux;
            case "fortement-nuageux":
                return R.drawable.fortementnuageux;
            case "pluie-moderee":
                return R.drawable.pluiemoderee;
            case "eclaircies":
                return R.drawable.eclaircies;
            case "nuit-legerement-voilee":
                return R.drawable.nuitlegerementvoilee;
            case "nuit-avec-averses":
                return R.drawable.nuitavecaverses;
            case "ciel-voile":
                return R.drawable.cielvoile;
            case "faibles-passages-nuageux":
                return R.drawable.faiblespassagesnuageux;
            case "nuit-avec-averses-de-neige-faible":
                return R.drawable.nuitavecaversesdeneigefaible;
            case "averses-de-neige-faible":
                return R.drawable.aversesdeneigefaible;
            case "null":
                return R.drawable.ic_launcher_foreground;
        }
        return 0;
    }
}
