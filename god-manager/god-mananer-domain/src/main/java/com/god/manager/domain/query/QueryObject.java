package com.god.manager.domain.query;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

public class QueryObject {
	private String keyword;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date beginDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	public String getKeyword() {
		return StringUtils.isNotBlank(keyword) ? keyword.trim():null;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
