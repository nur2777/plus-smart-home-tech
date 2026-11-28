package ru.yandex.practicum.service;

import ru.yandex.practicum.model.HubEvent;
import ru.yandex.practicum.model.SensorEvent;

/**
 * Интерфейс описывает методы для обработки событий от датчиков и хабов
 */
public interface CollectorService {

    /** Метод обработки событий от датчиков
     * @param newSensorEvent событие от датчика
     */
    void AddSensorEvent(SensorEvent newSensorEvent);

    /** Метод обработки событий от хаба
     * @param newHubEvent  событие от хаба
     */
    void AddHubEvent(HubEvent newHubEvent);


}
