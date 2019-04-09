package com.xz.server.util;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SexType {

    MALE("男"), FEMALE("女");
    private String label;

    SexType(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }
}
