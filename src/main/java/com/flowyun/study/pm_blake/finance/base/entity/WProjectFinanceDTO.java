package com.flowyun.study.pm_blake.finance.base.entity;

import lombok.Data;
import com.flowyun.boot.entity.BaseId;

/**
 * <p>
 * 项目财务
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
public class WProjectFinanceDTO extends BaseId {

    private static final long serialVersionUID=1L;

    /**
     * 合同总金额
     */
    private String contractTotalAmount;

    /**
     * 已收款比例
     */
    private Integer receivedRatio;

    /**
     * 已收款金额
     */
    private Integer receivedAmount;

    /**
     * 预计下次付款时间
     */
    private String estimatedNextPaymentDate;

    /**
     * 预计下次付款时间
     */
    private Integer estimatedNextPaymentPercentage;

    /**
     * 下次付款条件
     */
    private String nextPaymentCondition;

    /**
     * 记录状态
     */
    private Integer status;


}
