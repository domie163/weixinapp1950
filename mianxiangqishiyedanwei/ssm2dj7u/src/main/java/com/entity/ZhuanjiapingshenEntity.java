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
 * 专家评审
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
@TableName("zhuanjiapingshen")
public class ZhuanjiapingshenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuanjiapingshenEntity() {
		
	}
	
	public ZhuanjiapingshenEntity(T t) {
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
	 * 申报主题
	 */
					
	private String shenbaozhuti;
	
	/**
	 * 申报图片
	 */
					
	private String shenbaotupian;
	
	/**
	 * 申报项目
	 */
					
	private String shenbaoxiangmu;
	
	/**
	 * 主体
	 */
					
	private String zhuti;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 法人
	 */
					
	private String faren;
	
	/**
	 * 企业地址
	 */
					
	private String qiyedizhi;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 评审时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pingshenshijian;
	
	/**
	 * 评审内容
	 */
					
	private String pingshenneirong;
	
	/**
	 * 评审结果
	 */
					
	private String pingshenjieguo;
	
	
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
	 * 设置：申报主题
	 */
	public void setShenbaozhuti(String shenbaozhuti) {
		this.shenbaozhuti = shenbaozhuti;
	}
	/**
	 * 获取：申报主题
	 */
	public String getShenbaozhuti() {
		return shenbaozhuti;
	}
	/**
	 * 设置：申报图片
	 */
	public void setShenbaotupian(String shenbaotupian) {
		this.shenbaotupian = shenbaotupian;
	}
	/**
	 * 获取：申报图片
	 */
	public String getShenbaotupian() {
		return shenbaotupian;
	}
	/**
	 * 设置：申报项目
	 */
	public void setShenbaoxiangmu(String shenbaoxiangmu) {
		this.shenbaoxiangmu = shenbaoxiangmu;
	}
	/**
	 * 获取：申报项目
	 */
	public String getShenbaoxiangmu() {
		return shenbaoxiangmu;
	}
	/**
	 * 设置：主体
	 */
	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}
	/**
	 * 获取：主体
	 */
	public String getZhuti() {
		return zhuti;
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
	 * 设置：企业地址
	 */
	public void setQiyedizhi(String qiyedizhi) {
		this.qiyedizhi = qiyedizhi;
	}
	/**
	 * 获取：企业地址
	 */
	public String getQiyedizhi() {
		return qiyedizhi;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：评审时间
	 */
	public void setPingshenshijian(Date pingshenshijian) {
		this.pingshenshijian = pingshenshijian;
	}
	/**
	 * 获取：评审时间
	 */
	public Date getPingshenshijian() {
		return pingshenshijian;
	}
	/**
	 * 设置：评审内容
	 */
	public void setPingshenneirong(String pingshenneirong) {
		this.pingshenneirong = pingshenneirong;
	}
	/**
	 * 获取：评审内容
	 */
	public String getPingshenneirong() {
		return pingshenneirong;
	}
	/**
	 * 设置：评审结果
	 */
	public void setPingshenjieguo(String pingshenjieguo) {
		this.pingshenjieguo = pingshenjieguo;
	}
	/**
	 * 获取：评审结果
	 */
	public String getPingshenjieguo() {
		return pingshenjieguo;
	}

}
