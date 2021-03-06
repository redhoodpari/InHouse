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
 * TblGroupAccount generated by hbm2java
 */
@Entity
@Table(name="tbl_group_account"
    ,catalog="db_manager"
)
public class TblGroupAccount  implements java.io.Serializable {


     private String txtId;
     private TblProject tblProject;
     private TblProjectGroup tblProjectGroup;
     private String txtDeptId;
     private String txtGroupCode;
     private Integer txtPaidAmt;
     private String txtRemark;
     private Date txtEntryDate;
     private String txtEnteredBy;
     private Character txtIsActive;

    public TblGroupAccount() {
    }

	
    public TblGroupAccount(String txtId, String txtDeptId) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
    }
    public TblGroupAccount(String txtId, TblProject tblProject, TblProjectGroup tblProjectGroup, String txtDeptId, String txtGroupCode, Integer txtPaidAmt, String txtRemark, Date txtEntryDate, String txtEnteredBy, Character txtIsActive) {
       this.txtId = txtId;
       this.tblProject = tblProject;
       this.tblProjectGroup = tblProjectGroup;
       this.txtDeptId = txtDeptId;
       this.txtGroupCode = txtGroupCode;
       this.txtPaidAmt = txtPaidAmt;
       this.txtRemark = txtRemark;
       this.txtEntryDate = txtEntryDate;
       this.txtEnteredBy = txtEnteredBy;
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
    @JoinColumn(name="txtProjectId")
    public TblProject getTblProject() {
        return this.tblProject;
    }
    
    public void setTblProject(TblProject tblProject) {
        this.tblProject = tblProject;
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

    
    @Column(name="txtGroupCode", length=10)
    public String getTxtGroupCode() {
        return this.txtGroupCode;
    }
    
    public void setTxtGroupCode(String txtGroupCode) {
        this.txtGroupCode = txtGroupCode;
    }

    
    @Column(name="txtPaidAmt")
    public Integer getTxtPaidAmt() {
        return this.txtPaidAmt;
    }
    
    public void setTxtPaidAmt(Integer txtPaidAmt) {
        this.txtPaidAmt = txtPaidAmt;
    }

    
    @Column(name="txtRemark", length=250)
    public String getTxtRemark() {
        return this.txtRemark;
    }
    
    public void setTxtRemark(String txtRemark) {
        this.txtRemark = txtRemark;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="txtEntryDate", length=19)
    public Date getTxtEntryDate() {
        return this.txtEntryDate;
    }
    
    public void setTxtEntryDate(Date txtEntryDate) {
        this.txtEntryDate = txtEntryDate;
    }

    
    @Column(name="txtEnteredBy", length=38)
    public String getTxtEnteredBy() {
        return this.txtEnteredBy;
    }
    
    public void setTxtEnteredBy(String txtEnteredBy) {
        this.txtEnteredBy = txtEnteredBy;
    }

    
    @Column(name="txtIsActive", length=1)
    public Character getTxtIsActive() {
        return this.txtIsActive;
    }
    
    public void setTxtIsActive(Character txtIsActive) {
        this.txtIsActive = txtIsActive;
    }




}


