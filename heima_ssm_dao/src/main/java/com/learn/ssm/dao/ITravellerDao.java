package com.learn.ssm.dao;

import com.learn.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：ITravellerDao
 * @description ：旅客dao
 * @date ：2021/11/23 17:52
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(Integer ordersId) throws Exception;
}
