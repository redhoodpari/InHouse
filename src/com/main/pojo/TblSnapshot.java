package com.main.pojo;
// Generated Dec 6, 2016 11:51:12 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TblSnapshot generated by hbm2java
 */
@Entity
@Table(name="tbl_snapshot"
    ,catalog="db_manager"
)
public class TblSnapshot  implements java.io.Serializable {


     private String txtId;
     private TblProject tblProject;
     private String txtDeptId;
     private String txtSnapUrl;
     private String txtDescription;

    public TblSnapshot() {
    }

	
    public TblSnapshot(String txtId, String txtDeptId) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
    }
    public TblSnapshot(String txtId, TblProject tblProject, String txtDeptId, String txtSnapUrl, String txtDescription) {
       this.txtId = txtId;
       this.tblProject = tblProject;
       this.txtDeptId = txtDeptId;
       this.txtSnapUrl = txtSnapUrl;
       this.txtDescription = txtDescription;
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

    
    @Column(name="txtDeptId", nullable=false, length=38)
    public String getTxtDeptId() {
        return this.txtDeptId;
    }
    
    public void setTxtDeptId(String txtDeptId) {
        this.txtDeptId = txtDeptId;
    }

    
    @Column(name="txtSnapUrl", length=500)
    public String getTxtSnapUrl() {
        return this.txtSnapUrl;
    }
    
    public void setTxtSnapUrl(String txtSnapUrl) {
        this.txtSnapUrl = txtSnapUrl;
    }

    
    @Column(name="txtDescription", length=65535)
    public String getTxtDescription() {
        return this.txtDescription;
    }
    
    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }




}


