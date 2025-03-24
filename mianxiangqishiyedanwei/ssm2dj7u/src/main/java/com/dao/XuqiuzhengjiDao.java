package com.dao;

import com.entity.XuqiuzhengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuqiuzhengjiVO;
import com.entity.view.XuqiuzhengjiView;


/**
 * 需求征集
 * 
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public interface XuqiuzhengjiDao extends BaseMapper<XuqiuzhengjiEntity> {
	
	List<XuqiuzhengjiVO> selectListVO(@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);
	
	XuqiuzhengjiVO selectVO(@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);
	
	List<XuqiuzhengjiView> selectListView(@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);

	List<XuqiuzhengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);
	
	XuqiuzhengjiView selectView(@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);
	

}
