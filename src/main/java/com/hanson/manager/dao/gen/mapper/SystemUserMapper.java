package com.hanson.manager.dao.gen.mapper;

import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.dao.gen.entity.SystemUserExample;
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

public interface SystemUserMapper {
    @Delete({
        "delete from tb_system_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_system_user (gender, user_name, ",
        "nike_name, api_name, ",
        "api_pwd, dept_id, ",
        "user_pwd, user_salt, ",
        "user_email, user_tel, ",
        "user_address, user_phone, ",
        "company_code, create_uid, ",
        "update_uid, create_time, ",
        "update_time, data_status)",
        "values (#{gender,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{nikeName,jdbcType=VARCHAR}, #{apiName,jdbcType=VARCHAR}, ",
        "#{apiPwd,jdbcType=VARCHAR}, #{deptId,jdbcType=VARCHAR}, ",
        "#{userPwd,jdbcType=VARCHAR}, #{userSalt,jdbcType=VARCHAR}, ",
        "#{userEmail,jdbcType=VARCHAR}, #{userTel,jdbcType=VARCHAR}, ",
        "#{userAddress,jdbcType=VARCHAR}, #{userPhone,jdbcType=VARCHAR}, ",
        "#{companyCode,jdbcType=VARCHAR}, #{createUid,jdbcType=INTEGER}, ",
        "#{updateUid,jdbcType=INTEGER}, #{createTime,jdbcType=DATE}, ",
        "#{updateTime,jdbcType=DATE}, #{dataStatus,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SystemUser record);

    @InsertProvider(type=SystemUserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(SystemUser record);

    @SelectProvider(type=SystemUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nike_name", property="nikeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="api_name", property="apiName", jdbcType=JdbcType.VARCHAR),
        @Result(column="api_pwd", property="apiPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_pwd", property="userPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_salt", property="userSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_tel", property="userTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_code", property="companyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_uid", property="createUid", jdbcType=JdbcType.INTEGER),
        @Result(column="update_uid", property="updateUid", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.DATE),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER)
    })
    List<SystemUser> selectByExampleWithRowbounds(SystemUserExample example, RowBounds rowBounds);

    @SelectProvider(type=SystemUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nike_name", property="nikeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="api_name", property="apiName", jdbcType=JdbcType.VARCHAR),
        @Result(column="api_pwd", property="apiPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_pwd", property="userPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_salt", property="userSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_tel", property="userTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_code", property="companyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_uid", property="createUid", jdbcType=JdbcType.INTEGER),
        @Result(column="update_uid", property="updateUid", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.DATE),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER)
    })
    List<SystemUser> selectByExample(SystemUserExample example);

    @Select({
        "select",
        "id, gender, user_name, nike_name, api_name, api_pwd, dept_id, user_pwd, user_salt, ",
        "user_email, user_tel, user_address, user_phone, company_code, create_uid, update_uid, ",
        "create_time, update_time, data_status",
        "from tb_system_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nike_name", property="nikeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="api_name", property="apiName", jdbcType=JdbcType.VARCHAR),
        @Result(column="api_pwd", property="apiPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_pwd", property="userPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_salt", property="userSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_tel", property="userTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_code", property="companyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_uid", property="createUid", jdbcType=JdbcType.INTEGER),
        @Result(column="update_uid", property="updateUid", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.DATE),
        @Result(column="data_status", property="dataStatus", jdbcType=JdbcType.INTEGER)
    })
    SystemUser selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SystemUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SystemUser record);

    @Update({
        "update tb_system_user",
        "set gender = #{gender,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "nike_name = #{nikeName,jdbcType=VARCHAR},",
          "api_name = #{apiName,jdbcType=VARCHAR},",
          "api_pwd = #{apiPwd,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=VARCHAR},",
          "user_pwd = #{userPwd,jdbcType=VARCHAR},",
          "user_salt = #{userSalt,jdbcType=VARCHAR},",
          "user_email = #{userEmail,jdbcType=VARCHAR},",
          "user_tel = #{userTel,jdbcType=VARCHAR},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "company_code = #{companyCode,jdbcType=VARCHAR},",
          "create_uid = #{createUid,jdbcType=INTEGER},",
          "update_uid = #{updateUid,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=DATE},",
          "update_time = #{updateTime,jdbcType=DATE},",
          "data_status = #{dataStatus,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SystemUser record);
}