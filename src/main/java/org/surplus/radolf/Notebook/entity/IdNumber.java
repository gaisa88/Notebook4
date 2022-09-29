package org.surplus.radolf.Notebook.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "c_ge_IdNumber", schema = "dbo")
public class IdNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "Number")
    private String number;
    @Column(name = "Inserted")
    private Timestamp inserted;

    @Column(name = "CreditinfoId")
    private Long creditinfoId;

    @Column(name = "TypeId")
    private Long typeId;
    @Column(name = "Rank")
    private Long rank;
    @Column(name = "LocationId")
    private Long locationId;
    @Column(name = "ProviderId")
    private Long providerId;
    @Column(name = "RegistrationDate")
    private Timestamp registrationDate;
    @Column(name = "IssueDate")
    private Timestamp issueDate;
    @Column(name = "ExpirationDate")
    private Timestamp expirationDate;
    @Column(name = "InsertedBy")
    private Long insertedBy;
    @Column(name = "Updated")
    private Timestamp updated;
    @Column(name = "UpdatedBy")
    private Long updatedBy;
//    @Column(name = "Number_dijital")
//    private String Number_dijital;
    @Column(name = "is_rnn")
    private Long is_rnn;
    @Column(name = "is_confirm")
    private Long is_confirm;
    @Column(name = "KatoId")
    private String katoId;
    @Column(name = "type_free")
    private String type_free;


    public IdNumber(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Timestamp getInserted() {
        return inserted;
    }

    public void setInserted(Timestamp inserted) {
        this.inserted = inserted;
    }

    public Long getCreditinfoId() {
        return creditinfoId;
    }

    public void setCreditinfoId(Long creditinfoId) {
        this.creditinfoId = creditinfoId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Timestamp getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Timestamp issueDate) {
        this.issueDate = issueDate;
    }

    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(Long insertedBy) {
        this.insertedBy = insertedBy;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getIs_rnn() {
        return is_rnn;
    }

    public void setIs_rnn(Long is_rnn) {
        this.is_rnn = is_rnn;
    }

    public Long getIs_confirm() {
        return is_confirm;
    }

    public void setIs_confirm(Long is_confirm) {
        this.is_confirm = is_confirm;
    }

    public String getKatoId() {
        return katoId;
    }

    public void setKatoId(String katoId) {
        this.katoId = katoId;
    }

    public String getType_free() {
        return type_free;
    }

    public void setType_free(String type_free) {
        this.type_free = type_free;
    }

    public IdNumber(Long id, String number, Timestamp inserted, Long creditinfoId, Long typeId, Long rank, Long locationId, Long providerId, Timestamp registrationDate, Timestamp issueDate, Timestamp expirationDate, Long insertedBy, Timestamp updated, Long updatedBy, Long is_rnn, Long is_confirm, String katoId, String type_free) {
        this.id = id;
        this.number = number;
        this.inserted = inserted;
        this.creditinfoId = creditinfoId;
        this.typeId = typeId;
        this.rank = rank;
        this.locationId = locationId;
        this.providerId = providerId;
        this.registrationDate = registrationDate;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.insertedBy = insertedBy;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.is_rnn = is_rnn;
        this.is_confirm = is_confirm;
        this.katoId = katoId;
        this.type_free = type_free;
    }
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

