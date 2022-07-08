package com.flowyun.study.pm_blake.moments.entity;

import lombok.Data;
import com.flowyun.boot.entity.BaseId;

/**
 * <p>
 * 项目动态
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data

public class WProjectMomentsDTO extends BaseId {

    private static final long serialVersionUID=1L;

    /**
     * 项目ID(w_project_info表主键)
     */
    private Integer projectId;

    /**
     * 发生时间
     */
    private Integer occurTime;

    /**
     * 联系方式
     */
    private Integer contactInfo;

    /**
     * 客户联系人
     */
    private String customerName;

    /**
     * 经办人
     */
    private String manager;

    /**
     * 动态内容
     */
    private String momentContent;

    /**
     * 记录状态
     */
    private Integer status;


}