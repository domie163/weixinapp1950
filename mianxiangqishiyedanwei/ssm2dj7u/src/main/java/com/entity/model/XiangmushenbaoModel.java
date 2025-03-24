package com.entity.model;

import com.entity.XiangmushenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 项目申报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public class XiangmushenbaoModel  implements Serializable {
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
	 * 申报程序
	 */
	
	private String shenbaochengxu;
		
	/**
	 * 申报时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenbaoshijian;
		
	/**
	 * 其他
	 */
	
	private String qita;
		
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
	 * 企业地址
	 */
	
	private String qiyedizhi;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 评审状态
	 */
	
	private String pingshenzhuangtai;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：申报程序
	 */
	 
	public void setShenbaochengxu(String shenbaochengxu) {
		this.shenbaochengxu = shenbaochengxu;
	}
	
	/**
	 * 获取：申报程序
	 */
	public String getShenbaochengxu() {
		return shenbaochengxu;
	}
				
	
	/**
	 * 设置：申报时间
	 */
	 
	public void setShenbaoshijian(Date shenbaoshijian) {
		this.shenbaoshijian = shenbaoshijian;
	}
	
	/**
	 * 获取：申报时间
	 */
	public Date getShenbaoshijian() {
		return shenbaoshijian;
	}
				
	
	/**
	 * 设置：其他
	 */
	 
	public void setQita(String qita) {
		this.qita = qita;
	}
	
	/**
	 * 获取：其他
	 */
	public String getQita() {
		return qita;
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
	 * 设置：评审状态
	 */
	 
	public void setPingshenzhuangtai(String pingshenzhuangtai) {
		this.pingshenzhuangtai = pingshenzhuangtai;
	}
	
	/**
	 * 获取：评审状态
	 */
	public String getPingshenzhuangtai() {
		return pingshenzhuangtai;
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
