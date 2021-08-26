/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.department.Admin;
import com.department.Super.superDepartment;

/**
 *
 * @author Dell
 */
public class adminDepartment extends superDepartment{
    public String departmentName(){
        return(" Welcome to Admin department");
    }
    public String getTodaysWork(){
        return("Complete your documents Submission");
    }
    public String getWorkDeadline(){
        String st = "Complete by EOD\n" + super.isTodayAHoliday();
        return(st);
    }
}
