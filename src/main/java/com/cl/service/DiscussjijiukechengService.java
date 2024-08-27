package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussjijiukechengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussjijiukechengView;


/**
 * 急救课程评论表
 *
 * @author 
 * @email 
 * @date 2024-03-15 14:37:45
 */
public interface DiscussjijiukechengService extends IService<DiscussjijiukechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjijiukechengView> selectListView(Wrapper<DiscussjijiukechengEntity> wrapper);
   	
   	DiscussjijiukechengView selectView(@Param("ew") Wrapper<DiscussjijiukechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjijiukechengEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<DiscussjijiukechengEntity> wrapper);

}

