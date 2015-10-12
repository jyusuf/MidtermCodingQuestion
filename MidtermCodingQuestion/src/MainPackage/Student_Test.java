package MainPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private static ArrayList<Course> arrayList1 = new ArrayList<Course>();
	private static ArrayList<Semester> arrayList2 = new ArrayList<Semester>();
	private static ArrayList<Section> arrayList3 = new ArrayList<Section>();
	private static ArrayList<Student> arrayList4 = new ArrayList<Student>();
	private static ArrayList<Student> arrayList5 = new ArrayList<Student>();
	UUID UUID1 = UUID.randomUUID();
	@Before
	public void setUp() {
		Date currentDate = new Date();
		arrayList1.add(new Course(UUID1, "Anthropology 105", 200, eMajor.CHEM));
		arrayList1.add(new Course(UUID1, "Anthropology 105", 200, eMajor.PHYSICS));
		arrayList1.add(new Course(UUID1, "Anthropology 105", 200, eMajor.COMPSCI));
		arrayList2.add(new Semester(UUID1,  currentDate, currentDate));
		arrayList2.add(new Semester(UUID1, currentDate,  currentDate));
		arrayList3.add(new Section(UUID1, UUID1,  UUID1, UUID1));
		arrayList3.add(new Section(UUID1, UUID1,  UUID1, UUID1));
		arrayList3.add(new Section(UUID1, UUID1,  UUID1, UUID1));
		arrayList3.add(new Section(UUID1, UUID1,  UUID1, UUID1));
		arrayList3.add(new Section(UUID1, UUID1,  UUID1, UUID1));
		arrayList3.add(new Section(UUID1, UUID1,  UUID1, UUID1));
		arrayList4.add(new Student("Jama", "O", "Yusuf", currentDate,eMajor.CHEM, "1234 Spring Court", "1001001000", "Jyusuf95@gmail.com"));
		arrayList4.add(new Student("Jill", "O", "Yusuf", currentDate,eMajor.BUSINESS, "1234 Spring Court", "1001001000", "Jill@gmail.com"));
		arrayList4.add(new Student("James", "O", "Yusuf", currentDate,eMajor.COMPSCI, "1234 Spring Court", "1001001000", "James95@gmail.com"));
		arrayList4.add(new Student("Jake", "O", "Yusuf", currentDate,eMajor.PHYSICS, "1234 Spring Court", "1001001000", "Jake@gmail.com"));
		arrayList4.add(new Student("John", "O", "Yusuf", currentDate,eMajor.NURSING, "1234 Spring Court", "1001001000", "John@gmail.com"));
		arrayList4.add(new Student("Jon", "O", "Yusuf", currentDate,eMajor.CHEM, "1234 Spring Court", "1001001000", "Jon@gmail.com"));
		arrayList4.add(new Student("Jamal", "O", "Yusuf", currentDate,eMajor.BUSINESS, "1234 Spring Court", "1001001000", "Jamal@gmail.com"));
		arrayList4.add(new Student("Jorge", "O", "Yusuf", currentDate,eMajor.COMPSCI, "1234 Spring Court", "1001001000", "Jorge@gmail.com"));
		arrayList4.add(new Student("Jack", "O", "Yusuf", currentDate,eMajor.PHYSICS, "1234 Spring Court", "1001001000", "Jack@gmail.com"));
		arrayList4.add(new Student("Jose", "O", "Yusuf", currentDate,eMajor.NURSING, "1234 Spring Court", "1001001000", "Jose@gmail.com"));
		arrayList5.add(new Student(arrayList3, arrayList4));
		
	
		
	}		
		
	

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		
	
	}

}
