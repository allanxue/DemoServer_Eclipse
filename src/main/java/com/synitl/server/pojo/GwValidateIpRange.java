package com.synitl.server.pojo;

// Generated Mar 1, 2015 7:17:14 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * GwValidateIpRange generated by hbm2java
 */
public class GwValidateIpRange implements java.io.Serializable {

	private Integer id;
	private int seq;
	private Boolean enable;
	private String ip;
	private Set gwValidateRangesForTrustIpRange = new HashSet(0);
	private Set gwValidateRangesForValidateIpReange = new HashSet(0);

	public GwValidateIpRange() {
	}

	public GwValidateIpRange(int seq) {
		this.seq = seq;
	}

	public GwValidateIpRange(int seq, Boolean enable, String ip,
			Set gwValidateRangesForTrustIpRange,
			Set gwValidateRangesForValidateIpReange) {
		this.seq = seq;
		this.enable = enable;
		this.ip = ip;
		this.gwValidateRangesForTrustIpRange = gwValidateRangesForTrustIpRange;
		this.gwValidateRangesForValidateIpReange = gwValidateRangesForValidateIpReange;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Set getGwValidateRangesForTrustIpRange() {
		return this.gwValidateRangesForTrustIpRange;
	}

	public void setGwValidateRangesForTrustIpRange(
			Set gwValidateRangesForTrustIpRange) {
		this.gwValidateRangesForTrustIpRange = gwValidateRangesForTrustIpRange;
	}

	public Set getGwValidateRangesForValidateIpReange() {
		return this.gwValidateRangesForValidateIpReange;
	}

	public void setGwValidateRangesForValidateIpReange(
			Set gwValidateRangesForValidateIpReange) {
		this.gwValidateRangesForValidateIpReange = gwValidateRangesForValidateIpReange;
	}

}
