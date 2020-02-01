package com.jc.springboot.entity;

import javax.persistence.*;
import java.util.Date;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/2/1 19:40
 * @Version 1.0
 */
//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "tb_user") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
public class User {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name = "username", length = 50) //这是和数据表对应的一个列
    private String username;
    @Column //省略默认列名就是属性名
    private Date birthday;
    @Column //省略默认列名就是属性名
    private String sex;
    @Column //省略默认列名就是属性名
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
