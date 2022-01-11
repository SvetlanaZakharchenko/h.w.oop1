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
    public void saveTheCurrentStation() {
        Radio radio = new Radio(2, 1,10);

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextStation() {
        Radio radio = new Radio(6,1,10);

        radio.switchToNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToZeroStation() {
        Radio radio = new Radio(9,1,10);

        radio.switchToNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPreviousStation() {
        Radio radio = new Radio(9,1,10);

        radio.switchToPreviousStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNinthStation() {
        Radio radio = new Radio(0,1,10);

        radio.switchToPreviousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void saveTheCurrentVolume() {
        Radio radio = new Radio(1,2,10);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio radio = new Radio(1,7,10);

        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stopIncreaseVolume() {
        Radio radio = new Radio(1,100,10);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(1,7,10);

        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stopDecreaseVolume() {
        Radio radio = new Radio(1,0,10);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
