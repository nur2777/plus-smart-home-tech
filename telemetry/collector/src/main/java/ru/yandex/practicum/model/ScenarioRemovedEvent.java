package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Событие удаления сценария из системы. Содержит информацию о названии удаленного сценария
 */
public class ScenarioRemovedEvent extends HubEvent{
    /**
     * Название удаленного сценария. Должно содержать не менее 3 символов
     */
    @NotBlank
    @Size(min = 3, message = "Название удаляемого сценария должно быть не менее 3 символов")
    String name;

    @Override
    public HubEventType getType() {
        return HubEventType.SCENARIO_REMOVED;
    }
}
