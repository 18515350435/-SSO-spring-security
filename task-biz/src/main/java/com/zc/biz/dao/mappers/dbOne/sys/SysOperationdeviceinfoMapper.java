package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysOperationdeviceinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysOperationdeviceinfoMapper extends CommonMapper<SysOperationdeviceinfo> {

    @Insert("<script>INSERT INTO `sys_operationdeviceinfo` (`area`,`devicename`,`deviceparam`,`devicemodel`,`checkcycle`,`usage`\n" +
            ")\n" +
            "VALUES\n" +
            "\t(\n#{area},#{devicename},#{deviceparam},#{devicemodel},#{checkcycle},#{usage}" +
            "\t)</script>")
    int insertModel(SysOperationdeviceinfo model);
    @Select("<script>SELECT * from sys_operationdeviceinfo</script>")
    List<SysOperationdeviceinfo> selects();
}