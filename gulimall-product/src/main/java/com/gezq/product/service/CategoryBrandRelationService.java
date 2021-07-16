package com.gezq.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.product.entity.BrandEntity;
import com.gezq.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:09:27
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updataCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

