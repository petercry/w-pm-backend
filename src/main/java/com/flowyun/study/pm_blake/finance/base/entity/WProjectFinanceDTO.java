package com.flowyun.study.pm_blake.finance.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.flowyun.mp.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目财务
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("w_project_info")
public class WProjectFinanceDTO extends BaseEntity {

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
    @TableLogic
    private Integer status;


}
