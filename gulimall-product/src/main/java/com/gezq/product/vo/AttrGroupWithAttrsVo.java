package com.gezq.product.vo;

import com.gezq.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @author gezq
 * @create 2021-07-16-17:23
 */
@Data
public class AttrGroupWithAttrsVo {

    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
