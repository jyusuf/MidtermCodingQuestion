package MainPackage;
import java.util.Date;
import java.util.UUID;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	
	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor Major) {
		this.CourseID= CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		Major = Major;
		
	}

	UUID UUID1 = UUID.randomUUID();
	
}
