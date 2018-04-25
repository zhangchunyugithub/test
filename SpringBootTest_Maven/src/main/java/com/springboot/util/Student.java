package com.springboot.util;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther zhangchy
 * @create 2018/1/18
 */
//@Service
public class Student implements Serializable{

    private Date dateToSchool;

    private String vlie;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVlie() {
        return vlie;
    }


    public Date getDateToSchool() {
        return dateToSchool;
    }

    public void setDateToSchool(Date dateToSchool) {
        this.dateToSchool = dateToSchool;
    }

    public void setVlie(String vlie) {
        this.vlie = vlie;
    }

    enum Car {
        DAZHONG, BAOMA
    }

    private void test1(Car car) {
        switch (car) {
            case BAOMA:
                break;
            case DAZHONG:
                break;
            default:
                break;
        }
    }

}
