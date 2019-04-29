package com.hanson.manager.dao.gen.mapper;

import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.dao.gen.entity.SystemUserExample.Criteria;
import com.hanson.manager.dao.gen.entity.SystemUserExample.Criterion;
import com.hanson.manager.dao.gen.entity.SystemUserExample;
import java.util.List;
import org.apache.ibatis.jdbc.SQL;

public class SystemUserSqlProvider {

    public String insertSelective(SystemUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_system_user");
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getNikeName() != null) {
            sql.VALUES("nike_name", "#{nikeName,jdbcType=VARCHAR}");
        }
        
        if (record.getApiName() != null) {
            sql.VALUES("api_name", "#{apiName,jdbcType=VARCHAR}");
        }
        
        if (record.getApiPwd() != null) {
            sql.VALUES("api_pwd", "#{apiPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.VALUES("dept_id", "#{deptId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPwd() != null) {
            sql.VALUES("user_pwd", "#{userPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSalt() != null) {
            sql.VALUES("user_salt", "#{userSalt,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            sql.VALUES("user_email", "#{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTel() != null) {
            sql.VALUES("user_tel", "#{userTel,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.VALUES("user_address", "#{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.VALUES("user_phone", "#{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyCode() != null) {
            sql.VALUES("company_code", "#{companyCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateUid() != null) {
            sql.VALUES("create_uid", "#{createUid,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateUid() != null) {
            sql.VALUES("update_uid", "#{updateUid,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=DATE}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=DATE}");
        }
        
        if (record.getDataStatus() != null) {
            sql.VALUES("data_status", "#{dataStatus,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SystemUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("gender");
        sql.SELECT("user_name");
        sql.SELECT("nike_name");
        sql.SELECT("api_name");
        sql.SELECT("api_pwd");
        sql.SELECT("dept_id");
        sql.SELECT("user_pwd");
        sql.SELECT("user_salt");
        sql.SELECT("user_email");
        sql.SELECT("user_tel");
        sql.SELECT("user_address");
        sql.SELECT("user_phone");
        sql.SELECT("company_code");
        sql.SELECT("create_uid");
        sql.SELECT("update_uid");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("data_status");
        sql.FROM("tb_system_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SystemUser record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_system_user");
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getNikeName() != null) {
            sql.SET("nike_name = #{nikeName,jdbcType=VARCHAR}");
        }
        
        if (record.getApiName() != null) {
            sql.SET("api_name = #{apiName,jdbcType=VARCHAR}");
        }
        
        if (record.getApiPwd() != null) {
            sql.SET("api_pwd = #{apiPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{deptId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPwd() != null) {
            sql.SET("user_pwd = #{userPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSalt() != null) {
            sql.SET("user_salt = #{userSalt,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            sql.SET("user_email = #{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTel() != null) {
            sql.SET("user_tel = #{userTel,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.SET("user_phone = #{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyCode() != null) {
            sql.SET("company_code = #{companyCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateUid() != null) {
            sql.SET("create_uid = #{createUid,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateUid() != null) {
            sql.SET("update_uid = #{updateUid,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=DATE}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=DATE}");
        }
        
        if (record.getDataStatus() != null) {
            sql.SET("data_status = #{dataStatus,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SystemUserExample example, boolean includeExamplePhrase) {
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