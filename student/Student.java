package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Santhosh");
	}
public void studentDept() {
	
	System.out.println("Mechanical");
}
public void studentId() {
	
	System.out.println("1927504");
}
	


	public static void main(String[] args) {
		
		 Department obj = new Department();
		 obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		Student stu= new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
		

	}

}
