package com.cl.dao;

import com.cl.entity.JijiukechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JijiukechengView;


/**
 * 急救课程
 * 
 * @author 
 * @email 
 * @date 2024-03-15 14:37:44
 */
public interface JijiukechengDao extends BaseMapper<JijiukechengEntity> {
	
	List<JijiukechengView> selectListView(@Param("ew") Wrapper<JijiukechengEntity> wrapper);

	List<JijiukechengView> selectListView(Pagination page,@Param("ew") Wrapper<JijiukechengEntity> wrapper);
	
	JijiukechengView selectView(@Param("ew") Wrapper<JijiukechengEntity> wrapper);
	
	List<JijiukechengView> selectGroupBy(Pagination page,@Param("ew") Wrapper<JijiukechengEntity> wrapper);

}
