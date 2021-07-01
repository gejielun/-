package com.gezq.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 15:14:38
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

