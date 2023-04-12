package me.tutu.wow.editor.db.world.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("item_template_locale")
public class ItemTemplateLocale implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    private String locale;

    @TableField("Name")
    private String name;

    @TableField("Description")
    private String description;

    @TableField("VerifiedBuild")
    private Integer verifiedbuild;


}
