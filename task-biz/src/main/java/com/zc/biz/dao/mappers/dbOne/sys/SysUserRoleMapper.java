package com.zc.biz.dao.mappers.dbOne.sys;

import java.util.List;

import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysUserRole;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysUserRoleMapper extends CommonMapper<SysUserRole> {
    @Select("<script>SELECT role_id from (select * from sys_user_role where user_id=#{userid}) userrole \n" +
            "inner join (select * from sys_role where is_freeze=1) role "+
            "on role.id=userrole.role_id " +
            "</script>")
    List<String> selectRoleIds(@Param("userid")String userid);
}