package com.GetterSetterInjection.CollectionsInjection.set;

import java.util.Set;

public class Fish {
	private String genusName;
	private Set<String> speciesName;

	public String getGenusName() {
		return genusName;
	}

	public void setGenusName(String genusName) {
		this.genusName = genusName;
	}

	public Set<String> getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(Set<String> speciesName) {
		this.speciesName = speciesName;
	}

}
