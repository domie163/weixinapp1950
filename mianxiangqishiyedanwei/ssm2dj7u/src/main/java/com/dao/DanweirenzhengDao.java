package com.dao;

import com.entity.DanweirenzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanweirenzhengVO;
import com.entity.view.DanweirenzhengView;


/**
 * 单位认证
 * 
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public interface DanweirenzhengDao extends BaseMapper<DanweirenzhengEntity> {
	
	List<DanweirenzhengVO> selectListVO(@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);
	
	DanweirenzhengVO selectVO(@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);
	
	List<DanweirenzhengView> selectListView(@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);

	List<DanweirenzhengView> selectListView(Pagination page,@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);
	
	DanweirenzhengView selectView(@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);
	

}
