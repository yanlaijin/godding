package com.god.manager.dao;

import com.god.manager.domain.TbItem;
import com.god.manager.domain.query.QueryObject;

import java.util.List;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    List<TbItem> selectAll(QueryObject where);

    int updateByPrimaryKey(TbItem record);
}