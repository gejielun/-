package com.gezq.product.dao;

import com.gezq.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:09:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
