package com.gezq.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 15:14:38
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

