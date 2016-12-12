package com.main.pojo;
// Generated Dec 6, 2016 11:51:12 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblStudent generated by hbm2java
 */
@Entity
@Table(name="tbl_student"
    ,catalog="db_manager"
)
public class TblStudent  implements java.io.Serializable {


     private String txtId;
     private TblProjectGroup tblProjectGroup;
     private String txtDeptId;
     private String txtStudentName;
     private String txtStudentEmail;
     private String txtMobileNo;
     private String txtAddress;
     private Date txtBirthDate;
     private Character txtIsActive;

    public TblStudent() {
    }

	
    public TblStudent(String txtId, String txtDeptId) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
    }
    public TblStudent(String txtId, TblProjectGroup tblProjectGroup, String txtDeptId, String txtStudentName, String txtStudentEmail, String txtMobileNo, String txtAddress, Date txtBirthDate, Character txtIsActive) {
       this.txtId = txtId;
       this.tblProjectGroup = tblProjectGroup;
       this.txtDeptId = txtDeptId;
       this.txtStudentName = txtStudentName;
       this.txtStudentEmail = txtStudentEmail;
       this.txtMobileNo = txtMobileNo;
       this.txtAddress = txtAddress;
       this.txtBirthDate = txtBirthDate;
       this.txtIsActive = txtIsActive;
    }
   
     @Id 

    
    @Column(name="txtId", unique=true, nullable=false, length=38)
    public String getTxtId() {
        return this.txtId;
    }
    
    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="txtGroupId")
    public TblProjectGroup getTblProjectGroup() {
        return this.tblProjectGroup;
    }
    
    public void setTblProjectGroup(TblProjectGroup tblProjectGroup) {
        this.tblProjectGroup = tblProjectGroup;
    }

    
    @Column(name="txtDeptId", nullable=false, length=38)
    public String getTxtDeptId() {
        return this.txtDeptId;
    }
    
    public void setTxtDeptId(String txtDeptId) {
        this.txtDeptId = txtDeptId;
    }

    
    @Column(name="txtStudentName", length=50)
    public String getTxtStudentName() {
        return this.txtStudentName;
    }
    
    public void setTxtStudentName(String txtStudentName) {
        this.txtStudentName = txtStudentName;
    }

    
    @Column(name="txtStudentEmail", length=50)
    public String getTxtStudentEmail() {
        return this.txtStudentEmail;
    }
    
    public void setTxtStudentEmail(String txtStudentEmail) {
        this.txtStudentEmail = txtStudentEmail;
    }

    
    @Column(name="txtMobileNo", length=15)
    public String getTxtMobileNo() {
        return this.txtMobileNo;
    }
    
    public void setTxtMobileNo(String txtMobileNo) {
        this.txtMobileNo = txtMobileNo;
    }

    
    @Column(name="txtAddress", length=50)
    public String getTxtAddress() {
        return this.txtAddress;
    }
    
    public void setTxtAddress(String txtAddress) {
        this.txtAddress = txtAddress;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="txtBirthDate", length=10)
    public Date getTxtBirthDate() {
        return this.txtBirthDate;
    }
    
    public void setTxtBirthDate(Date txtBirthDate) {
        this.txtBirthDate = txtBirthDate;
    }

    
    @Column(name="txtIsActive", length=1)
    public Character getTxtIsActive() {
        return this.txtIsActive;
    }
    
    public void setTxtIsActive(Character txtIsActive) {
        this.txtIsActive = txtIsActive;
    }




}


