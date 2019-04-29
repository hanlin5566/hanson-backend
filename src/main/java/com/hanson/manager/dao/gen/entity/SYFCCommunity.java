package com.hanson.manager.dao.gen.entity;

import com.hanson.base.enums.DataStatus;
import com.hanson.manager.enums.DistrictEnum;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hanson.base.annotation.AutoWriteParam;
import com.hanson.base.mybatis.serializer.DatePattern;
import com.hanson.base.serializer.EnumJsonSerializer;
/**
 * tb_syfc_community 
 * @author huhanlin 2019-04-28
 */
@AutoWriteParam
public class SYFCCommunity {
    /**
     * 主鍵
     */
    private Integer id;

    /**
     * 第三方记录ID
     */
    private Integer thirdRecordId;

    /**
     * 开发商名称
     */
    private String company;

    /**
     * 开发商可读名称
     */
    private String companyFriendly;

    /**
     * 项目名称
     */
    private String programName;

    /**
     * 项目可读名称
     */
    private String programNameFriendly;

    /**
     * 项目地址
     */
    private String programLocaltion;

    /**
     * 友好的项目地址
     */
    private String programLocaltionFriendly;

    /**
     * 项目描述
     */
    private String programDescription;

    /**
     * 所在区域
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private DistrictEnum district;

    /**
     * 商品房栋数
     */
    private Integer buildCount;

    /**
     * 开盘日期
     */
    @DateTimeFormat(pattern = DatePattern.ISO_DATE)
    @JsonFormat(pattern = DatePattern.ISO_DATE,timezone = DatePattern.TIME_ZONE)
    private Date salesDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 数据状态1-正常，0-位置，-1已删除
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private DataStatus dataStatus;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改人
     */
    private Integer updateUserId;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = DatePattern.ISO_DATE)
    @JsonFormat(pattern = DatePattern.ISO_DATE_TIME,timezone = DatePattern.TIME_ZONE)
    private Date createTime;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = DatePattern.ISO_DATE)
    @JsonFormat(pattern = DatePattern.ISO_DATE_TIME,timezone = DatePattern.TIME_ZONE)
    private Date updateTime;

    /**
     * 主鍵
     * @return id 主鍵
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主鍵
     * @param id 主鍵
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 第三方记录ID
     * @return third_record_id 第三方记录ID
     */
    public Integer getThirdRecordId() {
        return thirdRecordId;
    }

    /**
     * 第三方记录ID
     * @param thirdRecordId 第三方记录ID
     */
    public void setThirdRecordId(Integer thirdRecordId) {
        this.thirdRecordId = thirdRecordId;
    }

    /**
     * 开发商名称
     * @return company 开发商名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 开发商名称
     * @param company 开发商名称
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 开发商可读名称
     * @return company_friendly 开发商可读名称
     */
    public String getCompanyFriendly() {
        return companyFriendly;
    }

    /**
     * 开发商可读名称
     * @param companyFriendly 开发商可读名称
     */
    public void setCompanyFriendly(String companyFriendly) {
        this.companyFriendly = companyFriendly == null ? null : companyFriendly.trim();
    }

    /**
     * 项目名称
     * @return program_name 项目名称
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * 项目名称
     * @param programName 项目名称
     */
    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    /**
     * 项目可读名称
     * @return program_name_friendly 项目可读名称
     */
    public String getProgramNameFriendly() {
        return programNameFriendly;
    }

    /**
     * 项目可读名称
     * @param programNameFriendly 项目可读名称
     */
    public void setProgramNameFriendly(String programNameFriendly) {
        this.programNameFriendly = programNameFriendly == null ? null : programNameFriendly.trim();
    }

    /**
     * 项目地址
     * @return program_localtion 项目地址
     */
    public String getProgramLocaltion() {
        return programLocaltion;
    }

    /**
     * 项目地址
     * @param programLocaltion 项目地址
     */
    public void setProgramLocaltion(String programLocaltion) {
        this.programLocaltion = programLocaltion == null ? null : programLocaltion.trim();
    }

    /**
     * 友好的项目地址
     * @return program_localtion_friendly 友好的项目地址
     */
    public String getProgramLocaltionFriendly() {
        return programLocaltionFriendly;
    }

    /**
     * 友好的项目地址
     * @param programLocaltionFriendly 友好的项目地址
     */
    public void setProgramLocaltionFriendly(String programLocaltionFriendly) {
        this.programLocaltionFriendly = programLocaltionFriendly == null ? null : programLocaltionFriendly.trim();
    }

    /**
     * 项目描述
     * @return program_description 项目描述
     */
    public String getProgramDescription() {
        return programDescription;
    }

    /**
     * 项目描述
     * @param programDescription 项目描述
     */
    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription == null ? null : programDescription.trim();
    }

    /**
     * 所在区域
     * @return district 所在区域
     */
    public DistrictEnum getDistrict() {
        return district;
    }

    /**
     * 所在区域
     * @param district 所在区域
     */
    public void setDistrict(DistrictEnum district) {
        this.district = district;
    }

    /**
     * 商品房栋数
     * @return build_count 商品房栋数
     */
    public Integer getBuildCount() {
        return buildCount;
    }

    /**
     * 商品房栋数
     * @param buildCount 商品房栋数
     */
    public void setBuildCount(Integer buildCount) {
        this.buildCount = buildCount;
    }

    /**
     * 开盘日期
     * @return sales_date 开盘日期
     */
    public Date getSalesDate() {
        return salesDate;
    }

    /**
     * 开盘日期
     * @param salesDate 开盘日期
     */
    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 数据状态1-正常，0-位置，-1已删除
     * @return data_status 数据状态1-正常，0-位置，-1已删除
     */
    public DataStatus getDataStatus() {
        return dataStatus;
    }

    /**
     * 数据状态1-正常，0-位置，-1已删除
     * @param dataStatus 数据状态1-正常，0-位置，-1已删除
     */
    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }

    /**
     * 创建人
     * @return create_user_id 创建人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人
     * @param createUserId 创建人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 修改人
     * @return update_user_id 修改人
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 修改人
     * @param updateUserId 修改人
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
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
}