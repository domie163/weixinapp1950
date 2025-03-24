package com.entity.model;

import com.entity.XuqiuzhengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 需求征集
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public class XuqiuzhengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 征集对象
	 */
	
	private String zhengjiduixiang;
		
	/**
	 * 征集时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhengjishijian;
		
	/**
	 * 征集要求
	 */
	
	private String zhengjiyaoqiu;
		
	/**
	 * 征集图片
	 */
	
	private String zhengjitupian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 法人
	 */
	
	private String faren;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：征集对象
	 */
	 
	public void setZhengjiduixiang(String zhengjiduixiang) {
		this.zhengjiduixiang = zhengjiduixiang;
	}
	
	/**
	 * 获取：征集对象
	 */
	public String getZhengjiduixiang() {
		return zhengjiduixiang;
	}
				
	
	/**
	 * 设置：征集时间
	 */
	 
	public void setZhengjishijian(Date zhengjishijian) {
		this.zhengjishijian = zhengjishijian;
	}
	
	/**
	 * 获取：征集时间
	 */
	public Date getZhengjishijian() {
		return zhengjishijian;
	}
				
	
	/**
	 * 设置：征集要求
	 */
	 
	public void setZhengjiyaoqiu(String zhengjiyaoqiu) {
		this.zhengjiyaoqiu = zhengjiyaoqiu;
	}
	
	/**
	 * 获取：征集要求
	 */
	public String getZhengjiyaoqiu() {
		return zhengjiyaoqiu;
	}
				
	
	/**
	 * 设置：征集图片
	 */
	 
	public void setZhengjitupian(String zhengjitupian) {
		this.zhengjitupian = zhengjitupian;
	}
	
	/**
	 * 获取：征集图片
	 */
	public String getZhengjitupian() {
		return zhengjitupian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：法人
	 */
	 
	public void setFaren(String faren) {
		this.faren = faren;
	}
	
	/**
	 * 获取：法人
	 */
	public String getFaren() {
		return faren;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
