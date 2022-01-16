package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int numberStations = 10;

    public Radio() {
    }

    public Radio(int numberStations) {
        this.numberStations = numberStations;
        this.maxStation = numberStations - 1;
    }

    public int getCurrentStation() {return currentStation;}

    public void setNumberStations (int numberStations) {
            this.numberStations = numberStations;
    }

    public int getNumberStations() {return numberStations;}
    public int getMaxStation() {return maxStation;}

    public void setMaxStation (int maxStation) {
        this.maxStation = maxStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchToNextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void switchToPreviousStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public void increaseVolume() {
        if (currentVolume == 100) {
            this.currentVolume = 100;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}
