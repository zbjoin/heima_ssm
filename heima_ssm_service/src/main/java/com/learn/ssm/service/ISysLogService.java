package com.learn.ssm.service;

import com.learn.ssm.domain.SysLog;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：ISysLogService
 * @description ：
 * @date ：2021/11/27 15:41
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
