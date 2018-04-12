package com.god.manager.domain.vo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalParameters {
	/**
	 * node id
	 */
	private Long id;

	/**
	 * subnode ifno
	 */
	private Map<String, Item> children = new HashMap<String, Item>();

	/**
	 * node chosen
	 */
	@JsonProperty(value = "item-selected")
	private boolean itemSelected;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<String, Item> getChildren() {
		return children;
	}

	public void setChildren(Map<String, Item> children) {
		this.children = children;
	}

	public boolean isItemSelected() {
		return itemSelected;
	}

	public void setItemSelected(boolean itemSelected) {
		this.itemSelected = itemSelected;
	}
}
