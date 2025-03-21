package com.airsofka.admin.domain.admin.values;

import com.airsofka.admin.domain.admin.utils.ValueValidator;
import com.airsofka.shared.domain.generic.IValueObject;

import java.time.LocalDateTime;

public class ArrivalDate implements IValueObject {
    private final LocalDateTime value;

    private ArrivalDate(LocalDateTime value) {
        this.value = value;
        validate();
    }

    public static ArrivalDate of(LocalDateTime value) {
        return new ArrivalDate(value);
    }

    @Override
    public void validate() {
        ValueValidator.validateDateNotNull(value, "ArrivalDate");
        ValueValidator.validateDateNotEmpty(value, "ArrivalDate");
    }

    public LocalDateTime getValue() {
        return value;
    }
}
