/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.department;
import com.department.Admin.adminDepartment;
import com.department.HR.hrDepartment;
import com.department.Tech.techDepartment;

public class department {
      public static void main(String args[]) {
        adminDepartment ad = new adminDepartment(); // ad is referencing SuperDepartment
        // Object is created of the class AdminDepartment
        // upcasting
      System.out.println(ad.departmentName());
      System.out.println(ad.getTodaysWork());
      System.out.println(ad.getWorkDeadline());
      System.out.println();
      hrDepartment hr = new hrDepartment(); 
      // hr object is created of HRDepartment and referencing HrDepartment 
      // since doActivity method is not present in super class
      System.out.println(hr.departmentName());
      System.out.println(hr.doActivity());
      System.out.println(hr.getTodaysWork());
      System.out.println(hr.getWorkDeadline());
      System.out.println();
      //th is referencing SuperDepartment and object of TechDepartment
      techDepartment th = new techDepartment();
      System.out.println(th.departmentName());
      System.out.println(th.getTodaysWork());
      System.out.println(th.getWorkDeadline());
      System.out.println(th.getTechStackInformation()); 
      System.out.println();
    
        // TODO code application logic here
    }
}
