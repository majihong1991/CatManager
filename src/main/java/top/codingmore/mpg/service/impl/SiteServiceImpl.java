package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Site;
import top.codingmore.mpg.mapper.SiteMapper;
import top.codingmore.mpg.service.ISiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 站点配置 服务实现类
 * </p>
 *
 * @author Majihong
 * @since 2023-02-07
 */
@Service
public class SiteServiceImpl extends ServiceImpl<SiteMapper, Site> implements ISiteService {

}
