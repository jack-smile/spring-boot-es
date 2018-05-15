package site.jackwang.service;

import site.jackwang.entity.People;

import java.util.List;

/**
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/15
 */
public interface UserService {
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
}
