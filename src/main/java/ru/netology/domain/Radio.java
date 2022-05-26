package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void shouldIncreaseStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        ++currentStation;
    }

    public void shouldDecreaseStation() {

        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        --currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation || currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume || currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void shouldIncreaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }

    public void shouldDecreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        --currentVolume;
    }
}

