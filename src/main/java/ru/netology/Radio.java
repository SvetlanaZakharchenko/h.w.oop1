package ru.netology;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;
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

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 10) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            this.currentVolume = 10;
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
