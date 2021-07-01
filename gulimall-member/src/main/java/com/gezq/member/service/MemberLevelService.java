package com.gezq.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:55:35
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

