package com.flowyun.study.pmdemo.base.entity;

import lombok.Data;
import com.flowyun.boot.entity.BaseId;
/**
 * <p>
 * 项目基本信息
 * </p>
 *
 * @author peter
 * @since 2022-06-09
 */
@Data
public class WProjectInfoDTO extends BaseId {

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
    private Integer status;


}
