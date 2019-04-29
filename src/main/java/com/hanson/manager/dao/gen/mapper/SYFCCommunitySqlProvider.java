package com.hanson.manager.dao.gen.mapper;

import com.hanson.manager.dao.gen.entity.SYFCCommunity;
import com.hanson.manager.dao.gen.entity.SYFCCommunityExample.Criteria;
import com.hanson.manager.dao.gen.entity.SYFCCommunityExample.Criterion;
import com.hanson.manager.dao.gen.entity.SYFCCommunityExample;
import java.util.List;
import org.apache.ibatis.jdbc.SQL;

public class SYFCCommunitySqlProvider {

    public String insertSelective(SYFCCommunity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_syfc_community");
        
        if (record.getThirdRecordId() != null) {
            sql.VALUES("third_record_id", "#{thirdRecordId,jdbcType=INTEGER}");
        }
        
        if (record.getCompany() != null) {
            sql.VALUES("company", "#{company,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyFriendly() != null) {
            sql.VALUES("company_friendly", "#{companyFriendly,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramName() != null) {
            sql.VALUES("program_name", "#{programName,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramNameFriendly() != null) {
            sql.VALUES("program_name_friendly", "#{programNameFriendly,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramLocaltion() != null) {
            sql.VALUES("program_localtion", "#{programLocaltion,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramLocaltionFriendly() != null) {
            sql.VALUES("program_localtion_friendly", "#{programLocaltionFriendly,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramDescription() != null) {
            sql.VALUES("program_description", "#{programDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrict() != null) {
            sql.VALUES("district", "#{district,jdbcType=INTEGER}");
        }
        
        if (record.getBuildCount() != null) {
            sql.VALUES("build_count", "#{buildCount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesDate() != null) {
            sql.VALUES("sales_date", "#{salesDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getDataStatus() != null) {
            sql.VALUES("data_status", "#{dataStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateUserId() != null) {
            sql.VALUES("create_user_id", "#{createUserId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateUserId() != null) {
            sql.VALUES("update_user_id", "#{updateUserId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SYFCCommunityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("third_record_id");
        sql.SELECT("company");
        sql.SELECT("company_friendly");
        sql.SELECT("program_name");
        sql.SELECT("program_name_friendly");
        sql.SELECT("program_localtion");
        sql.SELECT("program_localtion_friendly");
        sql.SELECT("program_description");
        sql.SELECT("district");
        sql.SELECT("build_count");
        sql.SELECT("sales_date");
        sql.SELECT("remark");
        sql.SELECT("data_status");
        sql.SELECT("create_user_id");
        sql.SELECT("update_user_id");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("tb_syfc_community");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SYFCCommunity record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_syfc_community");
        
        if (record.getThirdRecordId() != null) {
            sql.SET("third_record_id = #{thirdRecordId,jdbcType=INTEGER}");
        }
        
        if (record.getCompany() != null) {
            sql.SET("company = #{company,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyFriendly() != null) {
            sql.SET("company_friendly = #{companyFriendly,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramName() != null) {
            sql.SET("program_name = #{programName,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramNameFriendly() != null) {
            sql.SET("program_name_friendly = #{programNameFriendly,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramLocaltion() != null) {
            sql.SET("program_localtion = #{programLocaltion,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramLocaltionFriendly() != null) {
            sql.SET("program_localtion_friendly = #{programLocaltionFriendly,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramDescription() != null) {
            sql.SET("program_description = #{programDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrict() != null) {
            sql.SET("district = #{district,jdbcType=INTEGER}");
        }
        
        if (record.getBuildCount() != null) {
            sql.SET("build_count = #{buildCount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesDate() != null) {
            sql.SET("sales_date = #{salesDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getDataStatus() != null) {
            sql.SET("data_status = #{dataStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateUserId() != null) {
            sql.SET("create_user_id = #{createUserId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateUserId() != null) {
            sql.SET("update_user_id = #{updateUserId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SYFCCommunityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}