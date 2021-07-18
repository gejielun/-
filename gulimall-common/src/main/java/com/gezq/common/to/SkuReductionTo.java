package com.gezq.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author gezq
 * @create 2021-07-17-16:48
 */
@Data
public class SkuReductionTo {
    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}
