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
@TableName("TEACH_PLAN_MEDIA")
public class TeachPlanMedia implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 课程计划ID
     */
    @TableId(value = "TEACH_PLAN_ID", type = IdType.UUID)
    private String teachPlanId;

    /**
     * 媒资文件ID
     */
    @TableField("MEDIA_ID")
    private String mediaId;

    /**
     * 媒资文件的原始名称
     */
    @TableField("MEDIA_FILE_ORIGINAL_NAME")
    private String mediaFileOriginalName;

    /**
     * 媒资文件访问地址
     */
    @TableField("MEDIA_URL")
    private String mediaUrl;

    /**
     * 课程ID
     */
    @TableField("COURSE_ID")
    private String courseId;


}
