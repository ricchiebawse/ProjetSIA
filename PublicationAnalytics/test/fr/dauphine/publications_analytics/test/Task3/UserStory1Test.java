package fr.dauphine.publications_analytics.test.Task3;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task3.UserStory1;

public class UserStory1Test {
	
	@Test
	public void questionAMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionAMean(file_name));
		assertEquals(2.75, xb.questionAMean(file_name), 0.1);
	}

	@Test
	public void questionBMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionBMean(file_name));
		assertEquals(3.0, xb.questionBMean(file_name), 0.1);
	}
	
	@Test
	public void questionCMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionCMean(file_name));
		assertEquals(2.5, xb.questionCMean(file_name), 0.1);
	}
	
	@Test
	public void questionDMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionDMean(file_name));
		assertEquals(2.0, xb.questionDMean(file_name), 0.1);
	}
	
	@Test
	public void questionEMean() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionEMean(file_name));
		assertEquals(3.0, xb.questionEMean(file_name), 0.1);
	}
	
	@Test
	public void questionAMedian() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionAMedian(file_name));
		assertEquals(3.0, xb.questionAMedian(file_name), 0.1);
	}
	@Test
	public void questionBMedian() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionBMedian(file_name));
		assertEquals(3.0, xb.questionBMedian(file_name), 0.1);
	}
	@Test
	public void questionCMedian() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionCMedian(file_name));
		assertEquals(2.5, xb.questionCMedian(file_name), 0.1);
	}
	@Test
	public void questionDMedian() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionDMedian(file_name));
		assertEquals(2.0, xb.questionDMedian(file_name), 0.1);
	}
	@Test
	public void questionAMode() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionAMode(file_name));
		assertEquals(3.0, xb.questionAMode(file_name), 0.1);
	}
	@Test
	public void questionBMode() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionBMode(file_name));
		assertEquals(3.0, xb.questionBMode(file_name), 0.1);
	}
	@Test
	public void questionCMode() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionCMode(file_name));
		assertEquals(1.0, xb.questionCMode(file_name), 0.1);
	}
	@Test
	public void questionDMode() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionDMode(file_name));
		assertEquals(2.0, xb.questionDMode(file_name), 0.1);
	}
	@Test
	public void questionEMode() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		//System.out.println(xb.questionEMode(file_name));
		assertEquals(3.0, xb.questionEMode(file_name), 0.1);
	}
	
}
