package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysUsers;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

public interface SysUsersMapper extends CommonMapper<SysUsers> {
    @Update("<script>UPDATE `sys_users`\n" +
            "SET \n" +
            " `loginname` = #{loginname},\n" +
            " `sex` = #{sex},\n" +
            " `nickname` = #{nickname},\n" +
            " `email` = #{email},\n" +
            " `photo` = #{photo},\n" +
            " `phone` = #{phone},\n" +
            " `departid` = #{departid},\n" +
            " `areacode` = #{areacode},\n" +
            " `status` = #{status},\n" +
            " `updatetime` = #{updatetime}\n" +
            "WHERE `id` = #{id} </script>")
    int updateWithOutPwd(SysUsers user);
    @Update("<script>UPDATE `sys_users`" +
            " SET \n" +
            " `status` = 0,\n" +
            " `updatetime` = #{updatetime}\n" +
            "WHERE `id` = #{id} </script>")
    int deleteSoft(@Param("id") String id,@Param("updatetime") Date date);
    @Update("<script>UPDATE `sys_users`" +
            " SET \n" +
            " `password` = #{pwd},\n" +
            " `updatetime` = #{updatetime}\n" +
            "WHERE `id` = #{id} </script>")
    int updatepwd(@Param("id") String id,@Param("pwd") String pwd,@Param("updatetime") Date date);
}