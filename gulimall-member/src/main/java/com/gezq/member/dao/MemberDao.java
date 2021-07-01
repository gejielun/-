package com.gezq.member.dao;

import com.gezq.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gezq
 * @email gezq@123.com
 * @date 2021-06-28 14:55:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
