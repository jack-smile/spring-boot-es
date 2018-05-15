package site.jackwang.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.scheduling.annotation.Async;
import site.jackwang.entity.People;

import java.util.List;
import java.util.concurrent.Future;

/**
 * 关于用户的es操作
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/15
 */
public interface UserEsRepository extends ElasticsearchRepository<People, Long> {
    /**
     * 增加用户
     *
     * @param people 用户信息
     */
    void addPeople(People people);

    /**
     * 根据名称查相应人的信息列表
     *
     * @param name 名称
     * @return 相应人的信息列表
     */
    List<People> findByname(String name);

    /**
     * 根据名字统计个数
     *
     * @param name 名称
     * @return 个数
     */
    Long countByName(String name);

    /**
     * 根据名字删除
     *
     * @param name 名称
     * @return 删除的个数
     */
    Long deleteByName(String name);

    /**
     * 异步查询，根据名称查询
     *
     * @param name
     * @return 相应的人的信息
     */
    @Async
    Future<People> findOneByUsername(String name);
}
