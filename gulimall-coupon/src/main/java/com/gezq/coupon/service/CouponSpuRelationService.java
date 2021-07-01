package com.gezq.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:44:06
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

