package com.hanson.manager.dao.gen.entity;

import com.hanson.base.enums.DataStatus;
import com.hanson.manager.enums.BuildingStatusEnum;
import com.hanson.manager.enums.BuildingTechEnum;
import com.hanson.manager.enums.BuildingTypeEnum;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYFCBuildingExample {
    /**
     * tb_syfc_building
     */
    protected String orderByClause;

    /**
     * tb_syfc_building
     */
    protected boolean distinct;

    /**
     * tb_syfc_building
     */
    protected List<Criteria> oredCriteria;

    public SYFCBuildingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * tb_syfc_building 2019-04-28
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdIsNull() {
            addCriterion("third_build_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdIsNotNull() {
            addCriterion("third_build_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdEqualTo(Integer value) {
            addCriterion("third_build_id =", value, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdNotEqualTo(Integer value) {
            addCriterion("third_build_id <>", value, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdGreaterThan(Integer value) {
            addCriterion("third_build_id >", value, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_build_id >=", value, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdLessThan(Integer value) {
            addCriterion("third_build_id <", value, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_build_id <=", value, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdIn(List<Integer> values) {
            addCriterion("third_build_id in", values, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdNotIn(List<Integer> values) {
            addCriterion("third_build_id not in", values, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdBetween(Integer value1, Integer value2) {
            addCriterion("third_build_id between", value1, value2, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andThirdBuildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_build_id not between", value1, value2, "thirdBuildId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(Integer value) {
            addCriterion("community_id =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(Integer value) {
            addCriterion("community_id <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(Integer value) {
            addCriterion("community_id >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("community_id >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(Integer value) {
            addCriterion("community_id <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(Integer value) {
            addCriterion("community_id <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<Integer> values) {
            addCriterion("community_id in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<Integer> values) {
            addCriterion("community_id not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(Integer value1, Integer value2) {
            addCriterion("community_id between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("community_id not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionIsNull() {
            addCriterion("building_localtion is null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionIsNotNull() {
            addCriterion("building_localtion is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionEqualTo(String value) {
            addCriterion("building_localtion =", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionNotEqualTo(String value) {
            addCriterion("building_localtion <>", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionGreaterThan(String value) {
            addCriterion("building_localtion >", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionGreaterThanOrEqualTo(String value) {
            addCriterion("building_localtion >=", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionLessThan(String value) {
            addCriterion("building_localtion <", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionLessThanOrEqualTo(String value) {
            addCriterion("building_localtion <=", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionLike(String value) {
            addCriterion("building_localtion like", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionNotLike(String value) {
            addCriterion("building_localtion not like", value, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionIn(List<String> values) {
            addCriterion("building_localtion in", values, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionNotIn(List<String> values) {
            addCriterion("building_localtion not in", values, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionBetween(String value1, String value2) {
            addCriterion("building_localtion between", value1, value2, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingLocaltionNotBetween(String value1, String value2) {
            addCriterion("building_localtion not between", value1, value2, "buildingLocaltion");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNull() {
            addCriterion("building_num is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNotNull() {
            addCriterion("building_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumEqualTo(String value) {
            addCriterion("building_num =", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotEqualTo(String value) {
            addCriterion("building_num <>", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThan(String value) {
            addCriterion("building_num >", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThanOrEqualTo(String value) {
            addCriterion("building_num >=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThan(String value) {
            addCriterion("building_num <", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThanOrEqualTo(String value) {
            addCriterion("building_num <=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLike(String value) {
            addCriterion("building_num like", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotLike(String value) {
            addCriterion("building_num not like", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIn(List<String> values) {
            addCriterion("building_num in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotIn(List<String> values) {
            addCriterion("building_num not in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumBetween(String value1, String value2) {
            addCriterion("building_num between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotBetween(String value1, String value2) {
            addCriterion("building_num not between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumIsNull() {
            addCriterion("sales_num is null");
            return (Criteria) this;
        }

        public Criteria andSalesNumIsNotNull() {
            addCriterion("sales_num is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNumEqualTo(String value) {
            addCriterion("sales_num =", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotEqualTo(String value) {
            addCriterion("sales_num <>", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumGreaterThan(String value) {
            addCriterion("sales_num >", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumGreaterThanOrEqualTo(String value) {
            addCriterion("sales_num >=", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLessThan(String value) {
            addCriterion("sales_num <", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLessThanOrEqualTo(String value) {
            addCriterion("sales_num <=", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLike(String value) {
            addCriterion("sales_num like", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotLike(String value) {
            addCriterion("sales_num not like", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumIn(List<String> values) {
            addCriterion("sales_num in", values, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotIn(List<String> values) {
            addCriterion("sales_num not in", values, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumBetween(String value1, String value2) {
            addCriterion("sales_num between", value1, value2, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotBetween(String value1, String value2) {
            addCriterion("sales_num not between", value1, value2, "salesNum");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNull() {
            addCriterion("approve_date is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("approve_date is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(Date value) {
            addCriterion("approve_date =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterion("approve_date <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterion("approve_date >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("approve_date >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterion("approve_date <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("approve_date <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterion("approve_date in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterion("approve_date not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterion("approve_date between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("approve_date not between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andTopTierIsNull() {
            addCriterion("top_tier is null");
            return (Criteria) this;
        }

        public Criteria andTopTierIsNotNull() {
            addCriterion("top_tier is not null");
            return (Criteria) this;
        }

        public Criteria andTopTierEqualTo(Integer value) {
            addCriterion("top_tier =", value, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierNotEqualTo(Integer value) {
            addCriterion("top_tier <>", value, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierGreaterThan(Integer value) {
            addCriterion("top_tier >", value, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_tier >=", value, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierLessThan(Integer value) {
            addCriterion("top_tier <", value, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierLessThanOrEqualTo(Integer value) {
            addCriterion("top_tier <=", value, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierIn(List<Integer> values) {
            addCriterion("top_tier in", values, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierNotIn(List<Integer> values) {
            addCriterion("top_tier not in", values, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierBetween(Integer value1, Integer value2) {
            addCriterion("top_tier between", value1, value2, "topTier");
            return (Criteria) this;
        }

        public Criteria andTopTierNotBetween(Integer value1, Integer value2) {
            addCriterion("top_tier not between", value1, value2, "topTier");
            return (Criteria) this;
        }

        public Criteria andBuildingTechIsNull() {
            addCriterion("building_tech is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTechIsNotNull() {
            addCriterion("building_tech is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTechEqualTo(BuildingTechEnum value) {
            addCriterion("building_tech =", value, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechNotEqualTo(BuildingTechEnum value) {
            addCriterion("building_tech <>", value, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechGreaterThan(BuildingTechEnum value) {
            addCriterion("building_tech >", value, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechGreaterThanOrEqualTo(BuildingTechEnum value) {
            addCriterion("building_tech >=", value, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechLessThan(BuildingTechEnum value) {
            addCriterion("building_tech <", value, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechLessThanOrEqualTo(BuildingTechEnum value) {
            addCriterion("building_tech <=", value, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechIn(List<BuildingTechEnum> values) {
            addCriterion("building_tech in", values, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechNotIn(List<BuildingTechEnum> values) {
            addCriterion("building_tech not in", values, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechBetween(BuildingTechEnum value1, BuildingTechEnum value2) {
            addCriterion("building_tech between", value1, value2, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTechNotBetween(BuildingTechEnum value1, BuildingTechEnum value2) {
            addCriterion("building_tech not between", value1, value2, "buildingTech");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNull() {
            addCriterion("building_type is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNotNull() {
            addCriterion("building_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeEqualTo(BuildingTypeEnum value) {
            addCriterion("building_type =", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotEqualTo(BuildingTypeEnum value) {
            addCriterion("building_type <>", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThan(BuildingTypeEnum value) {
            addCriterion("building_type >", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThanOrEqualTo(BuildingTypeEnum value) {
            addCriterion("building_type >=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThan(BuildingTypeEnum value) {
            addCriterion("building_type <", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThanOrEqualTo(BuildingTypeEnum value) {
            addCriterion("building_type <=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIn(List<BuildingTypeEnum> values) {
            addCriterion("building_type in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotIn(List<BuildingTypeEnum> values) {
            addCriterion("building_type not in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeBetween(BuildingTypeEnum value1, BuildingTypeEnum value2) {
            addCriterion("building_type between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotBetween(BuildingTypeEnum value1, BuildingTypeEnum value2) {
            addCriterion("building_type not between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusIsNull() {
            addCriterion("building_status is null");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusIsNotNull() {
            addCriterion("building_status is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusEqualTo(BuildingStatusEnum value) {
            addCriterion("building_status =", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotEqualTo(BuildingStatusEnum value) {
            addCriterion("building_status <>", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusGreaterThan(BuildingStatusEnum value) {
            addCriterion("building_status >", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusGreaterThanOrEqualTo(BuildingStatusEnum value) {
            addCriterion("building_status >=", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusLessThan(BuildingStatusEnum value) {
            addCriterion("building_status <", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusLessThanOrEqualTo(BuildingStatusEnum value) {
            addCriterion("building_status <=", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusIn(List<BuildingStatusEnum> values) {
            addCriterion("building_status in", values, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotIn(List<BuildingStatusEnum> values) {
            addCriterion("building_status not in", values, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusBetween(BuildingStatusEnum value1, BuildingStatusEnum value2) {
            addCriterion("building_status between", value1, value2, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotBetween(BuildingStatusEnum value1, BuildingStatusEnum value2) {
            addCriterion("building_status not between", value1, value2, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceEqualTo(BigDecimal value) {
            addCriterion("avg_price =", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotEqualTo(BigDecimal value) {
            addCriterion("avg_price <>", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThan(BigDecimal value) {
            addCriterion("avg_price >", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_price >=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThan(BigDecimal value) {
            addCriterion("avg_price <", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_price <=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIn(List<BigDecimal> values) {
            addCriterion("avg_price in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotIn(List<BigDecimal> values) {
            addCriterion("avg_price not in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_price between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_price not between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(BigDecimal value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(BigDecimal value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(BigDecimal value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<BigDecimal> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNull() {
            addCriterion("max_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNotNull() {
            addCriterion("max_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceEqualTo(BigDecimal value) {
            addCriterion("max_price =", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("max_price <>", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThan(BigDecimal value) {
            addCriterion("max_price >", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price >=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThan(BigDecimal value) {
            addCriterion("max_price <", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price <=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIn(List<BigDecimal> values) {
            addCriterion("max_price in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("max_price not in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price not between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionIsNull() {
            addCriterion("program_description is null");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionIsNotNull() {
            addCriterion("program_description is not null");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionEqualTo(String value) {
            addCriterion("program_description =", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionNotEqualTo(String value) {
            addCriterion("program_description <>", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionGreaterThan(String value) {
            addCriterion("program_description >", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("program_description >=", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionLessThan(String value) {
            addCriterion("program_description <", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionLessThanOrEqualTo(String value) {
            addCriterion("program_description <=", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionLike(String value) {
            addCriterion("program_description like", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionNotLike(String value) {
            addCriterion("program_description not like", value, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionIn(List<String> values) {
            addCriterion("program_description in", values, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionNotIn(List<String> values) {
            addCriterion("program_description not in", values, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionBetween(String value1, String value2) {
            addCriterion("program_description between", value1, value2, "programDescription");
            return (Criteria) this;
        }

        public Criteria andProgramDescriptionNotBetween(String value1, String value2) {
            addCriterion("program_description not between", value1, value2, "programDescription");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(DataStatus value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(DataStatus value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(DataStatus value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(DataStatus value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(DataStatus value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(DataStatus value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<DataStatus> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<DataStatus> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(DataStatus value1, DataStatus value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(DataStatus value1, DataStatus value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Integer value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Integer value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Integer value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Integer value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Integer> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Integer> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * tb_syfc_building
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_syfc_building 2019-04-28
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}