
package com.mycompany.department1;
// Importing the classes from other packages
import com.department.Admin.adminDepartment;
import com.department.HR.hrDepartment;
import com.department.tech.techDepartment;


public class Main {

     public static void main(String args[]) {
        adminDepartment ad = new adminDepartment(); // ad is referencing SuperDepartment
        // Object is created of the class AdminDepartment
        // upcasting
      System.out.println(ad.departmentName());
      System.out.println(ad.getTodaysWork());
      System.out.println(ad.getWorkDeadline());
      System.out.println();
      hrDepartment hr = new hrDepartment(); 
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
    }
}
