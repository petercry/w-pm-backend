package com.flowyun.study.choice.entity;

import lombok.Data;
import com.flowyun.boot.entity.BaseId;

/**
 * <p>
 * 项目选项信息
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */

@Data

public class WProjectChoiceDTO extends BaseId {

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
    private Integer status;


}


