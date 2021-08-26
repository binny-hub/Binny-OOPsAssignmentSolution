/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.department.Super;

/**
 *
 * @author Dell
 */
public class superDepartment {
    protected String departmentName(){
        return("Super Department");
    }
    protected String getTodaysWork(){
        return("No work as of Now");
    }
    protected String getWorkDeadline(){
        return("Nil");
    }
    public String isTodayAHoliday(){
        return("Today is not a holiday");
    }
}
