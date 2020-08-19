package com.relax.framework.model.course;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

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
@TableName("TEACH_PLAN")
public class TeachPlan implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    @TableField("PNAME")
    private String pname;

    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 层级，分为1、2、3级
     */
    @TableField("GRADE")
    private String grade;

    /**
     * 课程类型:1视频、2文档
     */
    @TableField("PTYPE")
    private String ptype;

    /**
     * 章节及课程时介绍
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 时长，单位分钟
     */
    @TableField("TIME_LENGTH")
    private Double timeLength;

    /**
     * 课程ID
     */
    @TableField("COURSE_ID")
    private String courseId;

    /**
     * 排序字段
     */
    @TableField("ORDER_BY")
    private String orderBy;

    /**
     * 状态：未发布、已发布
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否试学
     */
    @TableField("TRY_LEARN")
    private String tryLearn;


}
