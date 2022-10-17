package org.surplus.radolf.Notebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@Table (name = "C_GE_SUBJECTS")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CREDITINFOID", nullable = false)
    private Long creditinfoId;
    @Column(name = "TYPEID")
    private Integer typeid;
    @Column(name = "LASTNAME_RU")
    private String lastname;
    @Column(name = "FIRSTNAME_RU")
    private String firstname;
    @Column(name = "MIDDLENAME_RU")
    private String middlename;
    @Column(name = "BIRTHDATE")
    private Timestamp birthdate;
    @Column(name = "Inserted")
    private Timestamp inserted;
    @Column(name = "InsertedBy")
    private Integer InsertedBy;

}
