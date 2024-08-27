package com.cl.dao;

import com.cl.entity.DiscussjijiukechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussjijiukechengView;


/**
 * 急救课程评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-15 14:37:45
 */
public interface DiscussjijiukechengDao extends BaseMapper<DiscussjijiukechengEntity> {
	
	List<DiscussjijiukechengView> selectListView(@Param("ew") Wrapper<DiscussjijiukechengEntity> wrapper);

	List<DiscussjijiukechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjijiukechengEntity> wrapper);
	
	DiscussjijiukechengView selectView(@Param("ew") Wrapper<DiscussjijiukechengEntity> wrapper);
	
	List<DiscussjijiukechengView> selectGroupBy(Pagination page,@Param("ew") Wrapper<DiscussjijiukechengEntity> wrapper);

}
