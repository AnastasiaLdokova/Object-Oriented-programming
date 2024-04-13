package ru.netology;

public class Radio {
    private int maxStation;
    private int currentStation;
    private int currentVolume;

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
