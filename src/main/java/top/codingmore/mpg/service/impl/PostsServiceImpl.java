package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Posts;
import top.codingmore.mpg.mapper.PostsMapper;
import top.codingmore.mpg.service.IPostsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author Majihong
 * @since 2023-02-07
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
