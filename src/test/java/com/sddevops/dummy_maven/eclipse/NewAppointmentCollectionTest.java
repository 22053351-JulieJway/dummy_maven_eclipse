package com.sddevops.dummy_maven.eclipse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

//import org.junit.jupiter.api.Test;



//import com.sddevops.CWF_CodeManagement_Julie.NewAppointment_Junit;


import java.util.List;

class NewAppointmentCollectionTest {
	
	public NewAppointmentCollection_Junit ac;
	public NewAppointment_Junit ac1;
	public NewAppointment_Junit ac2;
	
	public final int APPOINTMENT_COLLECTION_SIZE = 2;
	public final int APPOINTMENT_CAPACITY_LIMIT = 2;

	@BeforeEach
	void setUp() throws Exception {
		ac = new NewAppointmentCollection_Junit();
		ac1 = new NewAppointment_Junit("T0108307J","Julie Jway","Dental appointment on 19 Dec 2022","Dr Lim", 5, "2022-12-19", "12pm", "julie@gmail.com");
		ac2 = new NewAppointment_Junit("S1345676I","Lim Yuan","Eye appointment on 21 Nov 2022","Dr Tan",4, "2022-11-21", "4pm", "limyuan@gmail.com");
		
		
		ac.addAppointment(ac1);
		ac.addAppointment(ac2);
		
		
	}




@Test
	void testAddAppointment() {
		//fail("Not yet implemented");
		List<NewAppointment_Junit> testAc = ac.getAppointments();
		//Assert that Song collection is equals to song collection size 4
		assertEquals(testAc.size(), APPOINTMENT_COLLECTION_SIZE);
		//Act - Add song function to add 1 additional song
		ac.addAppointment(ac1);
		// Assert that Song Collection is equals to song collection size 4 + 1
		// We assert that the initial song collection size is now 5
		assertEquals(ac.getAppointments().size(), APPOINTMENT_COLLECTION_SIZE);
		//means "a passed parameter must not be null": if it is null then the test case fails.
		assertNotNull(ac1);
		//Assert that Song Collection cannot be more than 5 (max capacity) 
		assertEquals(ac.getAppointments().size(),APPOINTMENT_CAPACITY_LIMIT);
	}




private void assertNotNull(NewAppointment_Junit ac12) {
	// TODO Auto-generated method stub
	
}




private void assertEquals(int size, int aPPOINTMENT_CAPACITY_LIMIT2) {
	// TODO Auto-generated method stub
	
}
	

}
