package ex02;

import java.util.Random;

public class EmpImpl implements Emp {

	private String name;
	private int sal;
	private String dept;
	private Random ran;
	
	public EmpImpl() {
		super();
	}

	public EmpImpl(Random ran) {
		super();
		this.ran = ran;
	}

	public EmpImpl(String name) {
		super();
		this.name = name;
	}

	public EmpImpl(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	public EmpImpl(String name, int sal, String dept) {
		super();
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}

	@Override
	public void info1() {
		System.out.println("Name: "+name);
	}

	@Override
	public void info2() {
		info1();
		System.out.println("Salary: "+sal);
	}

	@Override
	public void info3() {
		info2();
		System.out.println("Dept: "+dept);
	}

	@Override
	public void info4() {
		System.out.println("Random: "+ran.nextInt(100));
	}

}
