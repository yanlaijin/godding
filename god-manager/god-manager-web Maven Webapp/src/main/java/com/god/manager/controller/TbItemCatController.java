package com.god.manager.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.god.manager.domain.vo.Item;
import com.god.manager.service.ITbItemCatService;
import com.godding.god_common.Result;

@Controller
public class TbItemCatController {
	@Autowired
	private ITbItemCatService ibItemCatService;
	
	@ResponseBody
	@RequestMapping("/getAllCat.do")
	public Result getAllCat(Long parentId) {
		Result result = new Result();
		try {
			Map<String, Item> cats = ibItemCatService.selectItemCat(parentId);
			result.setData(cats);
		} catch (Exception e) {
			result.setSuccess(false);
		}
		return result;
	}
}
