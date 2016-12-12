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
 * TblGroupTelecalling generated by hbm2java
 */
@Entity
@Table(name="tbl_group_telecalling"
    ,catalog="db_manager"
)
public class TblGroupTelecalling  implements java.io.Serializable {


     private String txtId;
     private TblProjectGroup tblProjectGroup;
     private String txtDeptId;
     private String txtCallingSubjet;
     private Date txtCallingTime;
     private String txtCallerName;
     private String txtConversation;

    public TblGroupTelecalling() {
    }

	
    public TblGroupTelecalling(String txtId, String txtDeptId, Date txtCallingTime) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
        this.txtCallingTime = txtCallingTime;
    }
    public TblGroupTelecalling(String txtId, TblProjectGroup tblProjectGroup, String txtDeptId, String txtCallingSubjet, Date txtCallingTime, String txtCallerName, String txtConversation) {
       this.txtId = txtId;
       this.tblProjectGroup = tblProjectGroup;
       this.txtDeptId = txtDeptId;
       this.txtCallingSubjet = txtCallingSubjet;
       this.txtCallingTime = txtCallingTime;
       this.txtCallerName = txtCallerName;
       this.txtConversation = txtConversation;
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

    
    @Column(name="txtCallingSubjet", length=500)
    public String getTxtCallingSubjet() {
        return this.txtCallingSubjet;
    }
    
    public void setTxtCallingSubjet(String txtCallingSubjet) {
        this.txtCallingSubjet = txtCallingSubjet;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="txtCallingTime", nullable=false, length=19)
    public Date getTxtCallingTime() {
        return this.txtCallingTime;
    }
    
    public void setTxtCallingTime(Date txtCallingTime) {
        this.txtCallingTime = txtCallingTime;
    }

    
    @Column(name="txtCallerName", length=50)
    public String getTxtCallerName() {
        return this.txtCallerName;
    }
    
    public void setTxtCallerName(String txtCallerName) {
        this.txtCallerName = txtCallerName;
    }

    
    @Column(name="txtConversation", length=65535)
    public String getTxtConversation() {
        return this.txtConversation;
    }
    
    public void setTxtConversation(String txtConversation) {
        this.txtConversation = txtConversation;
    }




}


