package com.learn.ssm.dao;

import com.learn.ssm.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：ISysLogDao
 * @description ：
 * @date ：2021/11/27 15:44
 */
public interface ISysLogDao {

    @Select("select * from sysLog")
    List<SysLog> findAll() throws Exception;

    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog) throws Exception;
}
