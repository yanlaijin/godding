package com.god.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.god.manager.dao.TbItemMapper;
import com.god.manager.domain.TbItem;
import com.god.manager.service.ITbItemService;

@Service
public class TbItemServiceImpl implements ITbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public int deleteByPrimaryKey(Long id) {
		return tbItemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TbItem record) {
		return tbItemMapper.insert(record);
	}

	@Override
	public TbItem selectByPrimaryKey(Long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TbItem> selectAll() {
		return tbItemMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(TbItem record) {
		return tbItemMapper.updateByPrimaryKey(record);
	}

}
