package com.cookie.service.impl;

import com.cookie.entity.Blog;
import com.cookie.mapper.BlogMapper;
import com.cookie.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyueqi
 * @since 2020-10-06
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
