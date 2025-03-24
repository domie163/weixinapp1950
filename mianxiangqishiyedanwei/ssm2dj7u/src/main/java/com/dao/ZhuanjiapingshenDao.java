package com.dao;

import com.entity.ZhuanjiapingshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiapingshenVO;
import com.entity.view.ZhuanjiapingshenView;


/**
 * 专家评审
 * 
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public interface ZhuanjiapingshenDao extends BaseMapper<ZhuanjiapingshenEntity> {
	
	List<ZhuanjiapingshenVO> selectListVO(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
	ZhuanjiapingshenVO selectVO(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
	List<ZhuanjiapingshenView> selectListView(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);

	List<ZhuanjiapingshenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
	ZhuanjiapingshenView selectView(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	

}
