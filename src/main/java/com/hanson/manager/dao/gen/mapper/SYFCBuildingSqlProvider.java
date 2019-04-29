package com.hanson.manager.dao.gen.mapper;

import com.hanson.manager.dao.gen.entity.SYFCBuilding;
import com.hanson.manager.dao.gen.entity.SYFCBuildingExample.Criteria;
import com.hanson.manager.dao.gen.entity.SYFCBuildingExample.Criterion;
import com.hanson.manager.dao.gen.entity.SYFCBuildingExample;
import java.util.List;
import org.apache.ibatis.jdbc.SQL;

public class SYFCBuildingSqlProvider {

    public String insertSelective(SYFCBuilding record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_syfc_building");
        
        if (record.getThirdBuildId() != null) {
            sql.VALUES("third_build_id", "#{thirdBuildId,jdbcType=INTEGER}");
        }
        
        if (record.getCommunityId() != null) {
            sql.VALUES("community_id", "#{communityId,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingLocaltion() != null) {
            sql.VALUES("building_localtion", "#{buildingLocaltion,jdbcType=VARCHAR}");
        }
        
        if (record.getBuildingNum() != null) {
            sql.VALUES("building_num", "#{buildingNum,jdbcType=VARCHAR}");
        }
        
        if (record.getSalesNum() != null) {
            sql.VALUES("sales_num", "#{salesNum,jdbcType=VARCHAR}");
        }
        
        if (record.getApproveDate() != null) {
            sql.VALUES("approve_date", "#{approveDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTopTier() != null) {
            sql.VALUES("top_tier", "#{topTier,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingTech() != null) {
            sql.VALUES("building_tech", "#{buildingTech,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingType() != null) {
            sql.VALUES("building_type", "#{buildingType,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingStatus() != null) {
            sql.VALUES("building_status", "#{buildingStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAvgPrice() != null) {
            sql.VALUES("avg_price", "#{avgPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMinPrice() != null) {
            sql.VALUES("min_price", "#{minPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxPrice() != null) {
            sql.VALUES("max_price", "#{maxPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getProgramDescription() != null) {
            sql.VALUES("program_description", "#{programDescription,jdbcType=VARCHAR}");
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

    public String selectByExample(SYFCBuildingExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("third_build_id");
        sql.SELECT("community_id");
        sql.SELECT("building_localtion");
        sql.SELECT("building_num");
        sql.SELECT("sales_num");
        sql.SELECT("approve_date");
        sql.SELECT("top_tier");
        sql.SELECT("building_tech");
        sql.SELECT("building_type");
        sql.SELECT("building_status");
        sql.SELECT("avg_price");
        sql.SELECT("min_price");
        sql.SELECT("max_price");
        sql.SELECT("program_description");
        sql.SELECT("remark");
        sql.SELECT("data_status");
        sql.SELECT("create_user_id");
        sql.SELECT("update_user_id");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("tb_syfc_building");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SYFCBuilding record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_syfc_building");
        
        if (record.getThirdBuildId() != null) {
            sql.SET("third_build_id = #{thirdBuildId,jdbcType=INTEGER}");
        }
        
        if (record.getCommunityId() != null) {
            sql.SET("community_id = #{communityId,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingLocaltion() != null) {
            sql.SET("building_localtion = #{buildingLocaltion,jdbcType=VARCHAR}");
        }
        
        if (record.getBuildingNum() != null) {
            sql.SET("building_num = #{buildingNum,jdbcType=VARCHAR}");
        }
        
        if (record.getSalesNum() != null) {
            sql.SET("sales_num = #{salesNum,jdbcType=VARCHAR}");
        }
        
        if (record.getApproveDate() != null) {
            sql.SET("approve_date = #{approveDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTopTier() != null) {
            sql.SET("top_tier = #{topTier,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingTech() != null) {
            sql.SET("building_tech = #{buildingTech,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingType() != null) {
            sql.SET("building_type = #{buildingType,jdbcType=INTEGER}");
        }
        
        if (record.getBuildingStatus() != null) {
            sql.SET("building_status = #{buildingStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAvgPrice() != null) {
            sql.SET("avg_price = #{avgPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMinPrice() != null) {
            sql.SET("min_price = #{minPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxPrice() != null) {
            sql.SET("max_price = #{maxPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getProgramDescription() != null) {
            sql.SET("program_description = #{programDescription,jdbcType=VARCHAR}");
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

    protected void applyWhere(SQL sql, SYFCBuildingExample example, boolean includeExamplePhrase) {
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