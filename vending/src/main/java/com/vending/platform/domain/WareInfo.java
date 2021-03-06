package com.vending.platform.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * T_Ware_Info:商品信息表
 *
 * @author Miley_Ren
 */
public class WareInfo implements Serializable {
	/** 序列号 */
	private static final long serialVersionUID = -3601449521375525963L;

	/** 商品ID */
	private Integer wareId;
	/** 商品编号 */
	private String wareCode;
	/** 商品名称 */
	private String wareName;
	/** 商品规格，如：每箱多少瓶 */
	private String wareNorm;
	/** 商品单位 */
	private String wareUnit;
	/** 商品进价 */
	private double wareBasePrice;
	/** 最高售价 */
	private double wareMaxPrice;
	/** 最低售价 */
	private double wareMinPrice;
	/** 商品描述 */
	private String wareDesc;
	/** 是否可用 */
	private Integer wareStatus;
	/** 所属运营商ID */
	private Integer firmId;
	/** 商品状态：0：可用；1：不可用 */
	/** 操作者 */
	private Integer operateId;
	/** 操作时间 */
	private Date operateDate;

	public WareInfo() {
		super();
	}

	public Integer getWareId() {
		return wareId;
	}

	public void setWareId(Integer wareId) {
		this.wareId = wareId;
	}

	public String getWareCode() {
		return wareCode;
	}

	public void setWareCode(String wareCode) {
		this.wareCode = wareCode;
	}

	public String getWareName() {
		return wareName;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

	public String getWareNorm() {
		return wareNorm;
	}

	public void setWareNorm(String wareNorm) {
		this.wareNorm = wareNorm;
	}

	public String getWareUnit() {
		return wareUnit;
	}

	public void setWareUnit(String wareUnit) {
		this.wareUnit = wareUnit;
	}

	public double getWareBasePrice() {
		return wareBasePrice;
	}

	public void setWareBasePrice(double wareBasePrice) {
		this.wareBasePrice = wareBasePrice;
	}

	public double getWareMaxPrice() {
		return wareMaxPrice;
	}

	public void setWareMaxPrice(double wareMaxPrice) {
		this.wareMaxPrice = wareMaxPrice;
	}

	public double getWareMinPrice() {
		return wareMinPrice;
	}

	public void setWareMinPrice(double wareMinPrice) {
		this.wareMinPrice = wareMinPrice;
	}

	public String getWareDesc() {
		return wareDesc;
	}

	public void setWareDesc(String wareDesc) {
		this.wareDesc = wareDesc;
	}

	public Integer getWareStatus() {
		return wareStatus;
	}

	public void setWareStatus(Integer wareStatus) {
		this.wareStatus = wareStatus;
	}

	public Integer getFirmId() {
		return firmId;
	}

	public void setFirmId(Integer firmId) {
		this.firmId = firmId;
	}

	public Integer getOperateId() {
		return operateId;
	}

	public void setOperateId(Integer operateId) {
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
		return "WareInfo [wareId=" + wareId + ", wareCode=" + wareCode + ", wareName=" + wareName + ", wareNorm="
				+ wareNorm + ", wareUnit=" + wareUnit + ", wareBasePrice=" + wareBasePrice + ", wareMaxPrice="
				+ wareMaxPrice + ", wareMinPrice=" + wareMinPrice + ", wareDesc=" + wareDesc + ", firmId=" + firmId
				+ ", operateId=" + operateId + ", operateDate=" + operateDate + "]";
	}
}
