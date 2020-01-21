package com.dearbinge.data.pojo;

import java.io.Serializable;
import java.util.Date;

public class Security implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_SecurityKey
	 *
	 * @mbggenerated
	 */
	private String fSecuritykey;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_SecurityValue
	 *
	 * @mbggenerated
	 */
	private String fSecurityvalue;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_MerchantId
	 *
	 * @mbggenerated
	 */
	private String fMerchantid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_Tag
	 *
	 * @mbggenerated
	 */
	private String fTag;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_IsDelete
	 *
	 * @mbggenerated
	 */
	private Integer fIsdelete;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_CreateUser
	 *
	 * @mbggenerated
	 */
	private String fCreateuser;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_CreateTime
	 *
	 * @mbggenerated
	 */
	private Date fCreatetime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_UpdateUser
	 *
	 * @mbggenerated
	 */
	private String fUpdateuser;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_UpdateTime
	 *
	 * @mbggenerated
	 */
	private Date fUpdatetime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_security.f_Remark
	 *
	 * @mbggenerated
	 */
	private String fRemark;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_SecurityKey
	 *
	 * @return the value of t_security.f_SecurityKey
	 *
	 * @mbggenerated
	 */
	public String getfSecuritykey() {
		return fSecuritykey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_SecurityKey
	 *
	 * @param fSecuritykey
	 *            the value for t_security.f_SecurityKey
	 *
	 * @mbggenerated
	 */
	public void setfSecuritykey(String fSecuritykey) {
		this.fSecuritykey = fSecuritykey == null ? null : fSecuritykey.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_SecurityValue
	 *
	 * @return the value of t_security.f_SecurityValue
	 *
	 * @mbggenerated
	 */
	public String getfSecurityvalue() {
		return fSecurityvalue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_SecurityValue
	 *
	 * @param fSecurityvalue
	 *            the value for t_security.f_SecurityValue
	 *
	 * @mbggenerated
	 */
	public void setfSecurityvalue(String fSecurityvalue) {
		this.fSecurityvalue = fSecurityvalue == null ? null : fSecurityvalue.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_MerchantId
	 *
	 * @return the value of t_security.f_MerchantId
	 *
	 * @mbggenerated
	 */
	public String getfMerchantid() {
		return fMerchantid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_MerchantId
	 *
	 * @param fMerchantid
	 *            the value for t_security.f_MerchantId
	 *
	 * @mbggenerated
	 */
	public void setfMerchantid(String fMerchantid) {
		this.fMerchantid = fMerchantid == null ? null : fMerchantid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_Tag
	 *
	 * @return the value of t_security.f_Tag
	 *
	 * @mbggenerated
	 */
	public String getfTag() {
		return fTag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_Tag
	 *
	 * @param fTag
	 *            the value for t_security.f_Tag
	 *
	 * @mbggenerated
	 */
	public void setfTag(String fTag) {
		this.fTag = fTag == null ? null : fTag.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_IsDelete
	 *
	 * @return the value of t_security.f_IsDelete
	 *
	 * @mbggenerated
	 */
	public Integer getfIsdelete() {
		return fIsdelete;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_IsDelete
	 *
	 * @param fIsdelete
	 *            the value for t_security.f_IsDelete
	 *
	 * @mbggenerated
	 */
	public void setfIsdelete(Integer fIsdelete) {
		this.fIsdelete = fIsdelete;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_CreateUser
	 *
	 * @return the value of t_security.f_CreateUser
	 *
	 * @mbggenerated
	 */
	public String getfCreateuser() {
		return fCreateuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_CreateUser
	 *
	 * @param fCreateuser
	 *            the value for t_security.f_CreateUser
	 *
	 * @mbggenerated
	 */
	public void setfCreateuser(String fCreateuser) {
		this.fCreateuser = fCreateuser == null ? null : fCreateuser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_CreateTime
	 *
	 * @return the value of t_security.f_CreateTime
	 *
	 * @mbggenerated
	 */
	public Date getfCreatetime() {
		return fCreatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_CreateTime
	 *
	 * @param fCreatetime
	 *            the value for t_security.f_CreateTime
	 *
	 * @mbggenerated
	 */
	public void setfCreatetime(Date fCreatetime) {
		this.fCreatetime = fCreatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_UpdateUser
	 *
	 * @return the value of t_security.f_UpdateUser
	 *
	 * @mbggenerated
	 */
	public String getfUpdateuser() {
		return fUpdateuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_UpdateUser
	 *
	 * @param fUpdateuser
	 *            the value for t_security.f_UpdateUser
	 *
	 * @mbggenerated
	 */
	public void setfUpdateuser(String fUpdateuser) {
		this.fUpdateuser = fUpdateuser == null ? null : fUpdateuser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_UpdateTime
	 *
	 * @return the value of t_security.f_UpdateTime
	 *
	 * @mbggenerated
	 */
	public Date getfUpdatetime() {
		return fUpdatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_UpdateTime
	 *
	 * @param fUpdatetime
	 *            the value for t_security.f_UpdateTime
	 *
	 * @mbggenerated
	 */
	public void setfUpdatetime(Date fUpdatetime) {
		this.fUpdatetime = fUpdatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column t_security.f_Remark
	 *
	 * @return the value of t_security.f_Remark
	 *
	 * @mbggenerated
	 */
	public String getfRemark() {
		return fRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column t_security.f_Remark
	 *
	 * @param fRemark
	 *            the value for t_security.f_Remark
	 *
	 * @mbggenerated
	 */
	public void setfRemark(String fRemark) {
		this.fRemark = fRemark == null ? null : fRemark.trim();
	}
}