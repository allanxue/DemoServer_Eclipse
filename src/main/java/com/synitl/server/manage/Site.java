package com.synitl.server.manage;

import java.util.ArrayList;
import java.util.List;

import com.synitl.server.pojo.Gw;
import com.synitl.server.pojo.Lan;
import com.synitl.server.pojo.ManageServer;

/*
 * This object is used to manage the logistic data like site infrastructures, e.g how many server it has, how many 
 * enforcers has enrolled on it and what types of enforcers they are.
 */
public class Site {

	private List< Lan> lans;
	private List<Gw> gws;
	private List<ManageServer> ms;
	
	
	public List<Lan> getLans() {
		return lans;
	}
	public void setLans(List<Lan> lans) {
		this.lans = lans;
	}
	public List<Gw> getGws() {
		return gws;
	}
	public void setGws(List<Gw> gws) {
		this.gws = gws;
	}
	public List<ManageServer> getMs() {
		return ms;
	}
	public void setMs(List<ManageServer> list) {
		this.ms = list;
	} 
	
	
}
