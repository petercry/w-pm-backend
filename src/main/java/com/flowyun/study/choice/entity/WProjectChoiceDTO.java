package com.flowyun.study.choice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.flowyun.mp.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目选项信息
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("w_project_moments")

public class WProjectChoiceDTO extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 项目ID(w_project_info表主键)
     */
    private Integer projectId;

    /**
     * 类别Id
     */
    private Integer categoryId;

    /**
     * 选项描述
     */
    private Integer choiceDescription;

    /**
     * 记录状态
     */
    @TableLogic
    private Integer status;


}


