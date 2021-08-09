package com.company;

 public class GradStudent extends Student{
     private String supName,regNo;

     public GradStudent(String supName,String regNo) {
         super("OyierSupervisor","Male",24);
     }

     public String getSupName() {
         return supName;
     }

     public void setSupName(String supName) {
         this.supName = supName;
     }

     public String getRegNo() {
         return regNo;
     }

     public void setRegNo(String regNo) {
         this.regNo = regNo;
     }
 }
