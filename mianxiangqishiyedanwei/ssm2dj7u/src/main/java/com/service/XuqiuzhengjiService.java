package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuqiuzhengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuqiuzhengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuqiuzhengjiView;


/**
 * 需求征集
 *
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public interface XuqiuzhengjiService extends IService<XuqiuzhengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuqiuzhengjiVO> selectListVO(Wrapper<XuqiuzhengjiEntity> wrapper);
   	
   	XuqiuzhengjiVO selectVO(@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);
   	
   	List<XuqiuzhengjiView> selectListView(Wrapper<XuqiuzhengjiEntity> wrapper);
   	
   	XuqiuzhengjiView selectView(@Param("ew") Wrapper<XuqiuzhengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuqiuzhengjiEntity> wrapper);
   	

}

