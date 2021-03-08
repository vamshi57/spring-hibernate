package student;



import java.util.Set;

public class Student {
	private Object phone;
	public void setPhones(Object  phone) {
		this.phone=phone;
	}
	
	@Override
	public String toString()
	{
		return "user phone number"+phone+" ";
	}
}
