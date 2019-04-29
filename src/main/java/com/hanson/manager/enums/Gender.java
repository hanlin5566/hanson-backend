package com.hanson.manager.enums;

import com.hanson.base.enums.EnumType;

public enum Gender implements EnumType {
    UNKNOWN(-1, "未知"),
    MALE(1, "男"),
    FEMALE(2, "女");


    private final int code;
    private final String text;

    private Gender(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int code() {
        return code;
    }

    public String text() {
        return text;
    }

    public static Gender codeOf(int code) {
        if (code < 0) {
            return Gender.UNKNOWN;
        }

        for (Gender value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid Gender code: " + code);
    }
}
