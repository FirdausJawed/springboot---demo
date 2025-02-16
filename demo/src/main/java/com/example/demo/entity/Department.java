package com.example.demo.entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;


//db se interect krwane k liye following annotation
@Entity
public class Department {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int departmentId;


    private String departmentName;
    private String departmentCode;
    private String getDepartmentAddress;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getGetDepartmentAddress() {
        return getDepartmentAddress;
    }

    public void setGetDepartmentAddress(String getDepartmentAddress) {
        this.getDepartmentAddress = getDepartmentAddress;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Department(String departmentName, String departmentCode, String getDepartmentAddress, int departmentId) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.getDepartmentAddress = getDepartmentAddress;
        this.departmentId = departmentId;
    }

    public Department() {
    }
}
