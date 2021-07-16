package com.gezq.product.vo;

import lombok.Data;

/**
 * @author gezq
 * @create 2021-07-15-17:06
 */
@Data
public class AttrRespVo extends AttrVo {
    /**
     * 所属分类和所属分组
     *
     */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
