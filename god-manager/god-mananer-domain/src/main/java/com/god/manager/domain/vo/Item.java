package com.god.manager.domain.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ace-admin tree 动态数据vo
 * 
 * @author jacen
 *
 */
public class Item {
	
	public static final String NODE_FOLDER="folder";  
    
    public static final String NODE_ITEM="item";
	/**
	 * node name
	 */
	private String text;
	/**
	 * node type:'folder' or 'item'
	 */
	private String type;
	@JsonProperty(value = "icon-class")
	private String iconClass;

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	private AdditionalParameters additionalParameters;

	public AdditionalParameters getAdditionalParameters() {
		return additionalParameters;
	}

	public void setAdditionalParameters(AdditionalParameters additionalParameters) {
		this.additionalParameters = additionalParameters;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
