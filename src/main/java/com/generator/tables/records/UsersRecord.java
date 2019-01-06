/*
 * This file is generated by jOOQ.
 */
package com.generator.tables.records;


import com.generator.tables.Users;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record8<Integer, String, String, String, String, String, Integer, String> {

    private static final long serialVersionUID = 1925710713;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.users.firstname</code>.
     */
    public void setFirstname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.users.gender</code>.
     */
    public void setGender(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.gender</code>.
     */
    public String getGender() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.province</code>.
     */
    public void setProvince(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.province</code>.
     */
    public String getProvince() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.city</code>.
     */
    public void setCity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.city</code>.
     */
    public String getCity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.users.phonenumber</code>.
     */
    public void setPhonenumber(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.phonenumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.users.age</code>.
     */
    public void setAge(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.users.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.users.secondname</code>.
     */
    public void setSecondname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.users.secondname</code>.
     */
    public String getSecondname() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.PROVINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Users.USERS.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Users.USERS.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Users.USERS.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Users.USERS.SECONDNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSecondname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSecondname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setProvince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value8(String value) {
        setSecondname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String firstname, String gender, String province, String city, String phonenumber, Integer age, String secondname) {
        super(Users.USERS);

        set(0, id);
        set(1, firstname);
        set(2, gender);
        set(3, province);
        set(4, city);
        set(5, phonenumber);
        set(6, age);
        set(7, secondname);
    }
}
