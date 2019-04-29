package com.hanson.manager.dao.gen.entity;

import com.hanson.base.enums.DataStatus;
import com.hanson.manager.enums.BuildingStatusEnum;
import com.hanson.manager.enums.BuildingTechEnum;
import com.hanson.manager.enums.BuildingTypeEnum;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hanson.base.annotation.AutoWriteParam;
import com.hanson.base.mybatis.serializer.DatePattern;
import com.hanson.base.serializer.EnumJsonSerializer;
/**
 * tb_syfc_building 楼栋信息
 * @author huhanlin 2019-04-28
 */
@AutoWriteParam
public class SYFCBuilding {
    /**
     * 主鍵
     */
    private Integer id;

    /**
     * 第三方建筑ID->syfc_new_build_detail.build_detail_list.third_record_id
     */
    private Integer thirdBuildId;

    /**
     * 楼盘ID，父ID
     */
    private Integer communityId;

    /**
     * 楼栋地址
     */
    private String buildingLocaltion;

    /**
     * 楼栋号
     */
    private String buildingNum;

    /**
     * 预售许可证
     */
    private String salesNum;

    /**
     * 审批日期
     */
    @DateTimeFormat(pattern = DatePattern.ISO_DATE)
    @JsonFormat(pattern = DatePattern.ISO_DATE_TIME,timezone = DatePattern.TIME_ZONE)
    private Date approveDate;

    /**
     * 顶层
     */
    private Integer topTier;

    /**
     * 建筑工艺1、塔楼，2、板楼、3、其他，0未知
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private BuildingTechEnum buildingTech;

    /**
     * 建筑类型1、商业，2、住宅、3.公建、4.其他、0未知
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private BuildingTypeEnum buildingType;

    /**
     * 楼栋状态:1-正常，0-未知，-1已删除
     */
    @JsonSerialize(using = EnumJsonSerializer.class)
    private BuildingStatusEnum buildingStatus;

    /**
     * 均价
     */
    private BigDecimal avgPrice;

    /**
     * 最低价
     */
    private BigDecimal minPrice;

    /**
     * 最高价
     */
    private BigDecimal maxPrice;

    /**
     * 楼栋描述
     */
    private String programDescription;

    /**
     * 备注
     */
    private String remark;

    /**
     * 数据状态1-正常，0-未知，-1已删除
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
     * 第三方建筑ID->syfc_new_build_detail.build_detail_list.third_record_id
     * @return third_build_id 第三方建筑ID->syfc_new_build_detail.build_detail_list.third_record_id
     */
    public Integer getThirdBuildId() {
        return thirdBuildId;
    }

    /**
     * 第三方建筑ID->syfc_new_build_detail.build_detail_list.third_record_id
     * @param thirdBuildId 第三方建筑ID->syfc_new_build_detail.build_detail_list.third_record_id
     */
    public void setThirdBuildId(Integer thirdBuildId) {
        this.thirdBuildId = thirdBuildId;
    }

    /**
     * 楼盘ID，父ID
     * @return community_id 楼盘ID，父ID
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * 楼盘ID，父ID
     * @param communityId 楼盘ID，父ID
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * 楼栋地址
     * @return building_localtion 楼栋地址
     */
    public String getBuildingLocaltion() {
        return buildingLocaltion;
    }

    /**
     * 楼栋地址
     * @param buildingLocaltion 楼栋地址
     */
    public void setBuildingLocaltion(String buildingLocaltion) {
        this.buildingLocaltion = buildingLocaltion == null ? null : buildingLocaltion.trim();
    }

    /**
     * 楼栋号
     * @return building_num 楼栋号
     */
    public String getBuildingNum() {
        return buildingNum;
    }

    /**
     * 楼栋号
     * @param buildingNum 楼栋号
     */
    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum == null ? null : buildingNum.trim();
    }

    /**
     * 预售许可证
     * @return sales_num 预售许可证
     */
    public String getSalesNum() {
        return salesNum;
    }

    /**
     * 预售许可证
     * @param salesNum 预售许可证
     */
    public void setSalesNum(String salesNum) {
        this.salesNum = salesNum == null ? null : salesNum.trim();
    }

    /**
     * 审批日期
     * @return approve_date 审批日期
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * 审批日期
     * @param approveDate 审批日期
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    /**
     * 顶层
     * @return top_tier 顶层
     */
    public Integer getTopTier() {
        return topTier;
    }

    /**
     * 顶层
     * @param topTier 顶层
     */
    public void setTopTier(Integer topTier) {
        this.topTier = topTier;
    }

    /**
     * 建筑工艺1、塔楼，2、板楼、3、其他，0未知
     * @return building_tech 建筑工艺1、塔楼，2、板楼、3、其他，0未知
     */
    public BuildingTechEnum getBuildingTech() {
        return buildingTech;
    }

    /**
     * 建筑工艺1、塔楼，2、板楼、3、其他，0未知
     * @param buildingTech 建筑工艺1、塔楼，2、板楼、3、其他，0未知
     */
    public void setBuildingTech(BuildingTechEnum buildingTech) {
        this.buildingTech = buildingTech;
    }

    /**
     * 建筑类型1、商业，2、住宅、3.公建、4.其他、0未知
     * @return building_type 建筑类型1、商业，2、住宅、3.公建、4.其他、0未知
     */
    public BuildingTypeEnum getBuildingType() {
        return buildingType;
    }

    /**
     * 建筑类型1、商业，2、住宅、3.公建、4.其他、0未知
     * @param buildingType 建筑类型1、商业，2、住宅、3.公建、4.其他、0未知
     */
    public void setBuildingType(BuildingTypeEnum buildingType) {
        this.buildingType = buildingType;
    }

    /**
     * 楼栋状态:1-正常，0-未知，-1已删除
     * @return building_status 楼栋状态:1-正常，0-未知，-1已删除
     */
    public BuildingStatusEnum getBuildingStatus() {
        return buildingStatus;
    }

    /**
     * 楼栋状态:1-正常，0-未知，-1已删除
     * @param buildingStatus 楼栋状态:1-正常，0-未知，-1已删除
     */
    public void setBuildingStatus(BuildingStatusEnum buildingStatus) {
        this.buildingStatus = buildingStatus;
    }

    /**
     * 均价
     * @return avg_price 均价
     */
    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    /**
     * 均价
     * @param avgPrice 均价
     */
    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
    }

    /**
     * 最低价
     * @return min_price 最低价
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * 最低价
     * @param minPrice 最低价
     */
    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * 最高价
     * @return max_price 最高价
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * 最高价
     * @param maxPrice 最高价
     */
    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * 楼栋描述
     * @return program_description 楼栋描述
     */
    public String getProgramDescription() {
        return programDescription;
    }

    /**
     * 楼栋描述
     * @param programDescription 楼栋描述
     */
    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription == null ? null : programDescription.trim();
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
     * 数据状态1-正常，0-未知，-1已删除
     * @return data_status 数据状态1-正常，0-未知，-1已删除
     */
    public DataStatus getDataStatus() {
        return dataStatus;
    }

    /**
     * 数据状态1-正常，0-未知，-1已删除
     * @param dataStatus 数据状态1-正常，0-未知，-1已删除
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