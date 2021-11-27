package com.learn.ssm.service;

import com.learn.ssm.domain.Product;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：IProductService
 * @description ：
 * @date ：2021/11/22 23:12
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;

}
