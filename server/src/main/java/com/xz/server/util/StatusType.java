package com.xz.server.util;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusType {

    NORMAL("正常"), UNORMAL("不正常");
    private String label;

    StatusType(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }


}
