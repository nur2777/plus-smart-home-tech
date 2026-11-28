package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;

/**
 * Событие, сигнализирующее об удалении устройства из системы
 */
public class DeviceRemovedEvent extends HubEvent{

    /**
     * Идентификатор удаленного устройства
     */
    @NotBlank
    String id;

    @Override
    public HubEventType getType() {
        return HubEventType.DEVICE_REMOVED;
    }
}
