package com.hanson.manager.enums;

import com.hanson.base.enums.EnumType;

/**
 * @author Hanson
 * create on 2019年2月27日
 * 城区枚举类
 */

public enum DistrictEnum implements EnumType{
		UNKNOWN(0, "未知"),
		HUANG_GU(1, "皇姑"),
		SHEN_HE(2, "沈河"),
		HE_PING(3, "和平"),
		DA_DONG(4, "大东"),
		TIE_XI(5, "铁西"),
		HUN_NAN(6, "浑南"),
		YU_HONG(7, "于洪"),
		DONG_LING(8, "东陵"),
		SHEN_BEI(9, "沈北"),
		SU_JIA_TUN(10, "苏家屯"),
		KAI_FA(11, "开发区"),
	    ;


	    private final int code;
	    private final String text;

	    private DistrictEnum(int code, String text) {
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

	    public static DistrictEnum codeOf(int code) {
	        for (DistrictEnum value : values()) {
	            if (value.code == code) {
	                return value;
	            }
	        }

	        throw new IllegalArgumentException("Invalid DistrictEnum code: " + code);
	    }
	    
	    public static DistrictEnum textOf(String text) {
	        for (DistrictEnum value : values()) {
	            if (text.toLowerCase().indexOf(value.text.toLowerCase())>=0) {
	                return value;
	            }
	        }
	        throw new IllegalArgumentException("Invalid DistrictEnum code: " + text);
	    }
}
