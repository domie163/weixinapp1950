package com.entity.view;

import com.entity.ZhuanjiapingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专家评审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
@TableName("zhuanjiapingshen")
public class ZhuanjiapingshenView  extends ZhuanjiapingshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanjiapingshenView(){
	}
 
 	public ZhuanjiapingshenView(ZhuanjiapingshenEntity zhuanjiapingshenEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanjiapingshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
