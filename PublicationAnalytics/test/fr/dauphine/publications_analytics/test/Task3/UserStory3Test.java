package fr.dauphine.publications_analytics.test.Task3;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task3.UserStory3;

public class UserStory3Test {

	@Test
	public void questionAMean() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	

		System.out.println(xb.questionAMean(file_name));
		//assertEquals(27.41, xb.questionAMean(file_name), 0.1);
	}
	
	@Test
	public void questionBMean() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
	
		System.out.println(xb.questionBMean(file_name));
		//assertEquals(10.84, xb.questionBMean(file_name), 0.1);
	}
	

	@Test
	public void questionCMean() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionCMean(file_name));
		//assertEquals(15.5, xb.questionCMean(file_name), 0.1);
	}
	
	@Test
	public void questionDMean() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionDMean(file_name));
		//assertEquals(0.27, xb.questionDMean(file_name), 0.1);
	}
	@Test
	public void questionEMean() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionEMean(file_name));
		//assertEquals(1.3, xb.questionEMean(file_name), 0.1);
	}
	
	@Test
	public void questionAMedian() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionAMedian(file_name));
		//assertEquals(17.5, xb.questionAMedian(file_name), 0.1);
	}
	@Test
	public void questionBMedian() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionBMedian(file_name));
		//assertEquals(7.0, xb.questionBMedian(file_name), 0.1);
	}
	@Test
	public void questionCMedian() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionCMedian(file_name));
		//assertEquals(10.0, xb.questionCMedian(file_name), 0.1);
	}
	@Test
	public void questionDMedian() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionDMedian(file_name));
		//assertEquals(0.0, xb.questionDMedian(file_name), 0.1);
	}
	@Test
	public void questionEMedian() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionEMedian(file_name));
		//assertEquals(0.5, xb.questionEMedian(file_name), 0.1);
	}
	
	@Test
	public void questionAMode() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionAMode(file_name));
		//assertEquals(4.0, xb.questionAMode(file_name), 0.1);
	}
	@Test
	public void questionBMode() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionBMode(file_name));
		//assertEquals(2.0, xb.questionBMode(file_name), 0.1);
	}
	@Test
	public void questionCMode() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionCMode(file_name));
		//assertEquals(1.0, xb.questionCMode(file_name), 0.1);
	}
	@Test
	public void questionDMode() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionDMode(file_name));
		//assertEquals(0.0, xb.questionDMode(file_name), 0.1);
	}
	@Test
	public void questionEMode() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory3 xb = new UserStory3();	
		
		System.out.println(xb.questionEMode(file_name));
		//assertEquals(0.0, xb.questionEMode(file_name), 0.1);
	}
	
}
