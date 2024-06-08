package edu.sf04java.student;

public class Student {

		private int id;
		private String name;
		private String deportment;
		
		
		
		
		//default constructor
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		//parameterise constuctor
		public Student(int id, String name, String deportment) {
			super();
			this.id = id;
			this.name = name;
			this.deportment = deportment;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDeportment() {
			return deportment;
		}
		public void setDeportment(String deportment) {
			this.deportment = deportment;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", deportment=" + deportment + "]";
		}
		
		
		
	}


