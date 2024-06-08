package edu.sf04java.student;

public class Runner {

	public static void main(String[] args) {
		
		Student s1=new Student();
		System.out.println(s1);
		
		//parameterised constructor
		
		Student s2=new Student(101,"raju","AIML");
		System.out.println(s2);

	}

}
