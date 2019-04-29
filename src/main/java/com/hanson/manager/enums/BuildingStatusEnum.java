package com.hanson.manager.enums;

import com.hanson.base.enums.EnumType;

/**
 * @author Hanson
 * create on 2019年3月27日
 * 建筑类型1、商业，2、住宅、3.公建、0未知
 */

public enum BuildingStatusEnum implements EnumType {
    UNKNOWN(0, "未知"),
    NORMAL(1, "正常"),
    GENERATED_NOT_COLLECT(2, "已生成售价列表，但未采集到详情。"),
    SALES_NUM_NOT_FOUND(3, "已生成售价列表，但未采集到详情。"),
    PRICE_INFO_NOT_FOUND(4, "未取到售价信息。"),
    BUILDING_TYPE_FORMAT_ERROR(5, "未取到售价信息。"),
	OTHER(99,"其他"),
	;

    private final int code;
    private final String text;

    private BuildingStatusEnum(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int code() {
        return code;
    }

    public String text() {
        return text;
    }

    public static BuildingStatusEnum codeOf(int code) {
        for (BuildingStatusEnum value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid BuildingTypeEnum code: " + code);
    }
    public static BuildingStatusEnum textOf(String text) {
    	for (BuildingStatusEnum value : values()) {
    		if (value.text.equals(text)) {
    			return value;
    		}
    	}
    	throw new IllegalArgumentException("Invalid BuildingTypeEnum text: " + text);
    }
}