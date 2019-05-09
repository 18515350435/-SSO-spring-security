package com.zc.api.model.req;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "基本信息完善入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class HospitalUpdateReq implements Serializable {

  private static final long serialVersionUID = 4103918059073236696L;

  @ApiModelProperty(value = "医疗机构编码", required = true, hidden = false)
  @NotBlank(message = "医疗机构编码不能为空")
  private String            hospitalNo;

  @ApiModelProperty(value = "医疗机构名称", required = true)
  @NotBlank(message = "医疗机构名称不能为空")
  private String            name;

  @ApiModelProperty(value = "医院等级(00一级以下(社区医疗)  01一级医院 02二级医院 03三级医院 )", required = true, allowableValues = "00,01,02,03")
  @NotNull(message = "医院等级不能为空")
  private String            hospitalLevel;

  @ApiModelProperty(value = "医院医保等级：1一级甲等/2一级乙等/3一级丙等/4二级甲等/5二级乙等/6二级丙等/7三级特等/8三级甲等/9三级乙等/10三级丙等", required = true, allowableValues = "1,2,3,4,5,6,7,8,9,10")
  @NotNull(message = "医院医保等级不能为空")
  private String            hospitalMedicalLevel;

  @ApiModelProperty(value = "行政区域ID", required = true)
  @NotBlank(message = "行政区域不能为空")
  private String            districtId;

  @ApiModelProperty(value = "行政区域名称", required = false)
  // @NotBlank(message = "行政区域名称不能为空")
  private String            districtName;

  @ApiModelProperty(value = "医院地址", required = true)
  @NotBlank(message = "医院地址不能为空")
  private String            address;

  @ApiModelProperty(value = "邮政编码")
  private String            postcode;

  @ApiModelProperty(value = "经度", required = true)
  @NotNull(message = "经度不能为空")
  @Range(min = 0, max = 10000, message = "经度输入错误")
  private BigDecimal        longitude;

  @ApiModelProperty(value = "纬度", required = true)
  @NotNull(message = "纬度不能为空")
  @Range(min = 0, max = 10000, message = "纬度输入错误")
  private BigDecimal        latitude;

  @ApiModelProperty(value = "上级主管部门")
  private String            parentDepartment;

  @ApiModelProperty(value = "医保办负责人", required = true)
  @NotBlank(message = "医保办负责人不能为空")
  private String            medicalPerson;

  @ApiModelProperty(value = "医保负责人手机号", required = true)
  @NotBlank(message = "医保负责人手机号不能为空")
  private String            medicalPersonMobile;

  @ApiModelProperty(value = "医院收费级别(1 一级/2 二级/3 三级）", required = true, allowableValues = "1,2,3")
  @NotBlank(message = "医院收费级别不能为空")
  private String            chargesLevel;

  @ApiModelProperty(value = "床位数", dataType = "int")
  private Integer           bedNumber;

  @ApiModelProperty(value = "申请内容")
  private String            applyContent;

  @ApiModelProperty(value = "联系人姓名", required = true)
  @NotBlank(message = "联系人姓名不能为空")
  private String            contactName;

  @ApiModelProperty(value = "联系人电话", required = true)
  @NotBlank(message = "联系人电话不能为空")
  private String            contactPhone;

  @ApiModelProperty(value = "联系人地址", required = true)
  @NotBlank(message = "联系人地址不能为空")
  private String            contactAddress;

  @ApiModelProperty(value = "法人姓名", required = true)
  @NotBlank(message = "法人姓名不能为空")
  private String            corporationName;

  @ApiModelProperty(value = "法人电话", required = true)
  @NotBlank(message = "法人电话不能为空")
  private String            corporationPhone;

  @ApiModelProperty(value = "批准日期", required = true)
  @NotNull(message = "批准日期不能为空")
  private Date              authorityDate;

  @ApiModelProperty(value = "组织机构代码", required = true)
  @NotBlank(message = "组织机构代码不能为空")
  private String            orgNumber;

  @ApiModelProperty(value = "银行账号", required = true)
  @NotBlank(message = "银行账号不能为空")
  private String            bankAccount;

  @ApiModelProperty(value = "银行户名", required = true)
  @NotBlank(message = "银行户名不能为空")
  private String            bankAccountName;

  @ApiModelProperty(value = "银行名称", required = true)
  @NotBlank(message = "银行名称不能为空")
  private String            bankName;

  @ApiModelProperty(value = "职业许可证号", required = true)
  @NotBlank(message = "职业许可证号不能为空")
  private String            jobPermitNumber;

  @ApiModelProperty(value = "医院简介-富文本", required = true)
  @NotBlank(message = "医院简介不能为空")
  private String            hospitalSummary;

  @ApiModelProperty(value = "乘车路线-富文本")
  private String            busLine;

  @ApiModelProperty(value = "开户许可证-原图片文件", required = false)
  // @NotBlank (message = "开户许可证不能为空")
  private String            openAccountPermit;

  @ApiModelProperty(value = "营业执照-原图片文件", required = false)
  // @NotBlank (message = "营业执照不能为空")
  private String            businessLicense;

  @ApiModelProperty(value = "医疗机构执业许可证-图片文件", required = false)
  // @NotBlank (message = "医疗机构执业许可证不能为空")
  private String            medicalPracticePermit;

  @ApiModelProperty(value = "药品经营许可证-原图片文件", required = false)
  // @NotBlank (message = "药品经营许可证不能为空")
  private String            drugBusinessPermit;

  @ApiModelProperty(value = "医院封面图-原图片文件（最多支持5张图片）用逗号分隔文件名", required = false)
  // @NotBlank (message = "医院封面图不能为空")
  private String            hospitalImgs;

  public String getHospitalNo() {
    return hospitalNo;
  }

  public void setHospitalNo(String hospitalNo) {
    this.hospitalNo = hospitalNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHospitalLevel() {
    return hospitalLevel;
  }

  public void setHospitalLevel(String hospitalLevel) {
    this.hospitalLevel = hospitalLevel;
  }

  public String getHospitalMedicalLevel() {
    return hospitalMedicalLevel;
  }

  public void setHospitalMedicalLevel(String hospitalMedicalLevel) {
    this.hospitalMedicalLevel = hospitalMedicalLevel;
  }

  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public String getParentDepartment() {
    return parentDepartment;
  }

  public void setParentDepartment(String parentDepartment) {
    this.parentDepartment = parentDepartment;
  }

  public String getMedicalPerson() {
    return medicalPerson;
  }

  public void setMedicalPerson(String medicalPerson) {
    this.medicalPerson = medicalPerson;
  }

  public String getMedicalPersonMobile() {
    return medicalPersonMobile;
  }

  public void setMedicalPersonMobile(String medicalPersonMobile) {
    this.medicalPersonMobile = medicalPersonMobile;
  }

  public String getChargesLevel() {
    return chargesLevel;
  }

  public void setChargesLevel(String chargesLevel) {
    this.chargesLevel = chargesLevel;
  }

  public Integer getBedNumber() {
    return bedNumber;
  }

  public void setBedNumber(Integer bedNumber) {
    this.bedNumber = bedNumber;
  }

  public String getApplyContent() {
    return applyContent;
  }

  public void setApplyContent(String applyContent) {
    this.applyContent = applyContent;
  }

  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public String getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }

  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public String getCorporationPhone() {
    return corporationPhone;
  }

  public void setCorporationPhone(String corporationPhone) {
    this.corporationPhone = corporationPhone;
  }

  public Date getAuthorityDate() {
    return authorityDate;
  }

  public void setAuthorityDate(Date authorityDate) {
    this.authorityDate = authorityDate;
  }

  public String getOrgNumber() {
    return orgNumber;
  }

  public void setOrgNumber(String orgNumber) {
    this.orgNumber = orgNumber;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public String getBankAccountName() {
    return bankAccountName;
  }

  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getJobPermitNumber() {
    return jobPermitNumber;
  }

  public void setJobPermitNumber(String jobPermitNumber) {
    this.jobPermitNumber = jobPermitNumber;
  }

  public String getHospitalSummary() {
    return hospitalSummary;
  }

  public void setHospitalSummary(String hospitalSummary) {
    this.hospitalSummary = hospitalSummary;
  }

  public String getBusLine() {
    return busLine;
  }

  public void setBusLine(String busLine) {
    this.busLine = busLine;
  }

  public String getOpenAccountPermit() {
    return openAccountPermit;
  }

  public void setOpenAccountPermit(String openAccountPermit) {
    this.openAccountPermit = openAccountPermit;
  }

  public String getBusinessLicense() {
    return businessLicense;
  }

  public void setBusinessLicense(String businessLicense) {
    this.businessLicense = businessLicense;
  }

  public String getMedicalPracticePermit() {
    return medicalPracticePermit;
  }

  public void setMedicalPracticePermit(String medicalPracticePermit) {
    this.medicalPracticePermit = medicalPracticePermit;
  }

  public String getDrugBusinessPermit() {
    return drugBusinessPermit;
  }

  public void setDrugBusinessPermit(String drugBusinessPermit) {
    this.drugBusinessPermit = drugBusinessPermit;
  }

  public String getHospitalImgs() {
    return hospitalImgs;
  }

  public void setHospitalImgs(String hospitalImgs) {
    this.hospitalImgs = hospitalImgs;
  }

}
