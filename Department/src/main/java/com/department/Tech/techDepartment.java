/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.department.Tech;
import com.department.Super.superDepartment;
/**
 *
 * @author Dell
 */
public class techDepartment extends superDepartment {
    public String departmentName(){
        return(" Welcome to Tech department");
    }
    public String getTodaysWork(){
        return("Complete coding of module 1");
    }
    public String getWorkDeadline(){
        return("Complete by EOD");
    }
    public String getTechStackInformation(){
        String st = " Core Java\n" +super.isTodayAHoliday();
        return(st);
    }
}
