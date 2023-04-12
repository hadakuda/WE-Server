package me.tutu.wow.editor.db.characters.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * Item System
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("item_instance")
public class ItemInstance implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer guid;

    @TableField("itemEntry")
    private Integer itementry;

    private Integer ownerGuid;

    @TableField("creatorGuid")
    private Integer creatorguid;

    @TableField("giftCreatorGuid")
    private Integer giftcreatorguid;

    private Integer count;

    private Integer duration;

    private String charges;

    private Integer flags;

    private String enchantments;

    @TableField("randomPropertyId")
    private Integer randompropertyid;

    private Integer durability;

    @TableField("playedTime")
    private Integer playedtime;

    private String text;


}
