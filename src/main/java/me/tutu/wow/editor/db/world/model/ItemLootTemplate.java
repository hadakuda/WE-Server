package me.tutu.wow.editor.db.world.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * Loot System
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("item_loot_template")
public class ItemLootTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Entry")
    private Integer entry;

    @TableField("Item")
    private Integer item;

    @TableField("Reference")
    private Integer reference;

    @TableField("Chance")
    private Float chance;

    @TableField("QuestRequired")
    private Integer questrequired;

    @TableField("LootMode")
    private Integer lootmode;

    @TableField("GroupId")
    private Integer groupid;

    @TableField("MinCount")
    private Integer mincount;

    @TableField("MaxCount")
    private Integer maxcount;

    @TableField("Comment")
    private String comment;


}
