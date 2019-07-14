package com.liquibase.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deploys_logs")
public class DboDeploys  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="deploys_pk")
	private Integer dboDeploysId;
	
	@Column(name="ticketNo")
	private String ticketNo;
	
	@Column(name="version_Tag")
	private String versionTag;

	public Integer getDboDeploysId() {
		return dboDeploysId;
	}

	public void setDboDeploysId(Integer dboDeploysId) {
		this.dboDeploysId = dboDeploysId;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getVersionTag() {
		return versionTag;
	}

	public void setVersionTag(String versionTag) {
		this.versionTag = versionTag;
	}
	
}
