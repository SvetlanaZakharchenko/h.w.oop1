package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {


    @Test
    public void shouldFindMaxStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(9,radio.getMaxStation());

    }
    @Test
    public void shouldUseConstructionDefault() {
        Radio radio1 = new Radio();
        Assertions.assertEquals(10,radio1.getNumberStations());
    }

    @Test
    public void shouldUseCreateConstruction() {
        Radio radio = new Radio(10);
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
        Radio radio = new Radio(10);
        radio.setCurrentStation(2);
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
        Radio radio = new Radio(10);
        radio.setCurrentStation(6);
        radio.switchToNextStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void switchToZeroStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.switchToNextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void switchToPreviousStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.switchToPreviousStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void switchToNinthStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.switchToPreviousStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void saveTheCurrentVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(2);
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
        Radio radio = new Radio(10);
        radio.setCurrentVolume(7);
        radio.increaseVolume();

        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void stopIncreaseVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(7);
        radio.decreaseVolume();

        Assertions.assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void stopDecreaseVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
