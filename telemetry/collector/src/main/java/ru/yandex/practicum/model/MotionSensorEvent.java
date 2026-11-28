package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;

/**
 * Событие датчика движения
 */
public class MotionSensorEvent extends SensorEvent{
    /**
     * Качество связи
     */
    @NotBlank
    private int linkQuality;
    /**
     * Наличие/отсутствие движения
     */
    @NotBlank
    private boolean motion;
    /**
     * Напряжение
     */
    @NotBlank
    private int voltage;

    @Override
    public SensorEventType getType() {
        return SensorEventType.MOTION_SENSOR_EVENT;
    }
}
