package com.hanson.manager.enums;

import com.hanson.base.enums.IResponseCode;

public enum ManagerResponseCode implements IResponseCode {
    USER_NOT_FOUND(100001, "用户未找到","账户不存在,请检查用户名或者密码"),
    USER_PWD_ERROR(100002, "用户未找到","账户不存在,请检查用户名或者密码"),
    USER_NAME_DUPLICATE(100003, "用户名重复,请检查用户名","用户名重复,请检查用户名."),
    ENUMS_NOT_FOUND(100101, "枚举类型未找到","数据未找到."),
    PARAM_ERROR(600001, "接收参数异常,请检查您的参数.","规则引擎接收参数异常,参数快照"),
    RULE_REFRESH_ERROR(600002, "规则引擎刷新错误","规则引擎刷新错误。"),
    RULE_EXECUTE_ERROR(600003, "规则引擎执行错误","规则引擎执行错误。"),
    ;
    private final int code;
    private final String friendlyMsg;
    private final String detailMsg;

    private ManagerResponseCode(int code, String friendlyMsg) {
        this.code = code;
        this.friendlyMsg = friendlyMsg;
        this.detailMsg = friendlyMsg;
    }

    private ManagerResponseCode(int code, String friendlyMsg, String detailMsg) {
        this.code = code;
        this.friendlyMsg = friendlyMsg;
        this.detailMsg = detailMsg;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String friendlyMsg() {
        return friendlyMsg;
    }

    @Override
    public String detailMsg() {
        return detailMsg;
    }

    public static ManagerResponseCode codeOf(int code) {
        for (ManagerResponseCode value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid ManagerResponseCode code: " + code);
    }
}
