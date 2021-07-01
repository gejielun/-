package com.gezq.ware.dao;

import com.gezq.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 15:14:38
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
