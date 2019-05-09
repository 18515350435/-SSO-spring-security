package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.api.model.resp.sys.MenuBtnName;
import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysMenuBtn;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysMenuBtnMapper extends CommonMapper<SysMenuBtn> {

    int insertBatis(List<SysMenuBtn> smb);



    @Select("<script>SELECT menu.menuurl menuname,menubtn.methodname btnnamediy,btn.methodname btnname \n" +
            "from (select * from sys_menu_btn where id in ( ${permissionids}) ) menubtn \n"+
            "INNER JOIN (select * from sys_menu where `status`=1) menu \n"+
            "on menubtn.menuid =menu.id \n"+
            "INNER JOIN (select * from sys_buttons where `status`=1) btn \n"+
            "on menubtn.btnid =btn.id " +
            "</script>")
    List<MenuBtnName> selectMenuBtnNames(@Param("permissionids")String permissionids);
}