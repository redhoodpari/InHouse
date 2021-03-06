package com.main.pojo;
// Generated Dec 6, 2016 11:51:12 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblTechnology generated by hbm2java
 */
@Entity
@Table(name="tbl_technology"
    ,catalog="db_manager"
)
public class TblTechnology  implements java.io.Serializable {


     private String txtId;
     private String txtDeptId;
     private String txtProjectCategory;
     private String txtTechnologyDesc;
     private String txtUrl;
     private Set<TblProject> tblProjects = new HashSet<TblProject>(0);
     private Set<TblAlgorithm> tblAlgorithms = new HashSet<TblAlgorithm>(0);

    public TblTechnology() {
    }

	
    public TblTechnology(String txtId, String txtDeptId, String txtUrl) {
        this.txtId = txtId;
        this.txtDeptId = txtDeptId;
        this.txtUrl = txtUrl;
    }
    public TblTechnology(String txtId, String txtDeptId, String txtProjectCategory, String txtTechnologyDesc, String txtUrl, Set<TblProject> tblProjects, Set<TblAlgorithm> tblAlgorithms) {
       this.txtId = txtId;
       this.txtDeptId = txtDeptId;
       this.txtProjectCategory = txtProjectCategory;
       this.txtTechnologyDesc = txtTechnologyDesc;
       this.txtUrl = txtUrl;
       this.tblProjects = tblProjects;
       this.tblAlgorithms = tblAlgorithms;
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

    
    @Column(name="txtProjectCategory", length=500)
    public String getTxtProjectCategory() {
        return this.txtProjectCategory;
    }
    
    public void setTxtProjectCategory(String txtProjectCategory) {
        this.txtProjectCategory = txtProjectCategory;
    }

    
    @Column(name="txtTechnologyDesc", length=65535)
    public String getTxtTechnologyDesc() {
        return this.txtTechnologyDesc;
    }
    
    public void setTxtTechnologyDesc(String txtTechnologyDesc) {
        this.txtTechnologyDesc = txtTechnologyDesc;
    }

    
    @Column(name="txtUrl", nullable=false, length=500)
    public String getTxtUrl() {
        return this.txtUrl;
    }
    
    public void setTxtUrl(String txtUrl) {
        this.txtUrl = txtUrl;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblTechnology")
    public Set<TblProject> getTblProjects() {
        return this.tblProjects;
    }
    
    public void setTblProjects(Set<TblProject> tblProjects) {
        this.tblProjects = tblProjects;
    }


    @Override
    public String toString() {
        return this.txtId + " " + this.txtProjectCategory;
        
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblTechnology")
    public Set<TblAlgorithm> getTblAlgorithms() {
        return this.tblAlgorithms;
    }
    
    public void setTblAlgorithms(Set<TblAlgorithm> tblAlgorithms) {
        this.tblAlgorithms = tblAlgorithms;
    }


    



}


