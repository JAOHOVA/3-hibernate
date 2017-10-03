package com.m2i.formation.dao.entity;

public class TravauxPratiques {

	private Long tpId;
	private String tpSubject;
	private Long tpDuration;

	public TravauxPratiques() {
	}

	public TravauxPratiques(String tpSubject, Long tpDuration) {

		this.tpSubject = tpSubject;
		this.tpDuration = tpDuration;
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getTpSubject() {
		return tpSubject;
	}

	public void setTpSubject(String tpSubject) {
		this.tpSubject = tpSubject;
	}

	public Long getTpDuration() {
		return tpDuration;
	}

	public void setTpDuration(Long tpDuration) {
		this.tpDuration = tpDuration;
	}

}
