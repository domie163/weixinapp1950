package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmushenbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmushenbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmushenbaoView;


/**
 * 项目申报
 *
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public interface XiangmushenbaoService extends IService<XiangmushenbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmushenbaoVO> selectListVO(Wrapper<XiangmushenbaoEntity> wrapper);
   	
   	XiangmushenbaoVO selectVO(@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);
   	
   	List<XiangmushenbaoView> selectListView(Wrapper<XiangmushenbaoEntity> wrapper);
   	
   	XiangmushenbaoView selectView(@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmushenbaoEntity> wrapper);
   	

}

