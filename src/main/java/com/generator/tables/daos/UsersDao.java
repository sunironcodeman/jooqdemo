/*
 * This file is generated by jOOQ.
 */
package com.generator.tables.daos;


import com.generator.tables.Users;
import com.generator.tables.records.UsersRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class UsersDao extends DAOImpl<UsersRecord, com.generator.tables.pojos.Users, Integer> {

    /**
     * Create a new UsersDao without any configuration
     */
    public UsersDao() {
        super(Users.USERS, com.generator.tables.pojos.Users.class);
    }

    /**
     * Create a new UsersDao with an attached configuration
     */
    public UsersDao(Configuration configuration) {
        super(Users.USERS, com.generator.tables.pojos.Users.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.generator.tables.pojos.Users object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchById(Integer... values) {
        return fetch(Users.USERS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.generator.tables.pojos.Users fetchOneById(Integer value) {
        return fetchOne(Users.USERS.ID, value);
    }

    /**
     * Fetch records that have <code>firstname IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchByFirstname(String... values) {
        return fetch(Users.USERS.FIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>gender IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchByGender(String... values) {
        return fetch(Users.USERS.GENDER, values);
    }

    /**
     * Fetch records that have <code>province IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchByProvince(String... values) {
        return fetch(Users.USERS.PROVINCE, values);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchByCity(String... values) {
        return fetch(Users.USERS.CITY, values);
    }

    /**
     * Fetch records that have <code>phonenumber IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchByPhonenumber(String... values) {
        return fetch(Users.USERS.PHONENUMBER, values);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchByAge(Integer... values) {
        return fetch(Users.USERS.AGE, values);
    }

    /**
     * Fetch records that have <code>secondname IN (values)</code>
     */
    public List<com.generator.tables.pojos.Users> fetchBySecondname(String... values) {
        return fetch(Users.USERS.SECONDNAME, values);
    }
}
