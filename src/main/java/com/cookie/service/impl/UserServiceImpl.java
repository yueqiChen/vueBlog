package com.cookie.service.impl;

import com.cookie.entity.User;
import com.cookie.mapper.UserMapper;
import com.cookie.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
