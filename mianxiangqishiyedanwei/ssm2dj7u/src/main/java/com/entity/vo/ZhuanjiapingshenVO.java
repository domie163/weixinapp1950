package com.entity.vo;

import com.entity.ZhuanjiapingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 专家评审
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public class ZhuanjiapingshenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
