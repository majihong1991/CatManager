package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Users;
import top.codingmore.mpg.mapper.UsersMapper;
import top.codingmore.mpg.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Majihong
 * @since 2023-02-07
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
