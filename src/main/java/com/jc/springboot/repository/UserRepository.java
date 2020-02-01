package com.jc.springboot.repository;

import com.jc.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/2/1 19:53
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
