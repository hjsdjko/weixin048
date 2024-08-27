package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JijiukechengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JijiukechengView;


/**
 * 急救课程
 *
 * @author 
 * @email 
 * @date 2024-03-15 14:37:44
 */
public interface JijiukechengService extends IService<JijiukechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JijiukechengView> selectListView(Wrapper<JijiukechengEntity> wrapper);
   	
   	JijiukechengView selectView(@Param("ew") Wrapper<JijiukechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JijiukechengEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<JijiukechengEntity> wrapper);

}

