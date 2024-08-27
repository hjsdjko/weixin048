package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.JijiukechengEntity;
import com.cl.entity.view.JijiukechengView;

import com.cl.service.JijiukechengService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 急救课程
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 14:37:44
 */
@RestController
@RequestMapping("/jijiukecheng")
public class JijiukechengController {
    @Autowired
    private JijiukechengService jijiukechengService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JijiukechengEntity jijiukecheng,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){
        EntityWrapper<JijiukechengEntity> ew = new EntityWrapper<JijiukechengEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);

		PageUtils page = jijiukechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jijiukecheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JijiukechengEntity jijiukecheng, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){
        EntityWrapper<JijiukechengEntity> ew = new EntityWrapper<JijiukechengEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);

		PageUtils page = jijiukechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jijiukecheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JijiukechengEntity jijiukecheng){
       	EntityWrapper<JijiukechengEntity> ew = new EntityWrapper<JijiukechengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jijiukecheng, "jijiukecheng")); 
        return R.ok().put("data", jijiukechengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JijiukechengEntity jijiukecheng){
        EntityWrapper< JijiukechengEntity> ew = new EntityWrapper< JijiukechengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jijiukecheng, "jijiukecheng")); 
		JijiukechengView jijiukechengView =  jijiukechengService.selectView(ew);
		return R.ok("查询急救课程成功").put("data", jijiukechengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JijiukechengEntity jijiukecheng = jijiukechengService.selectById(id);
		jijiukecheng = jijiukechengService.selectView(new EntityWrapper<JijiukechengEntity>().eq("id", id));
        return R.ok().put("data", jijiukecheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JijiukechengEntity jijiukecheng = jijiukechengService.selectById(id);
		jijiukecheng = jijiukechengService.selectView(new EntityWrapper<JijiukechengEntity>().eq("id", id));
        return R.ok().put("data", jijiukecheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JijiukechengEntity jijiukecheng, HttpServletRequest request){
    	jijiukecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jijiukecheng);
        jijiukechengService.insert(jijiukecheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JijiukechengEntity jijiukecheng, HttpServletRequest request){
    	jijiukecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jijiukecheng);
        jijiukechengService.insert(jijiukecheng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JijiukechengEntity jijiukecheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jijiukecheng);
        jijiukechengService.updateById(jijiukecheng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jijiukechengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
