package com.hanson.manager.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hanson.base.enums.EnumType;
import com.hanson.base.exception.ControllerException;
import com.hanson.base.response.ResponseData;
import com.hanson.base.serializer.EnumJsonSerializer;
import com.hanson.base.util.StringUtils;
import com.hanson.manager.enums.ManagerResponseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Create by hanlin on 2019年1月28日
 **/
@RestController()
@RequestMapping(value = "/enums")
public class EnumsController {
	@GetMapping()
	public ResponseData search(String enumName){
		JSONArray ret = new JSONArray();
		try {
			//com.hanson.manager.enums.BuildingStatusEnum
			enumName = StringUtils.toUpperFristChar(enumName);
			String clazzName = "com.hanson.manager.enums."+enumName+"Enum";
			Class<?> clazz = Class.forName(clazzName);
			if(clazz.isEnum()){
				Object [] constans = clazz.getEnumConstants();
				for (int i = 0; i < constans.length ; i++) {
					if(constans[i] instanceof EnumType){
						EnumType enumsType = (EnumType)constans[i];
						JSONObject enumJSON = new JSONObject();
						enumJSON.put("code",enumsType.code());
						enumJSON.put("name",enumsType.name());
						//由于el-autocomplete需要value所以回执中text改为value返回
						enumJSON.put("text",enumsType.text());
						ret.add(enumJSON);
					}
				}
			}else{
				ResponseData.fail(ManagerResponseCode.PARAM_ERROR);
			}
		} catch (Exception e) {
			throw new ControllerException(ManagerResponseCode.ENUMS_NOT_FOUND,e);
		}
		return ResponseData.ok(ret);
	}
}
