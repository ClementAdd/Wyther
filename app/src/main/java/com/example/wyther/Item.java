package com.example.wyther;

import android.media.Image;

public class Item {

    int image;
    String city, temp, hour;

    public Item(String city, String tmp, String hour, int image){
        this.city = city;
        this.temp = tmp;
        this.hour = hour;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
