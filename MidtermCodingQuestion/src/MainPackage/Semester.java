package MainPackage;
import java.util.UUID;
import java.util.Date;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	

	public Semester(UUID semesterID, Date startDate, Date endDate) {
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}
}
