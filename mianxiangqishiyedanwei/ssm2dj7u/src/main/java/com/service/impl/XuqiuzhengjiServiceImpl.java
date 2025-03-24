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


import com.dao.XuqiuzhengjiDao;
import com.entity.XuqiuzhengjiEntity;
import com.service.XuqiuzhengjiService;
import com.entity.vo.XuqiuzhengjiVO;
import com.entity.view.XuqiuzhengjiView;

@Service("xuqiuzhengjiService")
public class XuqiuzhengjiServiceImpl extends ServiceImpl<XuqiuzhengjiDao, XuqiuzhengjiEntity> implements XuqiuzhengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuqiuzhengjiEntity> page = this.selectPage(
                new Query<XuqiuzhengjiEntity>(params).getPage(),
                new EntityWrapper<XuqiuzhengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuqiuzhengjiEntity> wrapper) {
		  Page<XuqiuzhengjiView> page =new Query<XuqiuzhengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuqiuzhengjiVO> selectListVO(Wrapper<XuqiuzhengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuqiuzhengjiVO selectVO(Wrapper<XuqiuzhengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuqiuzhengjiView> selectListView(Wrapper<XuqiuzhengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuqiuzhengjiView selectView(Wrapper<XuqiuzhengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
