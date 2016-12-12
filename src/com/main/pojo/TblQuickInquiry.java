package com.main.pojo;
// Generated Dec 6, 2016 11:51:12 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblQuickInquiry generated by hbm2java
 */
@Entity
@Table(name="tbl_quick_inquiry"
    ,catalog="db_manager"
)
public class TblQuickInquiry  implements java.io.Serializable {


     private Integer txtIndex;
     private String txtId;
     private String txtStudentName;
     private String txtContactNumber;
     private String txtEmailId;
     private String txtEnquiredFrom;
     private Character txtIsDelete;
     private Date txtEntryDate;
     private Character txtIsActive;

    public TblQuickInquiry() {
    }

	
    public TblQuickInquiry(String txtId) {
        this.txtId = txtId;
    }
    public TblQuickInquiry(String txtId, String txtStudentName, String txtContactNumber, String txtEmailId, String txtEnquiredFrom, Character txtIsDelete, Date txtEntryDate, Character txtIsActive) {
       this.txtId = txtId;
       this.txtStudentName = txtStudentName;
       this.txtContactNumber = txtContactNumber;
       this.txtEmailId = txtEmailId;
       this.txtEnquiredFrom = txtEnquiredFrom;
       this.txtIsDelete = txtIsDelete;
       this.txtEntryDate = txtEntryDate;
       this.txtIsActive = txtIsActive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="txtIndex", unique=true, nullable=false)
    public Integer getTxtIndex() {
        return this.txtIndex;
    }
    
    public void setTxtIndex(Integer txtIndex) {
        this.txtIndex = txtIndex;
    }

    
    @Column(name="txtId", nullable=false, length=38)
    public String getTxtId() {
        return this.txtId;
    }
    
    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    
    @Column(name="txtStudentName", length=200)
    public String getTxtStudentName() {
        return this.txtStudentName;
    }
    
    public void setTxtStudentName(String txtStudentName) {
        this.txtStudentName = txtStudentName;
    }

    
    @Column(name="txtContactNumber", length=200)
    public String getTxtContactNumber() {
        return this.txtContactNumber;
    }
    
    public void setTxtContactNumber(String txtContactNumber) {
        this.txtContactNumber = txtContactNumber;
    }

    
    @Column(name="txtEmailId", length=200)
    public String getTxtEmailId() {
        return this.txtEmailId;
    }
    
    public void setTxtEmailId(String txtEmailId) {
        this.txtEmailId = txtEmailId;
    }

    
    @Column(name="txtEnquiredFrom", length=65535)
    public String getTxtEnquiredFrom() {
        return this.txtEnquiredFrom;
    }
    
    public void setTxtEnquiredFrom(String txtEnquiredFrom) {
        this.txtEnquiredFrom = txtEnquiredFrom;
    }

    
    @Column(name="txtIsDelete", length=1)
    public Character getTxtIsDelete() {
        return this.txtIsDelete;
    }
    
    public void setTxtIsDelete(Character txtIsDelete) {
        this.txtIsDelete = txtIsDelete;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="txtEntryDate", length=19)
    public Date getTxtEntryDate() {
        return this.txtEntryDate;
    }
    
    public void setTxtEntryDate(Date txtEntryDate) {
        this.txtEntryDate = txtEntryDate;
    }

    
    @Column(name="txtIsActive", length=1)
    public Character getTxtIsActive() {
        return this.txtIsActive;
    }
    
    public void setTxtIsActive(Character txtIsActive) {
        this.txtIsActive = txtIsActive;
    }




}


