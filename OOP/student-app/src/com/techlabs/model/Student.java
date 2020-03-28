package com.techlabs.model;
public class Student {
	private String name;
	private int id;
	private float cgpa;
	public static int count;

	static {
		count=0;
		System.out.println("inside static block\n");//it execute only once;
	}

	public Student(int id, String name, float cgpa) {
		System.out.println("inside constructor block");//it execute for every object
		count = count  + 1;
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public Student(int id, String name) {
		this(id, name, 7.0f);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public int getStudentCount() {
		return count;
	}
//headcount funciton missing
}
