package me.tutu.wow.editor.db.auth.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * Account System
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Identifier
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private byte[] salt;

    private byte[] verifier;

    private byte[] sessionKey;

    private byte[] totpSecret;

    private String email;

    private String regMail;

    private Date joindate;

    private String lastIp;

    private String lastAttemptIp;

    private Integer failedLogins;

    private Integer locked;

    private String lockCountry;

    private Date lastLogin;

    private Integer online;

    private Integer expansion;

    private Long mutetime;

    private String mutereason;

    private String muteby;

    private Integer locale;

    private String os;

    private Integer recruiter;

    private Integer totaltime;


}
