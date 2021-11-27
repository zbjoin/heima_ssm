package com.learn.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.learn.ssm.dao.IOrdersDao;
import com.learn.ssm.domain.Orders;
import com.learn.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：zb
 * @ClassName ：OrdersServiceImpl
 * @description ：订单的业务实现类
 * @date ：2021/11/23 4:08
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {

        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return iOrdersDao.findAll();
    }

    @Override
    public Orders findById(Integer ordersId) throws Exception {
        return iOrdersDao.findById(ordersId);
    }
}
