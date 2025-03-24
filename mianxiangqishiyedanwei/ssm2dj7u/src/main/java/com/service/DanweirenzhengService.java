package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanweirenzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanweirenzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanweirenzhengView;


/**
 * 单位认证
 *
 * @author 
 * @email 
 * @date 2022-03-26 09:24:55
 */
public interface DanweirenzhengService extends IService<DanweirenzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanweirenzhengVO> selectListVO(Wrapper<DanweirenzhengEntity> wrapper);
   	
   	DanweirenzhengVO selectVO(@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);
   	
   	List<DanweirenzhengView> selectListView(Wrapper<DanweirenzhengEntity> wrapper);
   	
   	DanweirenzhengView selectView(@Param("ew") Wrapper<DanweirenzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanweirenzhengEntity> wrapper);
   	

}

