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


import com.cl.dao.JijiukechengDao;
import com.cl.entity.JijiukechengEntity;
import com.cl.service.JijiukechengService;
import com.cl.entity.view.JijiukechengView;

@Service("jijiukechengService")
public class JijiukechengServiceImpl extends ServiceImpl<JijiukechengDao, JijiukechengEntity> implements JijiukechengService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<JijiukechengEntity> wrapper) {
		Page<JijiukechengView> page =new Query<JijiukechengView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JijiukechengEntity> page = this.selectPage(
                new Query<JijiukechengEntity>(params).getPage(),
                new EntityWrapper<JijiukechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JijiukechengEntity> wrapper) {
		  Page<JijiukechengView> page =new Query<JijiukechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JijiukechengView> selectListView(Wrapper<JijiukechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JijiukechengView selectView(Wrapper<JijiukechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
