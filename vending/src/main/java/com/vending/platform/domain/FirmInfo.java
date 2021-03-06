package com.vending.platform.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * T_Firm_Info映射类： 公司信息表，包括系统管理员、厂商和运营商
 * 
 * @author Miley_Ren
 */
public class FirmInfo implements Serializable {
	/** 序列号 */
	private static final long serialVersionUID = -3294054543209879646L;
	/** 公司ID */
	private Integer firmId;
	/**公司编号*/
	private String firmNo;
	/** 公司名称 */
	private String firmName;
	/** 公司描述 */
	private String firmDesc;
	/** 公司类型：0：系统管理员；1：运营商；2：厂商 */
	private int firmType;
	/** 公司状态：0：不可用；1：可用 */
	private int firmStatus;
	/** 操作人ID */
	private int operateId;
	/** 操作时间 */
	private Date operateDate;

	public FirmInfo() {
		super();
	}

	public Integer getFirmId() {
		return firmId;
	}

	public void setFirmId(Integer firmId) {
		this.firmId = firmId;
	}

	public String getFirmNo() {
		return firmNo;
	}

	public void setFirmNo(String firmNo) {
		this.firmNo = firmNo;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getFirmDesc() {
		return firmDesc;
	}

	public void setFirmDesc(String firmDesc) {
		this.firmDesc = firmDesc;
	}

	public int getFirmType() {
		return firmType;
	}

	public void setFirmType(int firmType) {
		this.firmType = firmType;
	}

	public int getFirmStatus() {
		return firmStatus;
	}

	public void setFirmStatus(int firmStatus) {
		this.firmStatus = firmStatus;
	}

	public int getOperateId() {
		return operateId;
	}

	public void setOperateId(int operateId) {
		this.operateId = operateId;
	}

	public Date getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	@Override
	public String toString() {
		return "FirmInfo [firmId=" + firmId + ", firmName=" + firmName + ", firmDesc=" + firmDesc + ", firmType="
				+ firmType + ", firmStatus=" + firmStatus + ", operateId=" + operateId + ", operateDate=" + operateDate
				+ "]";
	}
}
