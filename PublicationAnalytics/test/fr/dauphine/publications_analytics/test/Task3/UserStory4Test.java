package fr.dauphine.publications_analytics.test.Task3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task3.UserStory4;

public class UserStory4Test {

	@Test
	public void testQuestionA() {
		String file_name = "../dblp_US2-3.xml";
		UserStory4 xb = new UserStory4();	

		//Question A
		System.out.println("Question A ---------");
		List<Double> number_author_by_type_by_yearA= xb.question(file_name , "year", "*", "author");
				
			//Mean
			System.out.println("a:"+xb.get_mean(number_author_by_type_by_yearA));
			//assertEquals(70.7, xb.get_mean(number_author_by_type_by_yearA), 0.1);
				
			//Median
			System.out.println("b:"+xb.get_median(number_author_by_type_by_yearA));
			//assertEquals(45.5, xb.get_median(number_author_by_type_by_yearA), 0.1);
				
			//Mode
			System.out.println("c:"+xb.get_mode(number_author_by_type_by_yearA));
			//assertEquals(3.0, xb.get_mode(number_author_by_type_by_yearA), 0.1);

	}
/*
	@Test
	public void testQuestionB() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory4 xb = new UserStory4();
		
		//Question B
		System.out.println("Question B ---------");
		List<Double> number_author_by_type_by_yearB= xb.question(file_name , "year", "inproceedings", "author");
				
			//Mean
			System.out.println(xb.get_mean(number_author_by_type_by_yearB));
			assertEquals(40.0, xb.get_mean(number_author_by_type_by_yearB), 0.1);
				
			//Median
			System.out.println(xb.get_median(number_author_by_type_by_yearB));
			assertEquals(25.5, xb.get_median(number_author_by_type_by_yearB), 0.1);
				
			//Mode
			System.out.println(xb.get_mode(number_author_by_type_by_yearB));
			assertEquals(0.0, xb.get_mode(number_author_by_type_by_yearB), 0.1);
			
			System.out.println("-------Test---------");
			for(int i=0; i<number_author_by_type_by_yearB.size();i++){
				System.out.println(number_author_by_type_by_yearB.get(i));
			}
	}
	
	@Test
	public void testQuestionC() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory4 xb = new UserStory4();
		
		//Question C
		System.out.println("Question C ---------");
		List<Double> number_author_by_type_by_yearC= xb.question(file_name , "year", "article", "author");
			
			//Mean
			System.out.println(xb.get_mean(number_author_by_type_by_yearC));
			assertEquals(42.1, xb.get_mean(number_author_by_type_by_yearC), 0.1);
			
			//Median
			System.out.println(xb.get_median(number_author_by_type_by_yearC));
			assertEquals(17.0, xb.get_median(number_author_by_type_by_yearC), 0.1);
			
			//Mode
			System.out.println(xb.get_mode(number_author_by_type_by_yearC));
			assertEquals(5.0, xb.get_mode(number_author_by_type_by_yearC), 0.1);	
	}
	
	@Test
	public void testQuestionD() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory4 xb = new UserStory4();	
		
		//Question D
		System.out.println("Question D ---------");
		List<Double> number_author_by_type_by_yearD= xb.question(file_name , "year", "book", "author");
				
			//Mean
			System.out.println(xb.get_mean(number_author_by_type_by_yearD));
			assertEquals(0.8, xb.get_mean(number_author_by_type_by_yearD), 0.1);
				
			//Median
			System.out.println(xb.get_median(number_author_by_type_by_yearD));
			assertEquals(0.0, xb.get_median(number_author_by_type_by_yearD), 0.1);
				
			//Mode
			System.out.println(xb.get_mode(number_author_by_type_by_yearD));
			assertEquals(0.0, xb.get_mode(number_author_by_type_by_yearD), 0.1);
			
			System.out.println("-------Test---------");
			for(int i=0; i<number_author_by_type_by_yearD.size();i++){
				System.out.println(number_author_by_type_by_yearD.get(i));
			}
	}	
	
	@Test
	public void testQuestionE() {
		String file_name = "../dblp_curated_sample.xml";
		UserStory4 xb = new UserStory4();	
		
		//Question E
		System.out.println("Question E ---------");
		List<Double> number_author_by_type_by_yearE= xb.question(file_name , "year", "incollection", "author");
		
			//Mean
			System.out.println(xb.get_mean(number_author_by_type_by_yearE));
			assertEquals(3.2, xb.get_mean(number_author_by_type_by_yearE), 0.1);
		
			//Median
			System.out.println(xb.get_median(number_author_by_type_by_yearE));
			assertEquals(1.0, xb.get_median(number_author_by_type_by_yearE), 0.1);
		
			//Mode
			System.out.println(xb.get_mode(number_author_by_type_by_yearE));
			assertEquals(0.0, xb.get_mode(number_author_by_type_by_yearE), 0.1);
		
		System.out.println("_________________________________");
		List listTest= new ArrayList();
		listTest.add("2004");
		System.out.println(xb.get_data_by_type_by_year(file_name, "author", "inproceedings", listTest).get(0));
			
	}*/
	
}
