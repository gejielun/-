package com.gezq.order.dao;

import com.gezq.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 15:04:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
