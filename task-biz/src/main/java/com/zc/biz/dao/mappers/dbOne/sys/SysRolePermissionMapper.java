package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.api.model.resp.sys.RolePermissionResp;
import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysRolePermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface SysRolePermissionMapper extends CommonMapper<SysRolePermission> {
    /**
     * @Description 查询某角色下某菜单下的按钮是否拥有权限
     * @Author       Peihan.Zhang
     * @CreateTime  2019/4/29
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     * @param
     */
    @Select("<script>" +
            "SELECT\n" +
            "\tm.id menuId,\n" +
//            "\tm.menuname,\n" +
            "\tb.id menubtnId,\n" +
            "\tbu.buttonname menuname,\n" +//因为要统一menuname和buttonname的显示名称所以全用menuname显示
            "  ! ISNULL(rp.permission_id) isHave\n" +
            "FROM\n" +
            "\tsys_menu m\n" +
            "LEFT JOIN sys_menu_btn b ON m.id = b.menuid\n" +
            "LEFT JOIN sys_buttons bu on  b.btnid=bu.id\n" +
            "LEFT JOIN sys_role_permission rp ON b.id = rp.permission_id\n" +
            "AND rp.role_id = ${roleId}\n" +
            "WHERE\n" +
            "\tm.`status` = 1\n" +
            "AND bu.`status` = 1\n" +
            "AND m.id = ${menuId}" +
            "</script>")
    List<RolePermissionResp> getRoleAllPermissions(@Param("roleId") String roleId,@Param("menuId") String menuId);



    @Select("<script>SELECT permission_id from sys_role_permission \n" +
            "where role_id in ( ${roleids} ) " +
            "</script>")
    List<String> selectPermissionIds(@Param("roleids")String roleids);
}