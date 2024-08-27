package com.cl.entity.view;

import com.cl.entity.JijiukechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 急救课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-15 14:37:44
 */
@TableName("jijiukecheng")
public class JijiukechengView  extends JijiukechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JijiukechengView(){
	}
 
 	public JijiukechengView(JijiukechengEntity jijiukechengEntity){
 	try {
			BeanUtils.copyProperties(this, jijiukechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
