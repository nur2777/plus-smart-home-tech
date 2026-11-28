package ru.yandex.practicum.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

/**
 * Класс описывающий условие сценария, которое содержит информацию о датчике, типе условия, операции и значении
 */
@Data
public class ScenarioCondition {

    /**
     * Идентификатор датчика, связанного с условием
     */
    @NotBlank
    private String sensorId;

    /**
     * Тип условия
     */
    @NonNull
    private ScenarioConditionType type;

    /**
     * Операция
     */
    @NonNull
    private ScenarioConditionOperation operation;

    /**
     * Значение, используемое в условии
     */
    @NotBlank
    private int value;
}
