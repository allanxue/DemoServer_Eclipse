package com.synitl.server.pojo;

// Generated Mar 1, 2015 7:17:14 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Radiusgroup generated by hbm2java
 */
public class Radiusgroup implements java.io.Serializable {

	private Integer id;
	private Boolean nps;
	private Set radiuses = new HashSet(0);
	private Set lans = new HashSet(0);

	public Radiusgroup() {
	}

	public Radiusgroup(Boolean nps, Set radiuses, Set lans) {
		this.nps = nps;
		this.radiuses = radiuses;
		this.lans = lans;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getNps() {
		return this.nps;
	}

	public void setNps(Boolean nps) {
		this.nps = nps;
	}

	public Set getRadiuses() {
		return this.radiuses;
	}

	public void setRadiuses(Set radiuses) {
		this.radiuses = radiuses;
	}

	public Set getLans() {
		return this.lans;
	}

	public void setLans(Set lans) {
		this.lans = lans;
	}

}
