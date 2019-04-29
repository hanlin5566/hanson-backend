package com.hanson.manager.dao.gen.entity;

import com.hanson.base.enums.DataStatus;
import com.hanson.manager.enums.Gender;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hanson.base.annotation.AutoWriteParam;
import com.hanson.base.mybatis.serializer.DatePattern;
import com.hanson.base.serializer.EnumJsonSerializer;
/**
 * tb_system_user 
 * @author huhanlin 2019-04-16
 */
@AutoWriteParam
public class SystemUser {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 性别 0
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private Gender gender;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 昵称
     */
    private String nikeName;

    /**
     * 接口/api名称
     */
    private String apiName;

    /**
     * api/接口密码
     */
    private String apiPwd;

    /**
     * 部门Id
     */
    private String deptId;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 加密字符串
     */
    private String userSalt;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 邮编
     */
    private String userTel;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 公司Code
     */
    private String companyCode;

    /**
     * 创建人
     */
    private Integer createUid;

    /**
     * 修改人
     */
    private Integer updateUid;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = DatePattern.ISO_DATE)
    private Date createTime;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = DatePattern.ISO_DATE)
    private Date updateTime;

    /**
     * 数据状态（0.未知，1.正常，-1.删除)
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private DataStatus dataStatus;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 性别 0
     * @return gender 性别 0
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * 性别 0
     * @param gender 性别 0
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * 用户名称
     * @return user_name 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 昵称
     * @return nike_name 昵称
     */
    public String getNikeName() {
        return nikeName;
    }

    /**
     * 昵称
     * @param nikeName 昵称
     */
    public void setNikeName(String nikeName) {
        this.nikeName = nikeName == null ? null : nikeName.trim();
    }

    /**
     * 接口/api名称
     * @return api_name 接口/api名称
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * 接口/api名称
     * @param apiName 接口/api名称
     */
    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    /**
     * api/接口密码
     * @return api_pwd api/接口密码
     */
    public String getApiPwd() {
        return apiPwd;
    }

    /**
     * api/接口密码
     * @param apiPwd api/接口密码
     */
    public void setApiPwd(String apiPwd) {
        this.apiPwd = apiPwd == null ? null : apiPwd.trim();
    }

    /**
     * 部门Id
     * @return dept_id 部门Id
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 部门Id
     * @param deptId 部门Id
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * 用户密码
     * @return user_pwd 用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 用户密码
     * @param userPwd 用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 加密字符串
     * @return user_salt 加密字符串
     */
    public String getUserSalt() {
        return userSalt;
    }

    /**
     * 加密字符串
     * @param userSalt 加密字符串
     */
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    /**
     * 用户邮箱
     * @return user_email 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 用户邮箱
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 邮编
     * @return user_tel 邮编
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * 邮编
     * @param userTel 邮编
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    /**
     * 用户地址
     * @return user_address 用户地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 用户地址
     * @param userAddress 用户地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * 用户手机号
     * @return user_phone 用户手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 用户手机号
     * @param userPhone 用户手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 公司Code
     * @return company_code 公司Code
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 公司Code
     * @param companyCode 公司Code
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    /**
     * 创建人
     * @return create_uid 创建人
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * 创建人
     * @param createUid 创建人
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * 修改人
     * @return update_uid 修改人
     */
    public Integer getUpdateUid() {
        return updateUid;
    }

    /**
     * 修改人
     * @param updateUid 修改人
     */
    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据状态（0.未知，1.正常，-1.删除)
     * @return data_status 数据状态（0.未知，1.正常，-1.删除)
     */
    public DataStatus getDataStatus() {
        return dataStatus;
    }

    /**
     * 数据状态（0.未知，1.正常，-1.删除)
     * @param dataStatus 数据状态（0.未知，1.正常，-1.删除)
     */
    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }
}