package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldUseConstructionDefault() {
        Radio radio1 = new Radio();
        Assertions.assertEquals(10,radio1.getNumberStations());
    }

    @Test
    public void shouldUseCreateConstruction() {
        Radio radio = new Radio(1, 1, 10);
        Assertions.assertEquals(10, radio.getNumberStations());
    }

    @Test
    public void shouldSetNumberStations() {
        Radio radio = new Radio();
        radio.setNumberStations(7);

        Assertions.assertEquals(7,radio.getNumberStations());
    }

    @Test
    public void saveTheCurrentStation() {
        Radio radio = new Radio(2, 1,10);
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void boundaryValues() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void PositiveBoundaryConditionsForStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void borderConditions() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void switchToNextStation() {
        Radio radio = new Radio(6,1,10);
        radio.switchToNextStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void switchToZeroStation() {
        Radio radio = new Radio(9,1,10);
        radio.switchToNextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void switchToPreviousStation() {
        Radio radio = new Radio(9,1,10);
        radio.switchToPreviousStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void switchToNinthStation() {
        Radio radio = new Radio(0,1,10);
        radio.switchToPreviousStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void saveTheCurrentVolume() {
        Radio radio = new Radio(1,2,10);
        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void boundaryValuesForVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void borderConditionsForVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void PositiveBoundaryConditionsForVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);

        Assertions.assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio(1,7,10);
        radio.increaseVolume();

        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void stopIncreaseVolume() {
        Radio radio = new Radio(1,100,10);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(1,7,10);
        radio.decreaseVolume();

        Assertions.assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void stopDecreaseVolume() {
        Radio radio = new Radio(1,0,10);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
