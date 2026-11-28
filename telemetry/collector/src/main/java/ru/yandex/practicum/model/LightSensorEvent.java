package ru.yandex.practicum.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Событие датчика освещенности, содержащее информацию о качестве связи и уровне освещенности.
 */
@Getter
@Setter
@ToString(callSuper = true)
public class LightSensorEvent extends SensorEvent {
    /**
     * Качество связи
     */
    private int linkQuality;
    /**
     * Уровень освещенности
     */
    private int luminosity;

    @Override
    public SensorEventType getType() {
        return SensorEventType.LIGHT_SENSOR_EVENT;
    }
}
