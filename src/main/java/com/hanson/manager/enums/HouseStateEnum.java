package com.hanson.manager.enums;

import com.hanson.base.enums.EnumType;

/**
 * @author Hanson
 * create on 2019年2月27日
 */

public enum HouseStateEnum implements EnumType{
		UNKNOWN(0, "未知"),
		NOT_INCLUDED(10, "未纳入网上销售"),//未纳入网上销售 #ccffff
	    CAN_SALE(1, "可售"),//#可售00ff00
	    SALEED(2, "已售"),//#已售ffff00
	    NOW_SALE(3, "现售"),//#现售CCFF00
	    CERTIFIED(4, "已发证"),//#已发证0099ff
	    CLOSE_DOWN(5, "查封"),//#查封ff0000
	    CAN_NOT_SALE(6, "不可售"),//#可售00ff00
	    CAN_SALE_IMPAWN(7, "可售(在建抵押)"),//#可售00ff00
	    ;


	    private final int code;
	    private final String text;

	    private HouseStateEnum(int code, String text) {
	        this.code = code;
	        this.text = text;
	    }

	    @Override
	    public int code() {
	        return code;
	    }

	    @Override
	    public String text() {
	        return text;
	    }

	    public static HouseStateEnum codeOf(int code) {
	        for (HouseStateEnum value : values()) {
	            if (value.code == code) {
	                return value;
	            }
	        }

	        throw new IllegalArgumentException("Invalid SaleStateEnum code: " + code);
	    }
	    
	    public static HouseStateEnum textOf(String text) {
	        for (HouseStateEnum value : values()) {
	            if (value.text.toLowerCase().equals(text.toLowerCase())) {
	                return value;
	            }
	        }
	        throw new IllegalArgumentException("Invalid SaleStateEnum code: " + text);
	    }
}
