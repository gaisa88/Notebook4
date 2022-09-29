package org.surplus.radolf.Notebook.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "c_ge_IdNumber")
public class IdNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "Number")
    private String number;
    @Column(name = "Inserted")
    private Timestamp inserted;


//    @Column(name = "TypeId")
//    private Long TypeId;
//    @Column(name = "ProviderId")
//    private Long ProviderId;
//    @Column(name = "CreditinfoId")
//    private Long CreditInfoId;
//    @Column(name = "InsertedBy")
//    private Long InsertedBy;
//    @Column(name = "Updated")
//    private Timestamp Updated;
//    @Column(name = "UpdatedBy")
//    private Long UpdatedBy;


//    @Override
//    public String toString() {
//        return String.format(
//                "IdNumber[id=%d, CreditInfoId='%d', Number='%s', TypeId='%d', ProviderId='%d', Inserted='%s', InsertedBy='%d', Updated=%s, UpdatedBy='%d']",
//                id, CreditInfoId, Number, TypeId, ProviderId, Inserted, InsertedBy, Updated, UpdatedBy);
//    }
}

