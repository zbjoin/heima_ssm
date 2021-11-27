package com.learn.ssm.service.impl;

import com.learn.ssm.dao.IProductDao;
import com.learn.ssm.domain.Product;
import com.learn.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：zb
 * @ClassName ：ProductServiceImpl
 * @description ：
 * @date ：2021/11/22 23:13
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
