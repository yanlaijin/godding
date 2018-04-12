package com.god.manager.service;

import java.util.List;

import com.god.manager.domain.TbItem;
import com.god.manager.domain.query.QueryObject;

public interface ITbItemService {
	 int deleteByPrimaryKey(Long id);

	    int insert(TbItem record);

	    TbItem selectByPrimaryKey(Long id);

	    List<TbItem> selectAll(QueryObject queryObject);

	    int updateByPrimaryKey(TbItem record);
}
