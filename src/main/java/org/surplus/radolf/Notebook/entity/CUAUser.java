package org.surplus.radolf.Notebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
@Table (name = "c_ua_User")
public class CUAUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "CreditinfoId")
    private Integer creditinfoId;
    @Column(name = "UserName")
    private String username;
    @Column(name = "SubscriberId")
    private Integer SubscriberId;
    @Column(name = "IsOpen")
    private Integer IsOpen;
    @Column(name = "oauth_identity_id")
    private Integer oauthIdentityId;
    @Column(name = "Inserted")
    private Timestamp inserted;
    @Column(name = "InsertedBy")
    private Integer InsertedBy;
    @Column(name = "Updated")
    private Date Updated;
    @Column(name = "UpdatedBy")
    private Integer UpdatedBy;
}
