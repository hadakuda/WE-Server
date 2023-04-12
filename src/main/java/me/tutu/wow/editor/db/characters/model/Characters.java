package me.tutu.wow.editor.db.characters.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;

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
@TableName("characters")
public class Characters implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Global Unique Identifier
     */
    private Integer guid;

    /**
     * Account Identifier
     */
    private Integer account;

    private String name;

    private Integer race;
    @TableField("class")
    private Integer clazz;

    private Integer gender;

    private Integer level;

    private Integer xp;

    private Integer money;

    @TableField("bankSlots")
    private Integer bankslots;

    @TableField("restState")
    private Integer reststate;

    @TableField("playerFlags")
    private Integer playerflags;

    private Float positionX;

    private Float positionY;

    private Float positionZ;

    /**
     * Map Identifier
     */
    private Integer map;

    private Long instanceId;

    private Long instanceModeMask;

    private Float orientation;

    private Long online;


    private Long totaltime;

    private Long leveltime;

    private Long logoutTime;

    private Long isLogoutResting;

    private Float transX;

    private Float transY;

    private Float transZ;

    private Float transO;

    private Long transguid;

    private Long extraFlags;

    private Long stableSlots;

    private Long atLogin;

    private Long zone;

    @TableField("arenaPoints")
    private Long arenapoints;

    @TableField("totalHonorPoints")
    private Long totalhonorpoints;

    @TableField("todayHonorPoints")
    private Long todayhonorpoints;

    @TableField("yesterdayHonorPoints")
    private Long yesterdayhonorpoints;

    @TableField("totalKills")
    private Long totalkills;

    @TableField("todayKills")
    private Long todaykills;

    @TableField("yesterdayKills")
    private Long yesterdaykills;

    @TableField("chosenTitle")
    private Long chosentitle;

    @TableField("knownCurrencies")
    private Long knowncurrencies;

    @TableField("watchedFaction")
    private Long watchedfaction;

    private Integer drunk;

    private Integer health;

    private Integer latency;

    @TableField("talentGroupsCount")
    private Long talentgroupscount;

    @TableField("activeTalentGroup")
    private Long activetalentgroup;

    @TableField("exploredZones")
    private String exploredzones;

    @TableField("equipmentCache")
    private String equipmentcache;

    @TableField("ammoId")
    private Long ammoid;

    @TableField("knownTitles")
    private String knowntitles;
    private Date creationDate;

    @TableField("deleteDate")
    private Integer deletedate;

}
