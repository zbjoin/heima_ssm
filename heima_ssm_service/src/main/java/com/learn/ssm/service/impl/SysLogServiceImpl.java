package com.learn.ssm.service.impl;

import com.learn.ssm.dao.ISysLogDao;
import com.learn.ssm.domain.SysLog;
import com.learn.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：zb
 * @ClassName ：SysLogServiceImpl
 * @description ：
 * @date ：2021/11/27 15:43
 */
@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public List<SysLog> findAll() throws Exception {
        return sysLogDao.findAll();
    }

    @Override
    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);
    }


}
