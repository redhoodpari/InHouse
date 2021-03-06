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
 * TblProjectModules generated by hbm2java
 */
@Entity
@Table(name="tbl_project_modules"
    ,catalog="db_manager"
)
public class TblProjectModules  implements java.io.Serializable {


     private Integer txtId;
     private String txtDeptId;
     private String txtProjectId;
     private String txtModuleName;
     private String txtDescription;
     private String txtModuleNo;
     private Date txtEntryDate;

    public TblProjectModules() {
    }

	
    public TblProjectModules(String txtDeptId, String txtModuleNo) {
        this.txtDeptId = txtDeptId;
        this.txtModuleNo = txtModuleNo;
    }
    public TblProjectModules(String txtDeptId, String txtProjectId, String txtModuleName, String txtDescription, String txtModuleNo, Date txtEntryDate) {
       this.txtDeptId = txtDeptId;
       this.txtProjectId = txtProjectId;
       this.txtModuleName = txtModuleName;
       this.txtDescription = txtDescription;
       this.txtModuleNo = txtModuleNo;
       this.txtEntryDate = txtEntryDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="txtId", unique=true, nullable=false)
    public Integer getTxtId() {
        return this.txtId;
    }
    
    public void setTxtId(Integer txtId) {
        this.txtId = txtId;
    }

    
    @Column(name="txtDeptId", nullable=false, length=38)
    public String getTxtDeptId() {
        return this.txtDeptId;
    }
    
    public void setTxtDeptId(String txtDeptId) {
        this.txtDeptId = txtDeptId;
    }

    
    @Column(name="txtProjectId", length=38)
    public String getTxtProjectId() {
        return this.txtProjectId;
    }
    
    public void setTxtProjectId(String txtProjectId) {
        this.txtProjectId = txtProjectId;
    }

    
    @Column(name="txtModuleName", length=200)
    public String getTxtModuleName() {
        return this.txtModuleName;
    }
    
    public void setTxtModuleName(String txtModuleName) {
        this.txtModuleName = txtModuleName;
    }

    
    @Column(name="txtDescription", length=65535)
    public String getTxtDescription() {
        return this.txtDescription;
    }
    
    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    
    @Column(name="txtModuleNo", nullable=false, length=15)
    public String getTxtModuleNo() {
        return this.txtModuleNo;
    }
    
    public void setTxtModuleNo(String txtModuleNo) {
        this.txtModuleNo = txtModuleNo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="txtEntryDate", length=19)
    public Date getTxtEntryDate() {
        return this.txtEntryDate;
    }
    
    public void setTxtEntryDate(Date txtEntryDate) {
        this.txtEntryDate = txtEntryDate;
    }




}


