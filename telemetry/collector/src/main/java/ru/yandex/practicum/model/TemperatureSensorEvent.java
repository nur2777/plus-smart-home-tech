package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;

/**
 * Событие датчика температуры, содержащее информацию о температуре в градусах Цельсия и Фаренгейта
 */
public class TemperatureSensorEvent extends SensorEvent{
    /**
     * Температура в градусах Цельсия
     */
    @NotBlank
    private int temperatureC;

    /**
     *
     * Температура в градусах Фаренгейта
     */
    @NotBlank
    private int temperatureF;

    @Override
    public SensorEventType getType() {
        return SensorEventType.TEMPERATURE_SENSOR_EVENT;
    }
}
