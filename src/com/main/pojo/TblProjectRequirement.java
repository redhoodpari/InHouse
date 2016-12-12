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
 * TblProjectRequirement generated by hbm2java
 */
@Entity
@Table(name="tbl_project_requirement"
    ,catalog="db_manager"
)
public class TblProjectRequirement  implements java.io.Serializable {


     private String txtId;
     private TblProjectInquiry tblProjectInquiry;
     private String txtDeptId;
     private String txtIeee;
     private String txtDescription;
     private Date txtEntryDate;
     private char txtIsActive;

    public TblProjectRequirement() {
    }

	
    public TblProjectRequirement(String txtId, String txtDeptId, String txtIeee, String txtDescription, Date txtEntryDate, char txtIsActive) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
        this.txtIeee = txtIeee;
        this.txtDescription = txtDescription;
        this.txtEntryDate = txtEntryDate;
        this.txtIsActive = txtIsActive;
    }
    public TblProjectRequirement(String txtId, TblProjectInquiry tblProjectInquiry, String txtDeptId, String txtIeee, String txtDescription, Date txtEntryDate, char txtIsActive) {
       this.txtId = txtId;
       this.tblProjectInquiry = tblProjectInquiry;
       this.txtDeptId = txtDeptId;
       this.txtIeee = txtIeee;
       this.txtDescription = txtDescription;
       this.txtEntryDate = txtEntryDate;
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
    @JoinColumn(name="txtInquiryId")
    public TblProjectInquiry getTblProjectInquiry() {
        return this.tblProjectInquiry;
    }
    
    public void setTblProjectInquiry(TblProjectInquiry tblProjectInquiry) {
        this.tblProjectInquiry = tblProjectInquiry;
    }

    
    @Column(name="txtDeptId", nullable=false, length=38)
    public String getTxtDeptId() {
        return this.txtDeptId;
    }
    
    public void setTxtDeptId(String txtDeptId) {
        this.txtDeptId = txtDeptId;
    }

    
    @Column(name="txtIeee", nullable=false, length=500)
    public String getTxtIeee() {
        return this.txtIeee;
    }
    
    public void setTxtIeee(String txtIeee) {
        this.txtIeee = txtIeee;
    }

    
    @Column(name="txtDescription", nullable=false, length=65535)
    public String getTxtDescription() {
        return this.txtDescription;
    }
    
    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="txtEntryDate", nullable=false, length=19)
    public Date getTxtEntryDate() {
        return this.txtEntryDate;
    }
    
    public void setTxtEntryDate(Date txtEntryDate) {
        this.txtEntryDate = txtEntryDate;
    }

    
    @Column(name="txtIsActive", nullable=false, length=1)
    public char getTxtIsActive() {
        return this.txtIsActive;
    }
    
    public void setTxtIsActive(char txtIsActive) {
        this.txtIsActive = txtIsActive;
    }




}


