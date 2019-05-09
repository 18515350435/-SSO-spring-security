package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.api.model.resp.sys.OperationInfoResp;
import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysOperationinfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysOperationinfoMapper extends CommonMapper<SysOperationinfo> {
    @Select("<script>SELECT i.id, d.devicename,i.checktime,i.inserttime,i.area from sys_operationinfo i\n" +
            "INNER JOIN sys_operationdeviceinfo d\n" +
            "on i.deviceid=d.id</script>")
    List<OperationInfoResp> selects();
}