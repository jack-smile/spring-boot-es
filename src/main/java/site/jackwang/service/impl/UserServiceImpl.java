package site.jackwang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.jackwang.entity.People;
import site.jackwang.repository.UserEsRepository;
import site.jackwang.service.UserService;

import java.util.List;

/**
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEsRepository userEsRepository;


    @Override
    public void addPeople(People people) {
        userEsRepository.save(people);
    }

    @Override
    public List<People> findByname(String name) {
        return userEsRepository.findByname(name);
    }
}
