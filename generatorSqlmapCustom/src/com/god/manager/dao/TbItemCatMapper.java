package com.god.manager.dao;

import com.god.manager.domain.TbItemCat;
import java.util.List;

public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    TbItemCat selectByPrimaryKey(Long id);

    List<TbItemCat> selectAll();

    int updateByPrimaryKey(TbItemCat record);
}