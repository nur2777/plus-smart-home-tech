package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

/**
 * Событие добавления сценария в систему. Содержит информацию о названии сценария, условиях и действиях
 */
public class ScenarioAddedEvent extends HubEvent{

    /**
     * Название добавленного сценария. Должно содержать не менее 3 символов
     */
    @NotBlank
    @Size(min = 3, message = "Название добавляемого сценария должно быть не менее 3 символов")
    String name;

    /**
     * Список условий, которые связаны со сценарием. Не может быть пустым
     */
    @NotEmpty
    List<ScenarioCondition> conditions;

    /**
     * Список действий, которые должны быть выполнены в рамках сценария. Не может быть пустым.
     */
    @NotEmpty
    List<DeviceAction> actions;

    @Override
    public HubEventType getType() {
        return HubEventType.SCENARIO_ADDED;
    }
}
