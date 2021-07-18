package com.gezq.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author gezq
 * @create 2021-07-17-16:27
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}

