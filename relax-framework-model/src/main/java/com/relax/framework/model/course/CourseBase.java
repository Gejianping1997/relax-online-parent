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
@TableName("COURSE_BASE")
public class CourseBase implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**
     * 课程名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 适用人群
     */
    @TableField("USERS")
    private String users;

    /**
     * 课程大分类
     */
    @TableField("MT")
    private String mt;

    /**
     * 课程等级
     */
    @TableField("GRADE")
    private String grade;

    /**
     * 学习模式
     */
    @TableField("STUDY_MODEL")
    private String studyModel;

    /**
     * 授课模式
     */
    @TableField("TEACH_MODE")
    private String teachMode;

    /**
     * 课程介绍
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 课程小分类
     */
    @TableField("ST")
    private String st;

    /**
     * 课程状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 教育机构
     */
    @TableField("COMPANY_ID")
    private String companyId;

    /**
     * 创建用户
     */
    @TableField("USER_ID")
    private String userId;


}
