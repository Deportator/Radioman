package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(5);
        radio.shouldIncreaseStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(5);
        radio.shouldDecreaseStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStation9() {
        radio.setCurrentStation(9);
        radio.shouldIncreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation0() {
        radio.shouldDecreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationMoreMax() {
        radio.setCurrentStation(10);
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
        radio.shouldIncreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(5);
        radio.shouldDecreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeMin() {
        radio.shouldDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeMax() {
        radio.setCurrentVolume(10);
        radio.shouldIncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeMoreMax() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeLessMin() {
        radio.setCurrentVolume(-3);
        assertEquals(0, radio.getCurrentVolume());
    }
}

