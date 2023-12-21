package com.example.rorodictionarybe.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BooleanConverter implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean attr) {
        return attr == null ? "No" : "Yes";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return !"No".equals(dbData);
    }
}