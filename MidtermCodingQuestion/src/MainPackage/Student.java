package MainPackage;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {

	private eMajor Major;
	
	public eMajor getMajor (eMajor Major )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }

	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		
	}
	
	public Student(ArrayList<Section> arrayList3, ArrayList<Student> arrayList4) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}