package me.tutu.wow.editor.db.characters.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * version 4.0
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("_transmogrification_character")
public class TransmogrificationCharacter implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Item guidLow
     */
    @TableId("GUID")
    private Integer guid;

    /**
     * Item entry
     */
    @TableField("FakeEntry")
    private Integer fakeentry;

    /**
     * Enchantment Id
     */
    private Integer visual;

    /**
     * Player guidLow
     */
    @TableField("Owner")
    private Integer owner;


}
