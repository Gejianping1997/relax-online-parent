package com.relax.framework.model.course;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("COURSE_PRE")
public class CoursePre implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
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
     * 大分类
     */
    @TableField("MT")
    private String mt;

    /**
     * 小分类
     */
    @TableField("ST")
    private String st;

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
     * 课程介绍
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 课程状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 时间戳
     */
    @TableField("TIMESTAMP")
    private LocalDateTime timestamp;

    /**
     * 收费规则，对应数据字典
     */
    @TableField("CHARGE")
    private String charge;

    /**
     * 有效性，对应数据字典
     */
    @TableField("VALID")
    private String valid;

    /**
     * 咨询QQ
     */
    @TableField("QQ")
    private String qq;

    /**
     * 价格
     */
    @TableField("PRICE")
    private Float price;

    /**
     * 原价格
     */
    @TableField("PRICE_OLD")
    private Float priceOld;

    /**
     * 过期时间
     */
    @TableField("EXPIRES")
    private LocalDateTime expires;

    /**
     * 课程图片
     */
    @TableField("PIC")
    private String pic;

    /**
     * 课程计划
     */
    @TableField("TEACH_PLAN")
    private String teachPlan;


}
