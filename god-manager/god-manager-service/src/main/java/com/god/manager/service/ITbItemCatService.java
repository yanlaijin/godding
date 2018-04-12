package com.god.manager.service;

import java.util.List;
import java.util.Map;

import com.god.manager.domain.TbItemCat;
import com.god.manager.domain.vo.Item;

public interface ITbItemCatService {
	int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    TbItemCat selectByPrimaryKey(Long id);

    List<TbItemCat> selectAll();

    int updateByPrimaryKey(TbItemCat record);
    
    Map<String, Item> selectItemCat(Long parentId);
}
