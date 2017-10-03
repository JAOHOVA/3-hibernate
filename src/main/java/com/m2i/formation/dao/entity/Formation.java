package com.m2i.formation.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class Formation {

	private Long id;
	private String theme;
	private Set<TravauxPratiques> formationTps = new HashSet<TravauxPratiques>(0);

	// Constructeurs
	public Formation() {

	}

	public Formation(Long id) {
		this.id = id;
	}

	public Formation(String theme) {
		this.theme = theme;
	}

	public Formation(Long id, String theme) {
		this.id = id;
		this.theme = theme;
	}

	public Formation(String theme, Set<TravauxPratiques> formationTps) {
		this.theme = theme;
		this.formationTps = formationTps;
	}

	public Set<TravauxPratiques> getFormationTps() {
		return formationTps;
	}

	// Getters et Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setFormationTps(Set<TravauxPratiques> formationTps) {
		this.formationTps = formationTps;
	}
}
