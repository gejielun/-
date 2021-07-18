package com.gezq.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author gezq
 * @create 2021-07-18-16:14
 */
@Data
public class MergeVo {
    private Long purchaseId;
    private List<Long> items;
}
