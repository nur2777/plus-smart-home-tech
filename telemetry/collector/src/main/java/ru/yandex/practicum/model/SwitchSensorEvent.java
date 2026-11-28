package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Событие датчика переключателя, содержащее информацию о текущем состоянии переключателя.
 */
@Getter
@Setter
@ToString(callSuper = true)
public class SwitchSensorEvent extends SensorEvent{
    /**
     * Текущее состояние переключателя. true - включен, false - выключен.
     */
    @NotBlank
    private boolean state;

    @Override
    public SensorEventType getType() {
        return SensorEventType.SWITCH_SENSOR_EVENT;
    }
}
