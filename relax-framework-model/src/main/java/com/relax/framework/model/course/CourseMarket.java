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
@TableName("COURSE_MARKET")
public class CourseMarket implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 课程ID
     */
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

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
     * 过期时间
     */
    @TableField("EXPIRES")
    private LocalDateTime expires;

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
     * 原价
     */
    @TableField("PRICE_OLD")
    private Float priceOld;

    /**
     * 课程有效期-开始时间
     */
    @TableField("START_TIME")
    private LocalDateTime startTime;

    /**
     * 课程有效期-结束时间
     */
    @TableField("END_TIME")
    private LocalDateTime endTime;


}
