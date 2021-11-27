package com.learn.ssm.service;

import com.learn.ssm.domain.Orders;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：IOrdersService
 * @description ：
 * @date ：2021/11/23 4:06
 */
public interface IOrdersService {

    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(Integer ordersId) throws Exception;
}
