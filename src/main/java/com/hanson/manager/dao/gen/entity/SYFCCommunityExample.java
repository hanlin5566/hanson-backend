package com.hanson.manager.dao.gen.entity;

import com.hanson.base.enums.DataStatus;
import com.hanson.manager.enums.DistrictEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYFCCommunityExample {
    /**
     * tb_syfc_community
     */
    protected String orderByClause;

    /**
     * tb_syfc_community
     */
    protected boolean distinct;

    /**
     * tb_syfc_community
     */
    protected List<Criteria> oredCriteria;

    public SYFCCommunityExample() {
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
     * tb_syfc_community 2019-04-28
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

        public Criteria andThirdRecordIdIsNull() {
            addCriterion("third_record_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdIsNotNull() {
            addCriterion("third_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdEqualTo(Integer value) {
            addCriterion("third_record_id =", value, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdNotEqualTo(Integer value) {
            addCriterion("third_record_id <>", value, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdGreaterThan(Integer value) {
            addCriterion("third_record_id >", value, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_record_id >=", value, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdLessThan(Integer value) {
            addCriterion("third_record_id <", value, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_record_id <=", value, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdIn(List<Integer> values) {
            addCriterion("third_record_id in", values, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdNotIn(List<Integer> values) {
            addCriterion("third_record_id not in", values, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("third_record_id between", value1, value2, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andThirdRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_record_id not between", value1, value2, "thirdRecordId");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyIsNull() {
            addCriterion("company_friendly is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyIsNotNull() {
            addCriterion("company_friendly is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyEqualTo(String value) {
            addCriterion("company_friendly =", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyNotEqualTo(String value) {
            addCriterion("company_friendly <>", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyGreaterThan(String value) {
            addCriterion("company_friendly >", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyGreaterThanOrEqualTo(String value) {
            addCriterion("company_friendly >=", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyLessThan(String value) {
            addCriterion("company_friendly <", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyLessThanOrEqualTo(String value) {
            addCriterion("company_friendly <=", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyLike(String value) {
            addCriterion("company_friendly like", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyNotLike(String value) {
            addCriterion("company_friendly not like", value, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyIn(List<String> values) {
            addCriterion("company_friendly in", values, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyNotIn(List<String> values) {
            addCriterion("company_friendly not in", values, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyBetween(String value1, String value2) {
            addCriterion("company_friendly between", value1, value2, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andCompanyFriendlyNotBetween(String value1, String value2) {
            addCriterion("company_friendly not between", value1, value2, "companyFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNull() {
            addCriterion("program_name is null");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNotNull() {
            addCriterion("program_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgramNameEqualTo(String value) {
            addCriterion("program_name =", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotEqualTo(String value) {
            addCriterion("program_name <>", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThan(String value) {
            addCriterion("program_name >", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThanOrEqualTo(String value) {
            addCriterion("program_name >=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThan(String value) {
            addCriterion("program_name <", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThanOrEqualTo(String value) {
            addCriterion("program_name <=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLike(String value) {
            addCriterion("program_name like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotLike(String value) {
            addCriterion("program_name not like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameIn(List<String> values) {
            addCriterion("program_name in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotIn(List<String> values) {
            addCriterion("program_name not in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameBetween(String value1, String value2) {
            addCriterion("program_name between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotBetween(String value1, String value2) {
            addCriterion("program_name not between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyIsNull() {
            addCriterion("program_name_friendly is null");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyIsNotNull() {
            addCriterion("program_name_friendly is not null");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyEqualTo(String value) {
            addCriterion("program_name_friendly =", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyNotEqualTo(String value) {
            addCriterion("program_name_friendly <>", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyGreaterThan(String value) {
            addCriterion("program_name_friendly >", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyGreaterThanOrEqualTo(String value) {
            addCriterion("program_name_friendly >=", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyLessThan(String value) {
            addCriterion("program_name_friendly <", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyLessThanOrEqualTo(String value) {
            addCriterion("program_name_friendly <=", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyLike(String value) {
            addCriterion("program_name_friendly like", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyNotLike(String value) {
            addCriterion("program_name_friendly not like", value, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyIn(List<String> values) {
            addCriterion("program_name_friendly in", values, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyNotIn(List<String> values) {
            addCriterion("program_name_friendly not in", values, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyBetween(String value1, String value2) {
            addCriterion("program_name_friendly between", value1, value2, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramNameFriendlyNotBetween(String value1, String value2) {
            addCriterion("program_name_friendly not between", value1, value2, "programNameFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionIsNull() {
            addCriterion("program_localtion is null");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionIsNotNull() {
            addCriterion("program_localtion is not null");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionEqualTo(String value) {
            addCriterion("program_localtion =", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionNotEqualTo(String value) {
            addCriterion("program_localtion <>", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionGreaterThan(String value) {
            addCriterion("program_localtion >", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionGreaterThanOrEqualTo(String value) {
            addCriterion("program_localtion >=", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionLessThan(String value) {
            addCriterion("program_localtion <", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionLessThanOrEqualTo(String value) {
            addCriterion("program_localtion <=", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionLike(String value) {
            addCriterion("program_localtion like", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionNotLike(String value) {
            addCriterion("program_localtion not like", value, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionIn(List<String> values) {
            addCriterion("program_localtion in", values, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionNotIn(List<String> values) {
            addCriterion("program_localtion not in", values, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionBetween(String value1, String value2) {
            addCriterion("program_localtion between", value1, value2, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionNotBetween(String value1, String value2) {
            addCriterion("program_localtion not between", value1, value2, "programLocaltion");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyIsNull() {
            addCriterion("program_localtion_friendly is null");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyIsNotNull() {
            addCriterion("program_localtion_friendly is not null");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyEqualTo(String value) {
            addCriterion("program_localtion_friendly =", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyNotEqualTo(String value) {
            addCriterion("program_localtion_friendly <>", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyGreaterThan(String value) {
            addCriterion("program_localtion_friendly >", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyGreaterThanOrEqualTo(String value) {
            addCriterion("program_localtion_friendly >=", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyLessThan(String value) {
            addCriterion("program_localtion_friendly <", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyLessThanOrEqualTo(String value) {
            addCriterion("program_localtion_friendly <=", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyLike(String value) {
            addCriterion("program_localtion_friendly like", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyNotLike(String value) {
            addCriterion("program_localtion_friendly not like", value, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyIn(List<String> values) {
            addCriterion("program_localtion_friendly in", values, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyNotIn(List<String> values) {
            addCriterion("program_localtion_friendly not in", values, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyBetween(String value1, String value2) {
            addCriterion("program_localtion_friendly between", value1, value2, "programLocaltionFriendly");
            return (Criteria) this;
        }

        public Criteria andProgramLocaltionFriendlyNotBetween(String value1, String value2) {
            addCriterion("program_localtion_friendly not between", value1, value2, "programLocaltionFriendly");
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

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(DistrictEnum value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(DistrictEnum value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(DistrictEnum value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(DistrictEnum value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(DistrictEnum value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(DistrictEnum value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<DistrictEnum> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<DistrictEnum> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(DistrictEnum value1, DistrictEnum value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(DistrictEnum value1, DistrictEnum value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andBuildCountIsNull() {
            addCriterion("build_count is null");
            return (Criteria) this;
        }

        public Criteria andBuildCountIsNotNull() {
            addCriterion("build_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuildCountEqualTo(Integer value) {
            addCriterion("build_count =", value, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountNotEqualTo(Integer value) {
            addCriterion("build_count <>", value, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountGreaterThan(Integer value) {
            addCriterion("build_count >", value, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_count >=", value, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountLessThan(Integer value) {
            addCriterion("build_count <", value, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountLessThanOrEqualTo(Integer value) {
            addCriterion("build_count <=", value, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountIn(List<Integer> values) {
            addCriterion("build_count in", values, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountNotIn(List<Integer> values) {
            addCriterion("build_count not in", values, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountBetween(Integer value1, Integer value2) {
            addCriterion("build_count between", value1, value2, "buildCount");
            return (Criteria) this;
        }

        public Criteria andBuildCountNotBetween(Integer value1, Integer value2) {
            addCriterion("build_count not between", value1, value2, "buildCount");
            return (Criteria) this;
        }

        public Criteria andSalesDateIsNull() {
            addCriterion("sales_date is null");
            return (Criteria) this;
        }

        public Criteria andSalesDateIsNotNull() {
            addCriterion("sales_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDateEqualTo(Date value) {
            addCriterion("sales_date =", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateNotEqualTo(Date value) {
            addCriterion("sales_date <>", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateGreaterThan(Date value) {
            addCriterion("sales_date >", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_date >=", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateLessThan(Date value) {
            addCriterion("sales_date <", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateLessThanOrEqualTo(Date value) {
            addCriterion("sales_date <=", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateIn(List<Date> values) {
            addCriterion("sales_date in", values, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateNotIn(List<Date> values) {
            addCriterion("sales_date not in", values, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateBetween(Date value1, Date value2) {
            addCriterion("sales_date between", value1, value2, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateNotBetween(Date value1, Date value2) {
            addCriterion("sales_date not between", value1, value2, "salesDate");
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
     * tb_syfc_community
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_syfc_community 2019-04-28
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