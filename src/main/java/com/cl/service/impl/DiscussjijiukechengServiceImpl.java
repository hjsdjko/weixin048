package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscussjijiukechengDao;
import com.cl.entity.DiscussjijiukechengEntity;
import com.cl.service.DiscussjijiukechengService;
import com.cl.entity.view.DiscussjijiukechengView;

@Service("discussjijiukechengService")
public class DiscussjijiukechengServiceImpl extends ServiceImpl<DiscussjijiukechengDao, DiscussjijiukechengEntity> implements DiscussjijiukechengService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<DiscussjijiukechengEntity> wrapper) {
		Page<DiscussjijiukechengView> page =new Query<DiscussjijiukechengView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjijiukechengEntity> page = this.selectPage(
                new Query<DiscussjijiukechengEntity>(params).getPage(),
                new EntityWrapper<DiscussjijiukechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjijiukechengEntity> wrapper) {
		  Page<DiscussjijiukechengView> page =new Query<DiscussjijiukechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussjijiukechengView> selectListView(Wrapper<DiscussjijiukechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjijiukechengView selectView(Wrapper<DiscussjijiukechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
