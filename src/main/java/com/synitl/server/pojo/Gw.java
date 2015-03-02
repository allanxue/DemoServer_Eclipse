package com.synitl.server.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Generated Feb 27, 2015 6:23:37 AM by Hibernate Tools 4.3.1

/**
 * Gw generated by hbm2java
 */
@Entity
public class Gw implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private EnforcerAdvanceSettings enforcerAdvanceSettings;
	private EnforcerLogsetting enforcerLogsetting;
	private GwValidateRange gwValidateRange;
	private Integer maxPackageEachValidation;
	private Integer intervalDuringValidation;
	private Integer timeToBlockClient;
	private Integer allowTrustedClient;
	@Column(name = "allow_trusted_but_record_untrusted")
	private Boolean allowTrustedButRecordUntrusted;
	private Boolean nonHiForNonWindows;
	private Boolean policySerialNumberFirst;
	private Boolean popupForWindowsWithoutClient;
	private String popupMessage;
	private Boolean httpRedirectWithoutClient;
	private String httpRedirectUrl;
	private Integer httpRedirectPort;
	private int enabled;

	public Gw() {
	}

	public Gw(EnforcerAdvanceSettings enforcerAdvanceSettings,
			EnforcerLogsetting enforcerLogsetting,
			GwValidateRange gwValidateRange, int enabled) {
		this.enforcerAdvanceSettings = enforcerAdvanceSettings;
		this.enforcerLogsetting = enforcerLogsetting;
		this.gwValidateRange = gwValidateRange;
		this.enabled = enabled;
	}

	public Gw(EnforcerAdvanceSettings enforcerAdvanceSettings,
			EnforcerLogsetting enforcerLogsetting,
			GwValidateRange gwValidateRange, Integer maxPackageEachValidation,
			Integer intervalDuringValidation, Integer timeToBlockClient,
			Integer allowTrustedClient, Boolean allowTrustedButRecordUntrusted,
			Boolean nonHiForNonWindows, Boolean policySerialNumberFirst,
			Boolean popupForWindowsWithoutClient, String popupMessage,
			Boolean httpRedirectWithoutClient, String httpRedirectUrl,
			Integer httpRedirectPort, int enabled) {
		this.enforcerAdvanceSettings = enforcerAdvanceSettings;
		this.enforcerLogsetting = enforcerLogsetting;
		this.gwValidateRange = gwValidateRange;
		this.maxPackageEachValidation = maxPackageEachValidation;
		this.intervalDuringValidation = intervalDuringValidation;
		this.timeToBlockClient = timeToBlockClient;
		this.allowTrustedClient = allowTrustedClient;
		this.allowTrustedButRecordUntrusted = allowTrustedButRecordUntrusted;
		this.nonHiForNonWindows = nonHiForNonWindows;
		this.policySerialNumberFirst = policySerialNumberFirst;
		this.popupForWindowsWithoutClient = popupForWindowsWithoutClient;
		this.popupMessage = popupMessage;
		this.httpRedirectWithoutClient = httpRedirectWithoutClient;
		this.httpRedirectUrl = httpRedirectUrl;
		this.httpRedirectPort = httpRedirectPort;
		this.enabled = enabled;
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

	public GwValidateRange getGwValidateRange() {
		return this.gwValidateRange;
	}

	public void setGwValidateRange(GwValidateRange gwValidateRange) {
		this.gwValidateRange = gwValidateRange;
	}

	public Integer getMaxPackageEachValidation() {
		return this.maxPackageEachValidation;
	}

	public void setMaxPackageEachValidation(Integer maxPackageEachValidation) {
		this.maxPackageEachValidation = maxPackageEachValidation;
	}

	public Integer getIntervalDuringValidation() {
		return this.intervalDuringValidation;
	}

	public void setIntervalDuringValidation(Integer intervalDuringValidation) {
		this.intervalDuringValidation = intervalDuringValidation;
	}

	public Integer getTimeToBlockClient() {
		return this.timeToBlockClient;
	}

	public void setTimeToBlockClient(Integer timeToBlockClient) {
		this.timeToBlockClient = timeToBlockClient;
	}

	public Integer getAllowTrustedClient() {
		return this.allowTrustedClient;
	}

	public void setAllowTrustedClient(Integer allowTrustedClient) {
		this.allowTrustedClient = allowTrustedClient;
	}

	public Boolean getAllowTrustedButRecordUntrusted() {
		return this.allowTrustedButRecordUntrusted;
	}

	public void setAllowTrustedButRecordUntrusted(
			Boolean allowTrustedButRecordUntrusted) {
		this.allowTrustedButRecordUntrusted = allowTrustedButRecordUntrusted;
	}

	public Boolean getNonHiForNonWindows() {
		return this.nonHiForNonWindows;
	}

	public void setNonHiForNonWindows(Boolean nonHiForNonWindows) {
		this.nonHiForNonWindows = nonHiForNonWindows;
	}

	public Boolean getPolicySerialNumberFirst() {
		return this.policySerialNumberFirst;
	}

	public void setPolicySerialNumberFirst(Boolean policySerialNumberFirst) {
		this.policySerialNumberFirst = policySerialNumberFirst;
	}

	public Boolean getPopupForWindowsWithoutClient() {
		return this.popupForWindowsWithoutClient;
	}

	public void setPopupForWindowsWithoutClient(
			Boolean popupForWindowsWithoutClient) {
		this.popupForWindowsWithoutClient = popupForWindowsWithoutClient;
	}

	public String getPopupMessage() {
		return this.popupMessage;
	}

	public void setPopupMessage(String popupMessage) {
		this.popupMessage = popupMessage;
	}

	public Boolean getHttpRedirectWithoutClient() {
		return this.httpRedirectWithoutClient;
	}

	public void setHttpRedirectWithoutClient(Boolean httpRedirectWithoutClient) {
		this.httpRedirectWithoutClient = httpRedirectWithoutClient;
	}

	public String getHttpRedirectUrl() {
		return this.httpRedirectUrl;
	}

	public void setHttpRedirectUrl(String httpRedirectUrl) {
		this.httpRedirectUrl = httpRedirectUrl;
	}

	public Integer getHttpRedirectPort() {
		return this.httpRedirectPort;
	}

	public void setHttpRedirectPort(Integer httpRedirectPort) {
		this.httpRedirectPort = httpRedirectPort;
	}

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

}
