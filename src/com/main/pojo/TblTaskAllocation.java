package com.main.pojo;
// Generated Dec 6, 2016 11:51:12 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblTaskAllocation generated by hbm2java
 */
@Entity
@Table(name="tbl_task_allocation"
    ,catalog="db_manager"
)
public class TblTaskAllocation  implements java.io.Serializable {


     private String txtId;
     private String txtDeptId;
     private String txtToEmployee;
     private String txtSubject;
     private String txtAttachment;
     private String txtDescription;
     private String txtReply;
     private String txtSuggession;
     private String txtUpload;
     private Character txtIsActive;

    public TblTaskAllocation() {
    }

	
    public TblTaskAllocation(String txtId, String txtDeptId, String txtReply, String txtSuggession, String txtUpload) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
        this.txtReply = txtReply;
        this.txtSuggession = txtSuggession;
        this.txtUpload = txtUpload;
    }
    public TblTaskAllocation(String txtId, String txtDeptId, String txtToEmployee, String txtSubject, String txtAttachment, String txtDescription, String txtReply, String txtSuggession, String txtUpload, Character txtIsActive) {
       this.txtId = txtId;
       this.txtDeptId = txtDeptId;
       this.txtToEmployee = txtToEmployee;
       this.txtSubject = txtSubject;
       this.txtAttachment = txtAttachment;
       this.txtDescription = txtDescription;
       this.txtReply = txtReply;
       this.txtSuggession = txtSuggession;
       this.txtUpload = txtUpload;
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

    
    @Column(name="txtDeptId", nullable=false, length=38)
    public String getTxtDeptId() {
        return this.txtDeptId;
    }
    
    public void setTxtDeptId(String txtDeptId) {
        this.txtDeptId = txtDeptId;
    }

    
    @Column(name="txtToEmployee", length=38)
    public String getTxtToEmployee() {
        return this.txtToEmployee;
    }
    
    public void setTxtToEmployee(String txtToEmployee) {
        this.txtToEmployee = txtToEmployee;
    }

    
    @Column(name="txtSubject", length=500)
    public String getTxtSubject() {
        return this.txtSubject;
    }
    
    public void setTxtSubject(String txtSubject) {
        this.txtSubject = txtSubject;
    }

    
    @Column(name="txtAttachment", length=200)
    public String getTxtAttachment() {
        return this.txtAttachment;
    }
    
    public void setTxtAttachment(String txtAttachment) {
        this.txtAttachment = txtAttachment;
    }

    
    @Column(name="txtDescription", length=65535)
    public String getTxtDescription() {
        return this.txtDescription;
    }
    
    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    
    @Column(name="txtReply", nullable=false, length=65535)
    public String getTxtReply() {
        return this.txtReply;
    }
    
    public void setTxtReply(String txtReply) {
        this.txtReply = txtReply;
    }

    
    @Column(name="txtSuggession", nullable=false, length=500)
    public String getTxtSuggession() {
        return this.txtSuggession;
    }
    
    public void setTxtSuggession(String txtSuggession) {
        this.txtSuggession = txtSuggession;
    }

    
    @Column(name="txtUpload", nullable=false, length=500)
    public String getTxtUpload() {
        return this.txtUpload;
    }
    
    public void setTxtUpload(String txtUpload) {
        this.txtUpload = txtUpload;
    }

    
    @Column(name="txtIsActive", length=1)
    public Character getTxtIsActive() {
        return this.txtIsActive;
    }
    
    public void setTxtIsActive(Character txtIsActive) {
        this.txtIsActive = txtIsActive;
    }




}


