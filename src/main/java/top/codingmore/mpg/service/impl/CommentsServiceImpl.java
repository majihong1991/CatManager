package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Comments;
import top.codingmore.mpg.mapper.CommentsMapper;
import top.codingmore.mpg.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author Majihong
 * @since 2023-02-07
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
