package com.hanson.manager.enums;

import com.hanson.base.enums.EnumType;

/**
 * @author Hanson
 * create on 2019年3月27日
 * 建筑工艺 1、塔楼、2板楼、3其他
 */

public enum BuildingTechEnum implements EnumType {
	UNKNOWN(0, "未知"),
	TOWER(1, "塔楼"),
    SLAB(2,"板楼"),
    OTHER(3,"其他"),
    ;

    private final int code;
    private final String text;

    private BuildingTechEnum(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int code() {
        return code;
    }

    public String text() {
        return text;
    }

    public static BuildingTechEnum codeOf(int code) {
        for (BuildingTechEnum value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid BuildingTypeEnum code: " + code);
    }
}