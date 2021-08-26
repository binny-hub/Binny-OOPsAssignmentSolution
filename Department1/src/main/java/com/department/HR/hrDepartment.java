/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.department.HR;
import com.department.Super.superDepartment;
/**
 *
 * @author Dell
 */
public class hrDepartment extends superDepartment {
    public String departmentName(){
        return(" Welcome to HR  department");
    }
    public String getTodaysWork(){
        return("Fill today's worksheet and mark your attendance");
    }
    public String getWorkDeadline(){
        String st = "Complete by EOD\n" + super.isTodayAHoliday();
        return(st);
    }
    public String doActivity(){
        return("team Lunch");
    }
}
