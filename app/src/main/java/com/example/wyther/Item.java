package com.example.wyther;

public class Item {

    String city, temp, hour;
    int image;

    public Item(String city, String temp, String hour, int image) {
        this.city = city;
        this.temp = temp;
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
