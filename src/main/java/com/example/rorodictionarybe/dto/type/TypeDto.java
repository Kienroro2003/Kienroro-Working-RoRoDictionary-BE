package com.example.rorodictionarybe.dto.type;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface TypeDto {
    public Long getId();
    public String getNameType();
}
