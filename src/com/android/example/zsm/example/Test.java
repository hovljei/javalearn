package com.android.example.zsm.example;

import com.zsm.example.Employee;
import com.zsm.example.Professor;
import com.zsm.example.Teacher;

//Object->Employee->Teacher->Professor
class Employee {
public Employee() {
System.out.println("Employee constructor called");
}
}
class Teacher extends Employee {
public Teacher() {
System.out.println("Teacher constructor called");
}
}
class Professor extends Teacher {
public Professor() {
System.out.println("Professor constructor called");
}
}
public class Test {
public static void main(String args[]) {
Employee p = new Professor();
}
}