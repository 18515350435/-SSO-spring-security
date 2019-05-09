package com.zc.biz.dao.mappers.dbOne.sys;

import com.zc.biz.dao.config.CommonMapper;
import com.zc.biz.dao.models.dbOne.sys.SysWarninginfos;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SysWarninginfosMapper extends CommonMapper<SysWarninginfos> {
    @Select("<script>SELECT * from sys_warninginfos\n" +
            "<if test='type'>" +
            "where warninglevel=#{type}" +
            "</if></script>")
    List<SysWarninginfos> selectAllInfo(@Param("type") int type);
    @Insert("<script>INSERT INTO `sys_warninginfos` (`warninginfo`, `warninglevel`, `starttime`, `endtime`, `areaname`, `inserttime`) " +
            "VALUES(#{warninginfo},#{warninglevel},#{starttime},#{endtime},#{areaname},#{inserttime})</script>")
    int insertInfo(SysWarninginfos info);
    @Update("<script>UPDATE `sys_warninginfos` \n" +
            "SET `warninginfo`=#{warninginfo}, \n" +
            "`warninglevel`=#{warninglevel}, `starttime`=#{starttime}, \n" +
            "`endtime`=#{endtime}, `areaname`=#{areaname}, \n" +
            "`inserttime`=#{inserttime} \n" +
            "WHERE `id`=#{id} </script>")
    int updateInfo(SysWarninginfos info);
}