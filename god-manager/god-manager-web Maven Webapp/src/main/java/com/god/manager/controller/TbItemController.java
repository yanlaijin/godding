package com.god.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.god.manager.domain.TbItem;
import com.god.manager.service.ITbItemService;

@Controller
public class TbItemController {
	@Autowired
	private ITbItemService tbItemService;
	
	@RequestMapping("/selectList.do")
	@ResponseBody
	public PageInfo<TbItem> selectList(ModelMap map) {
		PageHelper.startPage(1, 10);
		PageInfo<TbItem> dataInfo = new PageInfo<TbItem>(tbItemService.selectAll());
		map.put("data", dataInfo);
		return dataInfo;
	}
}
