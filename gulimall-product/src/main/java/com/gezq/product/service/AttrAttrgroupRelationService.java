package com.gezq.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.product.entity.AttrAttrgroupRelationEntity;
import com.gezq.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:09:27
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelationVo> vos);

}

