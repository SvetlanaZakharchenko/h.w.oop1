package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void saveTheCurrentStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(2);

        int expected = 2;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValues() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderConditions() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(6);

        cond.switchToNextStation();

        int expected = 7;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToZeroStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        cond.switchToNextStation();

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPreviousStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        cond.switchToPreviousStation();

        int expected = 8;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNinthStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);

        cond.switchToPreviousStation();

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void saveTheCurrentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(2);

        int expected = 2;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesForVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderConditionsForVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(7);

        cond.increaseVolume();

        int expected = 8;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stopIncreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(7);

        cond.decreaseVolume();

        int expected = 6;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stopDecreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
