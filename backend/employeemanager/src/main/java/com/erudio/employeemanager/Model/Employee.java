package com.erudio.employeemanager.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Employer
 */
@Entity
public class Employee implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long id;

  private String email;

  private String name;

  @Column(name = "job_title")
  private String jobTittle;

  private String phone;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "employee_code", nullable = false, updatable = false)
  private String employeeCode;

  public Employee() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJobTittle() {
    return jobTittle;
  }

  public void setJobTittle(String jobTittle) {
    this.jobTittle = jobTittle;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getEmployeeCode() {
    return employeeCode;
  }

  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((jobTittle == null) ? 0 : jobTittle.hashCode());
    result = prime * result + ((phone == null) ? 0 : phone.hashCode());
    result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
    result = prime * result + ((employeeCode == null) ? 0 : employeeCode.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (jobTittle == null) {
      if (other.jobTittle != null)
        return false;
    } else if (!jobTittle.equals(other.jobTittle))
      return false;
    if (phone == null) {
      if (other.phone != null)
        return false;
    } else if (!phone.equals(other.phone))
      return false;
    if (imageUrl == null) {
      if (other.imageUrl != null)
        return false;
    } else if (!imageUrl.equals(other.imageUrl))
      return false;
    if (employeeCode == null) {
      if (other.employeeCode != null)
        return false;
    } else if (!employeeCode.equals(other.employeeCode))
      return false;
    return true;
  }
  
}