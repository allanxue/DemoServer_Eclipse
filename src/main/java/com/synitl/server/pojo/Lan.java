package com.synitl.server.pojo;

// Generated Feb 27, 2015 6:23:37 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Lan generated by hbm2java
 */
@Entity
public class Lan implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private EnforcerAdvanceSettings enforcerAdvanceSettings;
	private EnforcerLogsetting enforcerLogsetting;
	private Radiusgroup radiusgroup;
	private int exchangepolicyId;
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "id")
	private Set<ExchangePolicy> exchangePolicies = new HashSet(0);

	public Lan() {
	}

	public Lan(EnforcerAdvanceSettings enforcerAdvanceSettings,
			EnforcerLogsetting enforcerLogsetting, Radiusgroup radiusgroup,
			int exchangepolicyId) {
		this.enforcerAdvanceSettings = enforcerAdvanceSettings;
		this.enforcerLogsetting = enforcerLogsetting;
		this.radiusgroup = radiusgroup;
		this.exchangepolicyId = exchangepolicyId;
	}

	public Lan(EnforcerAdvanceSettings enforcerAdvanceSettings,
			EnforcerLogsetting enforcerLogsetting, Radiusgroup radiusgroup,
			int exchangepolicyId, Set exchangePolicies) {
		this.enforcerAdvanceSettings = enforcerAdvanceSettings;
		this.enforcerLogsetting = enforcerLogsetting;
		this.radiusgroup = radiusgroup;
		this.exchangepolicyId = exchangepolicyId;
		this.exchangePolicies = exchangePolicies;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EnforcerAdvanceSettings getEnforcerAdvanceSettings() {
		return this.enforcerAdvanceSettings;
	}

	public void setEnforcerAdvanceSettings(
			EnforcerAdvanceSettings enforcerAdvanceSettings) {
		this.enforcerAdvanceSettings = enforcerAdvanceSettings;
	}

	public EnforcerLogsetting getEnforcerLogsetting() {
		return this.enforcerLogsetting;
	}

	public void setEnforcerLogsetting(EnforcerLogsetting enforcerLogsetting) {
		this.enforcerLogsetting = enforcerLogsetting;
	}

	public Radiusgroup getRadiusgroup() {
		return this.radiusgroup;
	}

	public void setRadiusgroup(Radiusgroup radiusgroup) {
		this.radiusgroup = radiusgroup;
	}

	public int getExchangepolicyId() {
		return this.exchangepolicyId;
	}

	public void setExchangepolicyId(int exchangepolicyId) {
		this.exchangepolicyId = exchangepolicyId;
	}

	public Set getExchangePolicies() {
		return this.exchangePolicies;
	}

	public void setExchangePolicies(Set exchangePolicies) {
		this.exchangePolicies = exchangePolicies;
	}

}