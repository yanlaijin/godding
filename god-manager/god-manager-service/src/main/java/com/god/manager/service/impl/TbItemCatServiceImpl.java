package com.god.manager.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.god.manager.dao.TbItemCatMapper;
import com.god.manager.dao.TbItemMapper;
import com.god.manager.domain.TbItemCat;
import com.god.manager.domain.vo.AdditionalParameters;
import com.god.manager.domain.vo.Item;
import com.god.manager.service.ITbItemCatService;

@Service
public class TbItemCatServiceImpl implements ITbItemCatService {

	@Autowired
	private TbItemCatMapper tbItemCatMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return 0;
	}

	@Override
	public int insert(TbItemCat record) {
		return 0;
	}

	@Override
	public TbItemCat selectByPrimaryKey(Long id) {
		return null;
	}

	@Override
	public List<TbItemCat> selectAll() {
		return null;
	}

	@Override
	public int updateByPrimaryKey(TbItemCat record) {
		return 0;
	}

	@Override
	public Map<String, Item> selectItemCat(Long parentId) {
		Map<String, Item> items = new LinkedHashMap<String, Item>();
		getChildNodes(items, parentId);
		return items;
	}

	private void getChildNodes(Map<String, Item> items, Long parentId) {
		List<TbItemCat> cats = tbItemCatMapper.selectAllByPid(parentId);
		if (cats.size() > 0) {
			// 递归查询子节点
			for (TbItemCat cat : cats) {
				Item item = new Item();
				getChildItems(item, cat.getId(), cat.getName());
				items.put(cat.getName(), item);
			}
		}
	}

	private void getChildItems(Item item, Long parentId, String parentName) {
		List<TbItemCat> childCats = tbItemCatMapper.selectAllByPid(parentId);
		if (childCats.size() > 0) {
			// 父节点为“folder”
			item.setText(parentName);
			item.setType(Item.NODE_FOLDER);
			//设置图标颜色
			String[] colors = {"red","origin","blue","green","pink"};
			int index = (int) (Math.random() * colors.length);
			item.setIconClass(colors[index]);
			AdditionalParameters additionalParameters = new AdditionalParameters();
			additionalParameters.setId(parentId);
			Map<String, Item> children = new LinkedHashMap<>();
			for (TbItemCat childCat : childCats) {
				Item item2 = new Item();
				getChildItems(item2, childCat.getId(), childCat.getName());
				children.put(childCat.getName(), item2);
			}
			additionalParameters.setChildren(children);
			item.setAdditionalParameters(additionalParameters);

		} else {
			// 父节点为“item”,获取当前
			item.setText(parentName);
			item.setType(Item.NODE_ITEM);
			AdditionalParameters additionalParameters = new AdditionalParameters();
			additionalParameters.setId(parentId);
			item.setAdditionalParameters(additionalParameters);
		}

	}

}
