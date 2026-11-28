package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

/**
 * Класс описывающий действие, которое должно быть выполнено устройством
 */
@Data
public class DeviceAction {
    /**
     * Идентификатор датчика, связанного с действием
     */
    @NotBlank
    private String sensorId;

    /**
     * Тип действия при срабатывании условия активации сценария
     */
    @NonNull
    private DeviceActionType type;

    /**
     * Необязательное значение, связанное с действием
     */
    private Integer value;
}
