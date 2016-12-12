package com.main.pojo;
// Generated Dec 6, 2016 11:51:12 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblProjectMaterial generated by hbm2java
 */
@Entity
@Table(name="tbl_project_material"
    ,catalog="db_manager"
)
public class TblProjectMaterial  implements java.io.Serializable {


     private String txtId;
     private String txtDeptId;
     private String txtGroupId;
     private String txtMaterialTitle;
     private String txtAttchment;
     private Date txtEntryDate;

    public TblProjectMaterial() {
    }

	
    public TblProjectMaterial(String txtId, String txtDeptId) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
    }
    public TblProjectMaterial(String txtId, String txtDeptId, String txtGroupId, String txtMaterialTitle, String txtAttchment, Date txtEntryDate) {
       this.txtId = txtId;
       this.txtDeptId = txtDeptId;
       this.txtGroupId = txtGroupId;
       this.txtMaterialTitle = txtMaterialTitle;
       this.txtAttchment = txtAttchment;
       this.txtEntryDate = txtEntryDate;
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

    
    @Column(name="txtGroupId", length=38)
    public String getTxtGroupId() {
        return this.txtGroupId;
    }
    
    public void setTxtGroupId(String txtGroupId) {
        this.txtGroupId = txtGroupId;
    }

    
    @Column(name="txtMaterialTitle", length=50)
    public String getTxtMaterialTitle() {
        return this.txtMaterialTitle;
    }
    
    public void setTxtMaterialTitle(String txtMaterialTitle) {
        this.txtMaterialTitle = txtMaterialTitle;
    }

    
    @Column(name="txtAttchment", length=500)
    public String getTxtAttchment() {
        return this.txtAttchment;
    }
    
    public void setTxtAttchment(String txtAttchment) {
        this.txtAttchment = txtAttchment;
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


