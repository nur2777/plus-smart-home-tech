package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;

/**
 * Событие, сигнализирующее о добавлении нового устройства в систему
 */
public class DeviceAddedEvent extends HubEvent{

    /**
     * Идентификатор добавленного устройства
     */
    @NotBlank
    String id;

    /**
     * Перечисление типов устройств, которые могут быть добавлены в систему
     */
    @NotBlank
    DeviceType deviceType;

    @Override
    public HubEventType getType() {
        return HubEventType.DEVICE_ADDED;
    }
}
