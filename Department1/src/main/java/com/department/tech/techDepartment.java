package com.department.tech;
import com.department.Super.superDepartment;

public class techDepartment extends superDepartment{
    public String departmentName(){
        return(" Welcome to Tech department");
    }
    public String getTodaysWork(){
        return("Complete coding of module 1");
    }
    public String getWorkDeadline(){
        String st = "Complete by EOD";
        return(st);
    }
    public String getTechStackInformation(){
        String st = " Core Java\n" +super.isTodayAHoliday();
        return(st);
    }
}
