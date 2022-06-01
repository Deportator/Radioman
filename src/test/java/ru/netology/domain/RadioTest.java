package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio(10, 0);

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldNumberStation() {
        radio.setNumberStation(5);
        assertEquals(5, radio.getNumberStation());
    }

    @Test
    public void shouldIncreaseCurrentStation9() {
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation0() {
        radio.prevStation();
        ;
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationMoreMax() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationLessMin() {
        radio.setCurrentStation(-3);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeMoreMax() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeLessMin() {
        radio.setCurrentVolume(-3);
        assertEquals(0, radio.getCurrentVolume());
    }
}

