package com.god.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.god.manager.domain.TbItem;
import com.god.manager.domain.query.Page;
import com.god.manager.domain.query.QueryObject;
import com.god.manager.service.ITbItemService;

@Controller
public class TbItemController {
	@Autowired
	private ITbItemService tbItemService;
	
	@RequestMapping("/selectList.do")
	public String selectList(ModelMap map,@ModelAttribute("query") Page query,@ModelAttribute("qo")QueryObject qo) {
		PageHelper.startPage(query.getPageNum(), query.getPageSize());
		PageInfo<TbItem> dataInfo = new PageInfo<TbItem>(tbItemService.selectAll(qo));
		map.put("data", dataInfo);
		return "goods";
	}
}
