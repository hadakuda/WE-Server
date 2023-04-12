package me.tutu.wow.editor.db.auth.model;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("account_access")
public class AccountAccess implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer gmlevel;

    @TableField("RealmID")
    private Integer realmid;

    private String comment;


}
