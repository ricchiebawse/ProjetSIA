package fr.dauphine.publications_analytics.test.Task3;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task3.UserStory3;

public class UserStory3Test {


	@Test
	public void questionAMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory3 xb = new UserStory3();	
		
		//System.out.println(xb.questionAMean(file_name));
		//assertEquals(2.75, xb.questionAMean(file_name), 0.1);
	}
	
	@Test
	public void questionBMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory3 xb = new UserStory3();	
		
		//System.out.println(xb.questionBMean(file_name));
		//assertEquals(0.375, xb.questionBMean(file_name), 0.1);
	}
	

}
