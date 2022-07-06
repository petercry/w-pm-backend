package com.flowyun.study.pm_blake.finance.contract.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.flowyun.mp.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目收款记录
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("w_project_finance")
public class WProjectContractDO extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 项目ID(w_project_info表主键)
     */
    private Integer projectId;

    /**
     * 款项种类
     */
    private String paymentType;

    /**
     * 金额
     */
    private String moneyAmount;

    /**
     * 发生时间
     */
    private Integer occurDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 记录状态
     */
    @TableLogic
    private Integer status;


}
