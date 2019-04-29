package com.hanson.manager.dao.gen.mapper;

import com.hanson.manager.dao.gen.entity.SYFCCommunity;
import com.hanson.manager.dao.gen.entity.SYFCCommunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface SYFCCommunityMapper {
    @Delete({
        "delete from tb_syfc_community",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_syfc_community (third_record_id, company, ",
        "company_friendly, program_name, ",
        "program_name_friendly, program_localtion, ",
        "program_localtion_friendly, program_description, ",
        "district, build_count, ",
        "sales_date, remark, ",
        "data_status, create_user_id, ",
        "update_user_id, create_time, ",
        "update_time)",
        "values (#{thirdRecordId,jdbcType=INTEGER}, #{company,jdbcType=VARCHAR}, ",
        "#{companyFriendly,jdbcType=VARCHAR}, #{programName,jdbcType=VARCHAR}, ",
        "#{programNameFriendly,jdbcType=VARCHAR}, #{programLocaltion,jdbcType=VARCHAR}, ",
        "#{programLocaltionFriendly,jdbcType=VARCHAR}, #{programDescription,jdbcType=VARCHAR}, ",
        "#{district,jdbcType=INTEGER}, #{buildCount,jdbcType=INTEGER}, ",
        "#{salesDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{dataStatus,jdbcType=INTEGER}, #{createUserId,jdbcType=INTEGER}, ",
        "#{updateUserId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SYFCCommunity record);

    @InsertProvider(type=SYFCCommunitySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(SYFCCommunity record);

    @SelectProvider(type=SYFCCommunitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="third_record_id", property="thirdRecordId", jdbcType=JdbcType.INTEGER),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_friendly", property="companyFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name", property="programName", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name_friendly", property="programNameFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_localtion", property="programLocaltion", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_localtion_friendly", property="programLocaltionFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_description", property="programDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.INTEGER),
        @Result(column="build_count", property="buildCount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_date", property="salesDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SYFCCommunity> selectByExampleWithRowbounds(SYFCCommunityExample example, RowBounds rowBounds);

    @SelectProvider(type=SYFCCommunitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="third_record_id", property="thirdRecordId", jdbcType=JdbcType.INTEGER),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_friendly", property="companyFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name", property="programName", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name_friendly", property="programNameFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_localtion", property="programLocaltion", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_localtion_friendly", property="programLocaltionFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_description", property="programDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.INTEGER),
        @Result(column="build_count", property="buildCount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_date", property="salesDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SYFCCommunity> selectByExample(SYFCCommunityExample example);

    @Select({
        "select",
        "id, third_record_id, company, company_friendly, program_name, program_name_friendly, ",
        "program_localtion, program_localtion_friendly, program_description, district, ",
        "build_count, sales_date, remark, data_status, create_user_id, update_user_id, ",
        "create_time, update_time",
        "from tb_syfc_community",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="third_record_id", property="thirdRecordId", jdbcType=JdbcType.INTEGER),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_friendly", property="companyFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name", property="programName", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name_friendly", property="programNameFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_localtion", property="programLocaltion", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_localtion_friendly", property="programLocaltionFriendly", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_description", property="programDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.INTEGER),
        @Result(column="build_count", property="buildCount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_date", property="salesDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SYFCCommunity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SYFCCommunitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SYFCCommunity record);

    @Update({
        "update tb_syfc_community",
        "set third_record_id = #{thirdRecordId,jdbcType=INTEGER},",
          "company = #{company,jdbcType=VARCHAR},",
          "company_friendly = #{companyFriendly,jdbcType=VARCHAR},",
          "program_name = #{programName,jdbcType=VARCHAR},",
          "program_name_friendly = #{programNameFriendly,jdbcType=VARCHAR},",
          "program_localtion = #{programLocaltion,jdbcType=VARCHAR},",
          "program_localtion_friendly = #{programLocaltionFriendly,jdbcType=VARCHAR},",
          "program_description = #{programDescription,jdbcType=VARCHAR},",
          "district = #{district,jdbcType=INTEGER},",
          "build_count = #{buildCount,jdbcType=INTEGER},",
          "sales_date = #{salesDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "data_status = #{dataStatus,jdbcType=INTEGER},",
          "create_user_id = #{createUserId,jdbcType=INTEGER},",
          "update_user_id = #{updateUserId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SYFCCommunity record);
}