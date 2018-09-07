package com.springboot.property;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseProperty implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Property> property = new ArrayList<>();

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}
}
