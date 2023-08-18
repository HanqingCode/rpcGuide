package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.VideoDao;
import com.phq.domain.entity.Video;
import com.phq.service.VideoService;
import org.springframework.stereotype.Service;

/**
 * (Video)表服务实现类
 *
 * @author makejava
 * @since 2023-08-18 19:58:08
 */
@Service("videoService")
public class VideoServiceImpl extends ServiceImpl<VideoDao, Video> implements VideoService {

}

