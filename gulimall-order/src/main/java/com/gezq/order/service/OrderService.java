package com.gezq.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 15:04:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

