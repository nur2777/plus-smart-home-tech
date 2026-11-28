package ru.yandex.practicum.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.model.HubEvent;
import ru.yandex.practicum.model.SensorEvent;
import ru.yandex.practicum.service.CollectorServiceImpl;

@RestController
@RequestMapping("/events")
public class EventsControllerImpl implements EventsController{

    private final CollectorServiceImpl collectorService;

    @Autowired
    public EventsControllerImpl(CollectorServiceImpl collectorService) {
        this.collectorService = collectorService;
    }

    @Override
    @PostMapping("/sensors")
    @ResponseStatus(HttpStatus.OK)
    public void AddSensorEvent(@Valid @RequestBody SensorEvent sensorEvent) {
        collectorService.AddSensorEvent(sensorEvent);
    }

    @Override
    @PostMapping("/hubs")
    @ResponseStatus(HttpStatus.OK)
    public void AddHubEvent(@Valid @RequestBody HubEvent hubEvent) {
        collectorService.AddHubEvent(hubEvent);
    }
}
