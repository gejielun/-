package com.gezq.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gezq.common.utils.PageUtils;
import com.gezq.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:55:35
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

