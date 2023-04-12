package me.tutu.wow.editor.db.characters.model;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("_transmogrification_character_collections")
public class TransmogrificationCharacterCollections implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer guid;

    private String skins;


}
