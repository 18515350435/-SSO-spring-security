package com.zc.api.model.resp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "医院信息查询已保存的数据出参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class HospitalQueryResp implements Serializable {

  private static final long serialVersionUID = 560248849734490094L;
  @ApiModelProperty(value = "医疗机构ID")
  private String            id;
  @ApiModelProperty(value = "医疗机构编码")
  private String            hospitalNo;
  @ApiModelProperty(value = "医疗机构名称")
  private String            name;
  @ApiModelProperty(value = "医疗机构类型：目前为1-医疗机构 2-定点药店")
  private String            hospitalClsfn;
  @ApiModelProperty(value = " 医疗机构类别(10医院/20社区卫生服务中心（站）/30乡镇卫生院/40门诊部、诊所、医务室、村卫生室 包括卫生所(室)/50急救中心（站）/60采供血机构/70妇幼保健院(所、站) 包括妇幼保健中心/80专科疾病防治院(所、站)/90疾病预防控制中心(防疫站)/99其他诊疗机构)")
  private String            hospitalCategory;
  @ApiModelProperty(value = "医院等级(00一级以下(社区医疗)  01一级医院 02二级医院 03三级医院 )")
  private String            hospitalLevel;
  @ApiModelProperty(value = ": 医院医保等级：1一级甲等/2一级乙等/3一级丙等/4二级甲等/5二级乙等/6二级丙等/7三级特等/8三级甲等/9三级乙等/10三级丙等")
  private String            hospitalMedicalLevel;
  @ApiModelProperty(value = "行政区域ID")
  private String            districtId;
  @ApiModelProperty(value = "行政区域名称")
  private String            districtName;
  @ApiModelProperty(value = "医院地址")
  private String            address;
  @ApiModelProperty(value = "邮政编码")
  private String            postcode;
  @ApiModelProperty(value = "经度")
  private BigDecimal        longitude;
  @ApiModelProperty(value = "纬度")
  private BigDecimal        latitude;
  @ApiModelProperty(value = "上级主管部门")
  private String            parentDepartment;
  @ApiModelProperty(value = "医保办负责人")
  private String            medicalPerson;
  @ApiModelProperty(value = "医保负责人手机号")
  private String            medicalPersonMobile;
  @ApiModelProperty(value = "医院收费级别(1 一级/2 二级/3 三级）")
  private String            chargesLevel;
  @ApiModelProperty(value = "床位数")
  private Integer           bedNumber;
  @ApiModelProperty(value = "申请内容")
  private String            applyContent;
  @ApiModelProperty(value = "联系人姓名")
  private String            contactName;
  @ApiModelProperty(value = "联系人电话")
  private String            contactPhone;
  @ApiModelProperty(value = "联系人地址")
  private String            contactAddress;
  @ApiModelProperty(value = "法人姓名")
  private String            corporationName;
  @ApiModelProperty(value = "法人电话")
  private String            corporationPhone;
  @ApiModelProperty(value = "批准日期")
  @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd")
  private Date              authorityDate;
  @ApiModelProperty(value = "组织机构代码")
  private String            orgNumber;
  @ApiModelProperty(value = "银行账号")
  private String            bankAccount;
  @ApiModelProperty(value = "银行户名")
  private String            bankAccountName;
  @ApiModelProperty(value = "银行名称")
  private String            bankName;
  @ApiModelProperty(value = "开户许可证")
  private String            openAccountPermit;
  @ApiModelProperty(value = "营业执照")
  private String            businessLicense;
  @ApiModelProperty(value = "职业许可证号")
  private String            jobPermitNumber;
  @ApiModelProperty(value = "医疗机构执业许可证")
  private String            medicalPracticePermit;
  @ApiModelProperty(value = "药品经营许可证")
  private String            drugBusinessPermit;
  @ApiModelProperty(value = "医院简介")
  private String            hospitalSummary;
  @ApiModelProperty(value = "乘车路线")
  private String            busLine;
  @ApiModelProperty(value = "医院封面图（多个图片用，分开，最多支持5张）")
  private String            hospitalImgs;
  @ApiModelProperty(value = "是否开通家庭医师（0否 1是）")
  private Byte              whetherFamilyDoctor;
  @ApiModelProperty(value = "取消定点标志(1正常 0 取消)")
  private Byte              cancelPointMark;
  @ApiModelProperty(value = "异地标志（1本地 2异地）")
  private Byte              remoteMark;
  @ApiModelProperty(value = " 职责类型(1职工 2城乡)")
  private Byte              dutyType;
  @ApiModelProperty(value = "有效标志：1-有效 0-无效")
  private Byte              availability;
  @ApiModelProperty(value = "医院联系电话")
  private String            phone;
  @ApiModelProperty(value = "浏览次数")
  private Integer           viewCount;
  @ApiModelProperty(value = "医院介绍")
  private String            description;
  @ApiModelProperty(value = "工作时间描述")
  private String            workTimeDesc;
  @ApiModelProperty(value = "领导姓名")
  private String            leaderName;
  @ApiModelProperty(value = "领导电话")
  private String            leaderPhone;
  @ApiModelProperty(value = "补全标志 1-已补全 0-未补全")
  private String            completionFlag;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public String getHospitalClsfn() {
    return hospitalClsfn;
  }

  public void setHospitalClsfn(String hospitalClsfn) {
    this.hospitalClsfn = hospitalClsfn;
  }

  public String getHospitalCategory() {
    return hospitalCategory;
  }

  public void setHospitalCategory(String hospitalCategory) {
    this.hospitalCategory = hospitalCategory;
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

  public String getJobPermitNumber() {
    return jobPermitNumber;
  }

  public void setJobPermitNumber(String jobPermitNumber) {
    this.jobPermitNumber = jobPermitNumber;
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

  public String getHospitalImgs() {
    return hospitalImgs;
  }

  public void setHospitalImgs(String hospitalImgs) {
    this.hospitalImgs = hospitalImgs;
  }

  public Byte getWhetherFamilyDoctor() {
    return whetherFamilyDoctor;
  }

  public void setWhetherFamilyDoctor(Byte whetherFamilyDoctor) {
    this.whetherFamilyDoctor = whetherFamilyDoctor;
  }

  public Byte getCancelPointMark() {
    return cancelPointMark;
  }

  public void setCancelPointMark(Byte cancelPointMark) {
    this.cancelPointMark = cancelPointMark;
  }

  public Byte getRemoteMark() {
    return remoteMark;
  }

  public void setRemoteMark(Byte remoteMark) {
    this.remoteMark = remoteMark;
  }

  public Byte getDutyType() {
    return dutyType;
  }

  public void setDutyType(Byte dutyType) {
    this.dutyType = dutyType;
  }

  public Byte getAvailability() {
    return availability;
  }

  public void setAvailability(Byte availability) {
    this.availability = availability;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getWorkTimeDesc() {
    return workTimeDesc;
  }

  public void setWorkTimeDesc(String workTimeDesc) {
    this.workTimeDesc = workTimeDesc;
  }

  public String getLeaderName() {
    return leaderName;
  }

  public void setLeaderName(String leaderName) {
    this.leaderName = leaderName;
  }

  public String getLeaderPhone() {
    return leaderPhone;
  }

  public void setLeaderPhone(String leaderPhone) {
    this.leaderPhone = leaderPhone;
  }

  public String getCompletionFlag() {
    return completionFlag;
  }

  public void setCompletionFlag(String completionFlag) {
    this.completionFlag = completionFlag;
  }

}
