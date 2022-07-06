package com.flowyun.study.pm_blake.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.flowyun.mp.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目基本信息
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("w_project_info")
public class WProjectInfoDO extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 签约时间
     */
    private String projectSignDate;

    /**
     * 合同编号
     */
    private String contractNumber;

    /**
     * 合同性质
     */
    private Integer contractType;

    /**
     * 销售经理
     */
    private String salesManager;

    /**
     * 开始时间
     */
    private String startDate;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 项目状态
     */
    private Integer projectStatus;

    /**
     * 结算状态
     */
    private Integer settlementStatus;

    /**
     * 备注
     */
    private String remark;

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
