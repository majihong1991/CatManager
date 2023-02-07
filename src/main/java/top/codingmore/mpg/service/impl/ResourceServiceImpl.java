package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Resource;
import top.codingmore.mpg.mapper.ResourceMapper;
import top.codingmore.mpg.service.IResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台资源表 服务实现类
 * </p>
 *
 * @author Majihong
 * @since 2023-02-07
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
