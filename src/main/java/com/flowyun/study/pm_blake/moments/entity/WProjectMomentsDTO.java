package com.flowyun.study.pm_blake.moments.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.flowyun.mp.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目动态
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("w_project_moments")

public class WProjectMomentsDTO extends BaseEntity {

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
    @TableLogic
    private Integer status;


}