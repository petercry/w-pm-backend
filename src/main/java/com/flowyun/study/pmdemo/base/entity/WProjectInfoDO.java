package com.flowyun.study.pmdemo.base.entity;

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
 * @author peter
 * @since 2022-06-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
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
     * 记录状态
     */
    @TableLogic
    private Integer status;


}
