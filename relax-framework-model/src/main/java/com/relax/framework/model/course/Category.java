package com.relax.framework.model.course;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author gjp
 * @since 2020-08-19
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("CATEGORY")
public class Category implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**
     * 分类名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 分类标签默认和名称一样
     */
    @TableField("LABEL")
    private String label;

    /**
     * 父结点ID
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 是否显示
     */
    @TableField("IS_SHOW")
    private String isShow;

    /**
     * 排序字段
     */
    @TableField("ORDER_BY")
    private Integer orderBy;

    /**
     * 是否叶子
     */
    @TableField("IS_LEAF")
    private String isLeaf;


}
