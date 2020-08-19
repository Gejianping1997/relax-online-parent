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
@TableName("COURSE_PUB")
public class CoursePub implements Serializable {

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
     * 教育模式
     */
    @TableField("TEACH_MODE")
    private String teachMode;

    /**
     * 课程介绍
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 时间戳LOGSTASH使用
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
    private String expires;

    /**
     * 课程有效期-开始时间
     */
    @TableField("START_TIME")
    private String startTime;

    /**
     * 课程有效期-结束时间
     */
    @TableField("END_TIME")
    private String endTime;

    /**
     * 课程图片
     */
    @TableField("PIC")
    private String pic;

    /**
     * 课程计划
     */
    @TableField("TEACHPLAN")
    private String teachplan;

    /**
     * 发布时间
     */
    @TableField("PUB_TIME")
    private String pubTime;


}
