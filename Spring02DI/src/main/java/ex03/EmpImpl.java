package ex03;

import java.util.Calendar;
import java.util.Random;

public class EmpImpl implements Emp {

	private String name;
	private Random ran;
	private Calendar cal;

	public EmpImpl() {
		super();
	}

	public Calendar getCal() {
		return cal;
	}

	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Random getRan() {
		return ran;
	}

	public void setRan(Random ran) {
		this.ran = ran;
	}

	@Override
	public void info1() {
		System.out.printf("name: %s\n", name);
	}

	@Override
	public void info2() {
		if (ran != null)
			System.out.printf("난수: %d\n", ran.nextInt(100));
		else
			System.out.println("Random객체 ran이 주입되지 않았어요~");

	}

	@Override
	public void info3() {
		System.out.println(cal.get(Calendar.YEAR));
	}

}
