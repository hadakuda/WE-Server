package me.tutu.wow.editor.db.world.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * Creature System
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("creature")
public class Creature implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Global Unique Identifier
     */
    @TableId(value = "guid", type = IdType.AUTO)
    private Integer guid;

    /**
     * Creature Identifier
     */
    private Integer id1;

    /**
     * Creature Identifier
     */
    private Integer id2;

    /**
     * Creature Identifier
     */
    private Integer id3;

    /**
     * Map Identifier
     */
    private Integer map;

    /**
     * Zone Identifier
     */
    @TableField("zoneId")
    private Integer zoneid;

    /**
     * Area Identifier
     */
    @TableField("areaId")
    private Integer areaid;

    @TableField("spawnMask")
    private Integer spawnmask;

    @TableField("phaseMask")
    private Integer phasemask;

    private Integer equipmentId;

    private Float positionX;

    private Float positionY;

    private Float positionZ;

    private Float orientation;

    private Integer spawntimesecs;

    private Float wanderDistance;

    private Integer currentwaypoint;

    private Integer curhealth;

    private Integer curmana;

    @TableField("MovementType")
    private Integer movementtype;

    private Integer npcflag;

    private Integer unitFlags;

    private Integer dynamicflags;

    @TableField("ScriptName")
    private String scriptname;

    @TableField("VerifiedBuild")
    private Integer verifiedbuild;


}
