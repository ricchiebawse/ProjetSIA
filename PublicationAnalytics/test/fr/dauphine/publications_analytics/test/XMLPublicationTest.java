package fr.dauphine.publications_analytics.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task2.XMLPublicationTask2;

public class XMLPublicationTest {

	
	
/*
	@Test
	public void should_support_one_publication() throws Exception {
		String file_name = "dblp_1.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(1,
				xb.get_number_of_publicationsB(file_name));
		
	}


	@Test
	public void sould_support_multiple_publications() throws Exception {
		String file_name = "dblp_2.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(3,
				xb.get_number_of_publicationsC(file_name));
		
	}
	

	@Test
	public void should_support_two_author_appearances() throws Exception {
		String file_name = "dblp_1.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(2,
				xb.get_number_of_author_appearancesB(file_name));
		
	}
	
	
	@Test
	public void should_support_seven_author_appearances() throws Exception {
		String file_name = "dblp_2.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(7,
				xb.get_number_of_author_appearancesC(file_name));
		
	}
	
	@Test
	public void should_have_two_as_a_mean() throws Exception {
		String file_name = "dblp_1.xml";
		double delta = 0.0;
		XMLPublication xb = new XMLPublication();
		assertEquals(2.0,
				xb.get_mean_number_of_authors_per_publicationB(file_name),delta);
		
	}
	
	@Test
	public void should_have_two_thirtythree_as_mean() throws Exception {
		String file_name = "dblp_2.xml";
		double delta = 0.004;
		XMLPublication xb = new XMLPublication();
		assertEquals(2.33,
				xb.get_mean_number_of_authors_per_publicationC(file_name),delta);
		
	}
	
	
	@Test
	public void should_support_conference_proceedings() throws Exception {
		String file_name = "dblp_3.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(3,
				xb.get_number_of_conference_proceedings(file_name));
		
	}
	
	@Test
	public void should_support_journal_articles() throws Exception {
		String file_name = "dblp_3.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(2,
				xb.get_number_of_journal_articles(file_name));
		
	}
	
	@Test
	public void should_support_books() throws Exception {
		String file_name = "dblp_3.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(2,
				xb.get_number_of_books(file_name));
		
	}
	
	@Test
	public void should_support_incollection() throws Exception {
		String file_name = "dblp_3.xml";
		XMLPublication xb = new XMLPublication();
		assertEquals(1,
				xb.get_number_of_incollection(file_name));
		
	}
	
	//User Stories 2
	@Test
	public void should_support_number_publication_authors() throws Exception {
		String file_name = "dblp_2.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("Stefano Ceri : 3\n" +
						"Piero Fraternali : 1\n" +
						"Carlo Batini : 1\n" +
						"Shamkant B. Navathe : 1\n" +
						"Raghu Ramakrishnan : 1\n" +
						"",xb.get_authors_publication(file_name));
		
	}
	
	@Test
	public void should_support_number_proceeding_authors() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("Norman W. Paton : 1\n",xb.get_authors_proceeding(file_name));
		
	}
	
	@Test
	public void should_support_number_article_authors() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("Simon Jupp : 1\n" +
						"Matthew Horridge : 1\n" +
						"Robert Stevens : 1\n",xb.get_authors_articles(file_name));
		
	}
	
	@Test
	public void should_support_number_books_authors() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("Stefano Ceri : 3\n" +
						"Piero Fraternali : 1\n" +
						"Carlo Batini : 1\n" +
						"Shamkant B. Navathe : 1\n",xb.get_authors_books(file_name));
		
	}
	
	@Test
	public void should_support_number_books_incollection_authors() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("Stefano Ceri : 3\n" +
						"Raghu Ramakrishnan : 1\n",xb.get_authors_incollections(file_name));
		
	}


	 //User Stories 3
	
	
	@Test
	public void should_support_number_publication_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("1997 : 2\n" +
						"1992 : 1\n" +
						"2004 : 1\n" +
						"2012 : 1\n",xb.get_years_publications(file_name));
		
	}
	
	@Test
	public void should_support_number_proceeding_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("2004 : 1\n",xb.get_years_proceeding(file_name));
		
	}
	
	
	@Test
	public void should_support_number_article_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("2012 : 1\n",xb.get_years_articles(file_name));
		
	}
	
	
	
	@Test
	public void should_support_number_books_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("1997 : 2\n" +
						"1992 : 1\n",xb.get_years_books(file_name));
		
	}
	
	
	@Test
	public void should_support_number_books_incollection_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("1997 : 2\n",xb.get_years_incollections(file_name));
		
	}
	
	@Test
	public void should_support_number_authors_in_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("1997 : 4\n" +
						"1992 : 3\n" +
						"2004 : 1\n" +
						"2012 : 3\n",xb.get_nb_authors_by_years(file_name));
		
	}
	/*
	@Test
	public void should_support_number_authors_proceedings_in_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("2004 : 1\n",xb.get_nb_authors_proceedings_by_years(file_name));
		
	}
	
	@Test
	public void should_support_number_authors_articles_in_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("2012 : 3\n",xb.get_nb_authors_articles_by_years(file_name));
		
	}
	
	@Test
	public void should_support_number_authors_books_in_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("1997 : 4\n" +
						"1992 : 3\n",xb.get_nb_authors_books_by_years(file_name));
		
	}
	
	@Test
	public void should_support_number_authors_incollection_in_years() throws Exception {
		String file_name = "dblp_US2-3.xml";
		XMLPublication xb = new XMLPublication();
				assertEquals("1997 : 4\n",xb.get_nb_authors_incollection_by_years(file_name));
		
	}*/
	
	@Test
	public void printResults() throws Exception {
		String file_name = "../dblp_US2-3.xml";
		XMLPublicationTask2 xb = new XMLPublicationTask2();
		System.out.println("\n\n\n");

		//US1
		//System.out.println(xb.get_number_of_publicationsC(file_name));
		//System.out.println(xb.get_number_of_author_appearancesC(file_name));
		//System.out.println(xb.get_number_of_conference_proceedings(file_name));
		//System.out.println(xb.get_number_of_journal_articles(file_name));
		//System.out.println(xb.get_number_of_books(file_name));
		//System.out.println(xb.get_number_of_incollection(file_name));
		//User Stories 2
		//System.out.println(xb.get_authors_publication(file_name));
		//System.out.println(xb.get_authors_proceeding(file_name));
		//System.out.println(xb.get_authors_articles(file_name));
		//System.out.println(xb.get_authors_books(file_name));
		//System.out.println(xb.get_authors_incollections(file_name));
		//US3
		//System.out.println(xb.get_years_publications(file_name));
		//System.out.println(xb.get_years_proceeding(file_name));
		//System.out.println(xb.get_years_articles(file_name));
		//System.out.println(xb.get_years_books(file_name));
		//System.out.println(xb.get_years_incollections(file_name));
		//US4
		//System.out.println(xb.get_nb_authors_by_years(file_name));
		//System.out.println(xb.get_nb_authors_proceedings_by_years(file_name));
		//System.out.println(xb.get_nb_authors_articles_by_years(file_name));
		//System.out.println(xb.get_nb_authors_books_by_years(file_name));
		//System.out.println(xb.get_nb_authors_incollection_by_years(file_name));
		
		
		
	}

}

