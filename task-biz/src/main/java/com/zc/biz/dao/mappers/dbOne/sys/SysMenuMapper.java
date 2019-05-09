package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.api.model.resp.sys.RolePermissionResp;
import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysMenu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SysMenuMapper extends CommonMapper<SysMenu> {
    @Select("<script>" +
            "SELECT id menuId, menuname from sys_menu where parentid=${parentid} and `status` = 1 " +
            "</script>")
    List<RolePermissionResp> getChildMenus(@Param("parentid") String parentid);
    @Update("<script>UPDATE sys_menu set `status`=0\n" +
            "where id in (${menuids})</script>")
    int deleteMenu(@Param("menuids")String menuids);
    @Update("<script>UPDATE `sys_menu`\n" +
            "SET \n" +
            " `menuname` = #{menu.menuname},\n" +
            " `menuurl` = #{menu.menuurl},\n" +
            " `parentid` = #{menu.parentid},\n" +
            " `sort` = #{menu.sort},\n" +
            " `status` = #{menu.status},\n" +
            " `remarks` = #{menu.remarks},\n" +
            " `createtime` = #{menu.createtime}\n" +
            "WHERE\n" +
            "\t(`id` = #{menu.id});</script>")
    int updateMenu(@Param("menu")SysMenu menu);
}