package com.flowyun.study.pm_blake.base.entity;

import lombok.Data;
import com.flowyun.boot.entity.BaseId;

/**
 * <p>
 * 项目基本信息
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
public class WProjectInfoDTO extends BaseId{
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
     * 记录状态
     */
    private Integer status;
}
