package com.hanson.manager.enums;

import com.hanson.base.enums.EnumType;

/**
 * @author Hanson
 * create on 2019年3月27日
 * 建筑类型1、商业，2、住宅、3.公建、0未知
 */

public enum BuildingTypeEnum implements EnumType {
    UNKNOWN(0, "未知"),
	BUSINESS(1, "商业"),
	DWELLING(2, "住宅"),
	PUBLIC(3, "公建"),
	APARTMENT(4, "酒店式公寓"),
	OTHER(99,"其他"),
	;

    private final int code;
    private final String text;

    private BuildingTypeEnum(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int code() {
        return code;
    }

    public String text() {
        return text;
    }

    public static BuildingTypeEnum codeOf(int code) {
        for (BuildingTypeEnum value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid BuildingTypeEnum code: " + code);
    }
    public static BuildingTypeEnum textOf(String text) {
    	for (BuildingTypeEnum value : values()) {
    		if (value.text.equals(text)) {
    			return value;
    		}
    	}
    	throw new IllegalArgumentException("Invalid BuildingTypeEnum text: " + text);
    }
}