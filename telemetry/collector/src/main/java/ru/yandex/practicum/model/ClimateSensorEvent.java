package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;

/**
 * Событие датчика освещенности, содержащее информацию о качестве связи и уровне освещенности.
 */
public class ClimateSensorEvent extends SensorEvent{
    /**
     * Уровень температуры по шкале Цельсия.
     */
    @NotBlank
    private int temperatureC;
    /**
     * Влажность
     */
    @NotBlank
    private int humidity;
    /**
     * Уровень CO2.
     */
    @NotBlank
    private int co2Level;

    @Override
    public SensorEventType getType() {
        return SensorEventType.CLIMATE_SENSOR_EVENT;
    }
}
