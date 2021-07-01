package com.gezq.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 15:04:51
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

