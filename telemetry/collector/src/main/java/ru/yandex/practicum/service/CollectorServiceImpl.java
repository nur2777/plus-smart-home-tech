package ru.yandex.practicum.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.model.HubEvent;
import ru.yandex.practicum.model.SensorEvent;

@Service
@Slf4j
@RequiredArgsConstructor
public class CollectorServiceImpl implements CollectorService{
    @Override
    public void AddSensorEvent(SensorEvent newSensorEvent) {
        log.info("Получено новое событие от датчика: {}", newSensorEvent.toString());
    }

    @Override
    public void AddHubEvent(HubEvent newHubEvent) {
        log.info("Получено новое событие от хаба: {}", newHubEvent.toString());
    }
}
