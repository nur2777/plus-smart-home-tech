package ru.yandex.practicum.controller;

import ru.yandex.practicum.model.HubEvent;
import ru.yandex.practicum.model.SensorEvent;

/**
 * Интерфейс для контроллера по работе с событиями
 */
public interface EventsController {

    /** Эндпоинт для обработки событий от датчиков
     * @param sensorEvent данные события от датчика
     */
    void AddSensorEvent(SensorEvent sensorEvent);

    /** Эндпоинт для обработки событий от хаба
     * @param hubEvent данные события от хаба
     */
    void AddHubEvent(HubEvent hubEvent);


}
