package ru.netology.domain;

public class Radio {
    private int numberStation;
    private int currentStation;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation, int minStation) {

        this.maxStation = maxStation;
        this.minStation = minStation;
    }

    public void nextStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        this.currentStation = ++currentStation;
    }

    public void prevStation() {

        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        this.currentStation = --currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = ++currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = --currentVolume;
    }
}

