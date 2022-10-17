package org.surplus.radolf.Notebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "c_ge_IdNumber")
public class IdNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "CreditinfoId")
    private Integer creditinfoId;
    @Column(name = "Number")
    private String Number;
    @Column(name = "TypeId")
    private Integer TypeId;
    @Column(name = "Rank")
    private Integer Rank;
    @Column(name = "RegistrationDate")
    private Timestamp RegistrationDate;
    @Column(name = "IssueDate")
    private Timestamp IssueDate;
    @Column(name = "ExpirationDate")
    private Timestamp ExpirationDate;
    @Column(name = "LocationId", nullable = true)
    private Integer LocationId;
    @Column(name = "ProviderId")
    private Integer ProviderId;
    @Column(name = "Inserted")
    private Timestamp inserted;
    @Column(name = "InsertedBy")
    private Integer InsertedBy;
    @Column(name = "Updated")
    private Date Updated;
    @Column(name = "UpdatedBy")
    private Integer UpdatedBy;
    @Column(name = "is_confirm")
    private Integer is_confirm;
    @Column(name = "is_rnn")
    private Integer is_rnn;

    @Column(name = "KatoId")
    private String KatoId;
    @Column(name = "type_free")
    private String type_free;
    @ManyToOne
    @JoinColumn(name = "CREDITINFOID")
    private Subjects subjects;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "CREDITINFOID", insertable = false, updatable = false)
//    @Fetch(FetchMode.JOIN)
//    private Subjects subjects;


//    @Override
//    public String toString() {// переопределение метода toString для вывода данных в json
//        return String.format(
//                "IdNumber[id=%d, CreditinfoId='%d', Number='%s', TypeId='%d', Rank=%d, RegistrationDate='%s', IssueDate='%s', ExpirationDate='%s', LocationId=%d, ProviderId='%d', Inserted='%s', InsertedBy='%d', Updated=%s, UpdatedBy='%d', is_confirm='%d', is_rnn='%d', KatoId='%s', type_free='%s' ]",
//                id, CreditinfoId, Number, TypeId, Rank, RegistrationDate, IssueDate, ExpirationDate, LocationId, ProviderId, Inserted, InsertedBy, Updated, UpdatedBy, is_confirm, is_rnn, KatoId, type_free);
//    }
}
