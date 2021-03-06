/*
 * This file is generated by jOOQ.
 */
package com.generator.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements Serializable {

    private static final long serialVersionUID = 1936655836;

    private Integer id;
    private String  firstname;
    private String  gender;
    private String  province;
    private String  city;
    private String  phonenumber;
    private Integer age;
    private String  secondname;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.firstname = value.firstname;
        this.gender = value.gender;
        this.province = value.province;
        this.city = value.city;
        this.phonenumber = value.phonenumber;
        this.age = value.age;
        this.secondname = value.secondname;
    }

    public Users(
        Integer id,
        String  firstname,
        String  gender,
        String  province,
        String  city,
        String  phonenumber,
        Integer age,
        String  secondname
    ) {
        this.id = id;
        this.firstname = firstname;
        this.gender = gender;
        this.province = province;
        this.city = city;
        this.phonenumber = phonenumber;
        this.age = age;
        this.secondname = secondname;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSecondname() {
        return this.secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(id);
        sb.append(", ").append(firstname);
        sb.append(", ").append(gender);
        sb.append(", ").append(province);
        sb.append(", ").append(city);
        sb.append(", ").append(phonenumber);
        sb.append(", ").append(age);
        sb.append(", ").append(secondname);

        sb.append(")");
        return sb.toString();
    }
}
