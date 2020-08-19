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
@TableName("COURSE_PIC")
public class CoursePic implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 课程ID
     */
    @TableId(value = "COURSE_ID", type = IdType.UUID)
    private String courseId;

    /**
     * 图片ID
     */
    @TableField("PIC")
    private String pic;


}
