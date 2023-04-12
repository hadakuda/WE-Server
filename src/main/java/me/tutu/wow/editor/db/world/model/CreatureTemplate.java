package me.tutu.wow.editor.db.world.model;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("creature_template")
public class CreatureTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer entry;

    private Integer difficultyEntry1;

    private Integer difficultyEntry2;

    private Integer difficultyEntry3;

    @TableField("KillCredit1")
    private Integer killcredit1;

    @TableField("KillCredit2")
    private Integer killcredit2;

    private Integer modelid1;

    private Integer modelid2;

    private Integer modelid3;

    private Integer modelid4;

    private String name;

    private String subname;

    @TableField("IconName")
    private String iconname;

    private Integer gossipMenuId;

    private Integer minlevel;

    private Integer maxlevel;

    private Integer exp;

    private Integer faction;

    private Integer npcflag;

    /**
     * Result of 2.5/2.5, most common value
     */
    private Float speedWalk;

    /**
     * Result of 8.0/7.0, most common value
     */
    private Float speedRun;

    private Float speedSwim;

    private Float speedFlight;

    private Float detectionRange;

    private Float scale;

    private Integer rank;

    private Integer dmgschool;

    @TableField("DamageModifier")
    private Float damagemodifier;

    @TableField("BaseAttackTime")
    private Integer baseattacktime;

    @TableField("RangeAttackTime")
    private Integer rangeattacktime;

    @TableField("BaseVariance")
    private Float basevariance;

    @TableField("RangeVariance")
    private Float rangevariance;

    private Integer unitClass;

    private Integer unitFlags;

    private Integer unitFlags2;

    private Integer dynamicflags;

    private Integer family;

    private Integer trainerType;

    private Integer trainerSpell;

    private Integer trainerClass;

    private Integer trainerRace;

    private Integer type;

    private Integer typeFlags;

    private Integer lootid;

    private Integer pickpocketloot;

    private Integer skinloot;

    @TableField("PetSpellDataId")
    private Integer petspelldataid;

    @TableField("VehicleId")
    private Integer vehicleid;

    private Integer mingold;

    private Integer maxgold;

    @TableField("AIName")
    private String ainame;

    @TableField("MovementType")
    private Integer movementtype;

    @TableField("HoverHeight")
    private Float hoverheight;

    @TableField("HealthModifier")
    private Float healthmodifier;

    @TableField("ManaModifier")
    private Float manamodifier;

    @TableField("ArmorModifier")
    private Float armormodifier;

    @TableField("ExperienceModifier")
    private Float experiencemodifier;

    @TableField("RacialLeader")
    private Integer racialleader;

    @TableField("movementId")
    private Integer movementid;

    @TableField("RegenHealth")
    private Integer regenhealth;

    private Integer mechanicImmuneMask;

    private Integer spellSchoolImmuneMask;

    private Integer flagsExtra;

    @TableField("ScriptName")
    private String scriptname;

    @TableField("VerifiedBuild")
    private Integer verifiedbuild;


}
