package com.gaby.auto.service.impl;

import com.gaby.auto.entity.Customer;
import com.gaby.auto.mapper.CustomerMapper;
import com.gaby.auto.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-14
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
