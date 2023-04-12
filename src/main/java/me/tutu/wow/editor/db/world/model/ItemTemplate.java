package me.tutu.wow.editor.db.world.model;

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
@TableName("item_template")
public class ItemTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer entry;

    private Integer _class;

    private Integer subclass;

    @TableField("SoundOverrideSubclass")
    private Integer soundoverridesubclass;

    private String name;

    private Integer displayid;

    @TableField("Quality")
    private Integer quality;

    @TableField("Flags")
    private Integer flags;

    @TableField("FlagsExtra")
    private Integer flagsextra;

    @TableField("BuyCount")
    private Integer buycount;

    @TableField("BuyPrice")
    private Long buyprice;

    @TableField("SellPrice")
    private Integer sellprice;

    @TableField("InventoryType")
    private Integer inventorytype;

    @TableField("AllowableClass")
    private Integer allowableclass;

    @TableField("AllowableRace")
    private Integer allowablerace;

    @TableField("ItemLevel")
    private Integer itemlevel;

    @TableField("RequiredLevel")
    private Integer requiredlevel;

    @TableField("RequiredSkill")
    private Integer requiredskill;

    @TableField("RequiredSkillRank")
    private Integer requiredskillrank;

    private Integer requiredspell;

    private Integer requiredhonorrank;

    @TableField("RequiredCityRank")
    private Integer requiredcityrank;

    @TableField("RequiredReputationFaction")
    private Integer requiredreputationfaction;

    @TableField("RequiredReputationRank")
    private Integer requiredreputationrank;

    private Integer maxcount;

    private Integer stackable;

    @TableField("ContainerSlots")
    private Integer containerslots;

    @TableField("StatsCount")
    private Integer statscount;

    private Integer statType1;

    private Integer statValue1;

    private Integer statType2;

    private Integer statValue2;

    private Integer statType3;

    private Integer statValue3;

    private Integer statType4;

    private Integer statValue4;

    private Integer statType5;

    private Integer statValue5;

    private Integer statType6;

    private Integer statValue6;

    private Integer statType7;

    private Integer statValue7;

    private Integer statType8;

    private Integer statValue8;

    private Integer statType9;

    private Integer statValue9;

    private Integer statType10;

    private Integer statValue10;

    @TableField("ScalingStatDistribution")
    private Integer scalingstatdistribution;

    @TableField("ScalingStatValue")
    private Integer scalingstatvalue;

    private Float dmgMin1;

    private Float dmgMax1;

    private Integer dmgType1;

    private Float dmgMin2;

    private Float dmgMax2;

    private Integer dmgType2;

    private Integer armor;

    private Integer holyRes;

    private Integer fireRes;

    private Integer natureRes;

    private Integer frostRes;

    private Integer shadowRes;

    private Integer arcaneRes;

    private Integer delay;

    private Integer ammoType;

    @TableField("RangedModRange")
    private Float rangedmodrange;

    private Integer spellid1;

    private Integer spelltrigger1;

    private Integer spellcharges1;

    @TableField("spellppmRate_1")
    private Float spellppmrate1;

    private Integer spellcooldown1;

    private Integer spellcategory1;

    private Integer spellcategorycooldown1;

    private Integer spellid2;

    private Integer spelltrigger2;

    private Integer spellcharges2;

    @TableField("spellppmRate_2")
    private Float spellppmrate2;

    private Integer spellcooldown2;

    private Integer spellcategory2;

    private Integer spellcategorycooldown2;

    private Integer spellid3;

    private Integer spelltrigger3;

    private Integer spellcharges3;

    @TableField("spellppmRate_3")
    private Float spellppmrate3;

    private Integer spellcooldown3;

    private Integer spellcategory3;

    private Integer spellcategorycooldown3;

    private Integer spellid4;

    private Integer spelltrigger4;

    private Integer spellcharges4;

    @TableField("spellppmRate_4")
    private Float spellppmrate4;

    private Integer spellcooldown4;

    private Integer spellcategory4;

    private Integer spellcategorycooldown4;

    private Integer spellid5;

    private Integer spelltrigger5;

    private Integer spellcharges5;

    @TableField("spellppmRate_5")
    private Float spellppmrate5;

    private Integer spellcooldown5;

    private Integer spellcategory5;

    private Integer spellcategorycooldown5;

    private Integer bonding;

    private String description;

    @TableField("PageText")
    private Integer pagetext;

    @TableField("LanguageID")
    private Integer languageid;

    @TableField("PageMaterial")
    private Integer pagematerial;

    private Integer startquest;

    private Integer lockid;

    @TableField("Material")
    private Integer material;

    private Integer sheath;

    @TableField("RandomProperty")
    private Integer randomproperty;

    @TableField("RandomSuffix")
    private Integer randomsuffix;

    private Integer block;

    private Integer itemset;

    @TableField("MaxDurability")
    private Integer maxdurability;

    private Integer area;

    @TableField("Map")
    private Integer map;

    @TableField("BagFamily")
    private Integer bagfamily;

    @TableField("TotemCategory")
    private Integer totemcategory;

    @TableField("socketColor_1")
    private Integer socketcolor1;

    @TableField("socketContent_1")
    private Integer socketcontent1;

    @TableField("socketColor_2")
    private Integer socketcolor2;

    @TableField("socketContent_2")
    private Integer socketcontent2;

    @TableField("socketColor_3")
    private Integer socketcolor3;

    @TableField("socketContent_3")
    private Integer socketcontent3;

    @TableField("socketBonus")
    private Integer socketbonus;

    @TableField("GemProperties")
    private Integer gemproperties;

    @TableField("RequiredDisenchantSkill")
    private Integer requireddisenchantskill;

    @TableField("ArmorDamageModifier")
    private Float armordamagemodifier;

    private Integer duration;

    @TableField("ItemLimitCategory")
    private Integer itemlimitcategory;

    @TableField("HolidayId")
    private Integer holidayid;

    @TableField("ScriptName")
    private String scriptname;

    @TableField("DisenchantID")
    private Integer disenchantid;

    @TableField("FoodType")
    private Integer foodtype;

    @TableField("minMoneyLoot")
    private Integer minmoneyloot;

    @TableField("maxMoneyLoot")
    private Integer maxmoneyloot;

    @TableField("flagsCustom")
    private Integer flagscustom;

    @TableField("VerifiedBuild")
    private Integer verifiedbuild;


}
