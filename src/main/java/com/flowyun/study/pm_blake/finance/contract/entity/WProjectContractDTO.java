package com.flowyun.study.pm_blake.finance.contract.entity;

import lombok.Data;
import com.flowyun.boot.entity.BaseId;

/**
 * <p>
 * 项目收款记录
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data

public class WProjectContractDTO extends BaseId {

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
    private Integer status;


}
