package MainPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private static ArrayList<Staff> arrayList = new ArrayList<Staff>();
	
	
	@Before
	public void setUp() {
		Date currentDate = new Date();
		arrayList.add(new Staff("Jama", "O", "Yusuf", currentDate, "1234 Spring Court", "1001001000", "Jyusuf95@gmail.com", "Monday 3-4pm", 10, 150000, currentDate, eTitle.Professor));
		arrayList.add(new Staff("Dwight", "D", "Schrute", currentDate, "1234 Spring Court", "1031201000", "Dwight@gmail.com", "Tuesday 3-4pm", 10, 300000, currentDate, eTitle.Professor));
		arrayList.add(new Staff("Jim", "H", "Halpert", currentDate, "1234 Spring Court", "1041001300", "Jim@gmail.com", "Wednesday 3-4pm", 10, 350000, currentDate, eTitle.Professor));
		arrayList.add(new Staff("Pam", "P", "Halpert", currentDate, "1234 Spring Court", "1051001400", "Pam@gmail.com", "Thursday 3-4pm", 10, 400000, currentDate, eTitle.Researcher));
		arrayList.add(new Staff("Michael", "G", "Scott", currentDate, "1234 Spring Court", "1061001500", "Michael@gmail.com", "Friday 3-4pm", 10, 450000, currentDate, eTitle.Dean));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		int average = 0;
		for(Staff s: arrayList)
		{
			average +=s.getSalary();
		}
		average = average / arrayList.size();
		assertEquals(average, 330000);
	
		}
}
