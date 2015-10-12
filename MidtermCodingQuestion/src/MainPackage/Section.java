package MainPackage;
import java.util.Date;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private UUID RoomID;
	
	

	public Section(UUID courseID, UUID semesterID, UUID sectionID, UUID roomID) {
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}

}
