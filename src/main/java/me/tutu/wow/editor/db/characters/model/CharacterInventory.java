package me.tutu.wow.editor.db.characters.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * Player System
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("character_inventory")
public class CharacterInventory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Global Unique Identifier
     */
    private Integer guid;

    private Integer bag;

    private Integer slot;

    /**
     * Item Global Unique Identifier
     */
    private Integer item;


}
