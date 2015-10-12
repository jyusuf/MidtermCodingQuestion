package MainPackage;
import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment()
	{
	}
	
	public Enrollment(UUID StudentID, UUID SectionID, UUID EnrollmentID) {
		this.EnrollmentID = EnrollmentID;
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		
	}
	
	public void setGrade(double Grade)
	{
		this.Grade = Grade;
	}
	
	public double getGrade (double Grade)
    {
        return this.Grade;
    }

	
}
