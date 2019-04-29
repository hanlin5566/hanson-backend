package com.hanson.manager.dao.gen.mapper;

import com.hanson.manager.dao.gen.entity.SYFCBuilding;
import com.hanson.manager.dao.gen.entity.SYFCBuildingExample;
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

public interface SYFCBuildingMapper {
    @Delete({
        "delete from tb_syfc_building",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_syfc_building (third_build_id, community_id, ",
        "building_localtion, building_num, ",
        "sales_num, approve_date, ",
        "top_tier, building_tech, ",
        "building_type, building_status, ",
        "avg_price, min_price, ",
        "max_price, program_description, ",
        "remark, data_status, ",
        "create_user_id, update_user_id, ",
        "create_time, update_time)",
        "values (#{thirdBuildId,jdbcType=INTEGER}, #{communityId,jdbcType=INTEGER}, ",
        "#{buildingLocaltion,jdbcType=VARCHAR}, #{buildingNum,jdbcType=VARCHAR}, ",
        "#{salesNum,jdbcType=VARCHAR}, #{approveDate,jdbcType=TIMESTAMP}, ",
        "#{topTier,jdbcType=INTEGER}, #{buildingTech,jdbcType=INTEGER}, ",
        "#{buildingType,jdbcType=INTEGER}, #{buildingStatus,jdbcType=INTEGER}, ",
        "#{avgPrice,jdbcType=DECIMAL}, #{minPrice,jdbcType=DECIMAL}, ",
        "#{maxPrice,jdbcType=DECIMAL}, #{programDescription,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{dataStatus,jdbcType=INTEGER}, ",
        "#{createUserId,jdbcType=INTEGER}, #{updateUserId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SYFCBuilding record);

    @InsertProvider(type=SYFCBuildingSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(SYFCBuilding record);

    @SelectProvider(type=SYFCBuildingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="third_build_id", property="thirdBuildId", jdbcType=JdbcType.INTEGER),
        @Result(column="community_id", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="building_localtion", property="buildingLocaltion", jdbcType=JdbcType.VARCHAR),
        @Result(column="building_num", property="buildingNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="sales_num", property="salesNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="approve_date", property="approveDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="top_tier", property="topTier", jdbcType=JdbcType.INTEGER),
        @Result(column="building_tech", property="buildingTech", jdbcType=JdbcType.INTEGER),
        @Result(column="building_type", property="buildingType", jdbcType=JdbcType.INTEGER),
        @Result(column="building_status", property="buildingStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="avg_price", property="avgPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="min_price", property="minPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_price", property="maxPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="program_description", property="programDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SYFCBuilding> selectByExampleWithRowbounds(SYFCBuildingExample example, RowBounds rowBounds);

    @SelectProvider(type=SYFCBuildingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="third_build_id", property="thirdBuildId", jdbcType=JdbcType.INTEGER),
        @Result(column="community_id", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="building_localtion", property="buildingLocaltion", jdbcType=JdbcType.VARCHAR),
        @Result(column="building_num", property="buildingNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="sales_num", property="salesNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="approve_date", property="approveDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="top_tier", property="topTier", jdbcType=JdbcType.INTEGER),
        @Result(column="building_tech", property="buildingTech", jdbcType=JdbcType.INTEGER),
        @Result(column="building_type", property="buildingType", jdbcType=JdbcType.INTEGER),
        @Result(column="building_status", property="buildingStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="avg_price", property="avgPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="min_price", property="minPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_price", property="maxPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="program_description", property="programDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SYFCBuilding> selectByExample(SYFCBuildingExample example);

    @Select({
        "select",
        "id, third_build_id, community_id, building_localtion, building_num, sales_num, ",
        "approve_date, top_tier, building_tech, building_type, building_status, avg_price, ",
        "min_price, max_price, program_description, remark, data_status, create_user_id, ",
        "update_user_id, create_time, update_time",
        "from tb_syfc_building",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="third_build_id", property="thirdBuildId", jdbcType=JdbcType.INTEGER),
        @Result(column="community_id", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="building_localtion", property="buildingLocaltion", jdbcType=JdbcType.VARCHAR),
        @Result(column="building_num", property="buildingNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="sales_num", property="salesNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="approve_date", property="approveDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="top_tier", property="topTier", jdbcType=JdbcType.INTEGER),
        @Result(column="building_tech", property="buildingTech", jdbcType=JdbcType.INTEGER),
        @Result(column="building_type", property="buildingType", jdbcType=JdbcType.INTEGER),
        @Result(column="building_status", property="buildingStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="avg_price", property="avgPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="min_price", property="minPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_price", property="maxPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="program_description", property="programDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SYFCBuilding selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SYFCBuildingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SYFCBuilding record);

    @Update({
        "update tb_syfc_building",
        "set third_build_id = #{thirdBuildId,jdbcType=INTEGER},",
          "community_id = #{communityId,jdbcType=INTEGER},",
          "building_localtion = #{buildingLocaltion,jdbcType=VARCHAR},",
          "building_num = #{buildingNum,jdbcType=VARCHAR},",
          "sales_num = #{salesNum,jdbcType=VARCHAR},",
          "approve_date = #{approveDate,jdbcType=TIMESTAMP},",
          "top_tier = #{topTier,jdbcType=INTEGER},",
          "building_tech = #{buildingTech,jdbcType=INTEGER},",
          "building_type = #{buildingType,jdbcType=INTEGER},",
          "building_status = #{buildingStatus,jdbcType=INTEGER},",
          "avg_price = #{avgPrice,jdbcType=DECIMAL},",
          "min_price = #{minPrice,jdbcType=DECIMAL},",
          "max_price = #{maxPrice,jdbcType=DECIMAL},",
          "program_description = #{programDescription,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "data_status = #{dataStatus,jdbcType=INTEGER},",
          "create_user_id = #{createUserId,jdbcType=INTEGER},",
          "update_user_id = #{updateUserId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SYFCBuilding record);
}