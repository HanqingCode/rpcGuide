package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ResourceDao;
import com.phq.domain.entity.Resource;
import com.phq.service.ResourceService;
import org.springframework.stereotype.Service;

/**
 * (Resource)表服务实现类
 *
 * @author makejava
 * @since 2023-08-18 19:59:22
 */
@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceDao, Resource> implements ResourceService {

}

