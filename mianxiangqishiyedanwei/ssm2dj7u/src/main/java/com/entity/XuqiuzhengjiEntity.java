package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 需求征集
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
@TableName("xuqiuzhengji")
public class XuqiuzhengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuqiuzhengjiEntity() {
		
	}
	
	public XuqiuzhengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 征集主题
	 */
					
	private String zhengjizhuti;
	
	/**
	 * 征集对象
	 */
					
	private String zhengjiduixiang;
	
	/**
	 * 征集时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：征集主题
	 */
	public void setZhengjizhuti(String zhengjizhuti) {
		this.zhengjizhuti = zhengjizhuti;
	}
	/**
	 * 获取：征集主题
	 */
	public String getZhengjizhuti() {
		return zhengjizhuti;
	}
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
