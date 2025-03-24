package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DanweirenzhengDao;
import com.entity.DanweirenzhengEntity;
import com.service.DanweirenzhengService;
import com.entity.vo.DanweirenzhengVO;
import com.entity.view.DanweirenzhengView;

@Service("danweirenzhengService")
public class DanweirenzhengServiceImpl extends ServiceImpl<DanweirenzhengDao, DanweirenzhengEntity> implements DanweirenzhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanweirenzhengEntity> page = this.selectPage(
                new Query<DanweirenzhengEntity>(params).getPage(),
                new EntityWrapper<DanweirenzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanweirenzhengEntity> wrapper) {
		  Page<DanweirenzhengView> page =new Query<DanweirenzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanweirenzhengVO> selectListVO(Wrapper<DanweirenzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanweirenzhengVO selectVO(Wrapper<DanweirenzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanweirenzhengView> selectListView(Wrapper<DanweirenzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanweirenzhengView selectView(Wrapper<DanweirenzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
