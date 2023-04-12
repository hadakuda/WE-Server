package me.tutu.wow.editor.db.auth.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * Realm System
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("realmlist")
public class Realmlist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String address;

    @TableField("localAddress")
    private String localaddress;

    @TableField("localSubnetMask")
    private String localsubnetmask;

    private Integer port;

    private Integer icon;

    private Integer flag;

    private Integer timezone;

    @TableField("allowedSecurityLevel")
    private Integer allowedsecuritylevel;

    private Float population;

    private Integer gamebuild;


}
