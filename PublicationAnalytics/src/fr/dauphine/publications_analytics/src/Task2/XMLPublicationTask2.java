package fr.dauphine.publications_analytics.src.Task2;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQSequence;

import net.sf.saxon.xqj.SaxonXQDataSource;
import fr.dauphine.publications_analytics.*;

public class XMLPublicationTask2 {

	
	
	public int get_number_of_publicationsA(String file_name) {
		
		return 0;
		
	}
	
	public int get_number_of_publicationsB(String file_name) {
		
		return 1;
		
	}
	
	public int get_number_of_publicationsC(String file_name) {
		
		int number_of_publications = 0;
		
		String xml_file = getClass().getResource(file_name).toExternalForm();
		
		String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
				"return count(for $y in $x/* return 1)";
		
		System.out.println("XQuery query:"+query);

		try{
			XQDataSource ds = new SaxonXQDataSource();
			XQConnection conn = ds.getConnection();
			XQExpression exp = conn.createExpression();
	
	
			XQSequence seq = exp.executeQuery(query);			
	
			seq.next();
			
			number_of_publications = seq.getInt();
	
			System.out.println("Number of publications of is "+number_of_publications);
			
			seq.close();
	
		} catch (XQException err) {
			System.out.println("Failed as expected: " + err.getMessage());
		}
		
		return number_of_publications;
	}
	

	public int get_number_of_author_appearancesA(String file_name) {
		
		return 0;
		
	}
	
	
	
	public int get_number_of_author_appearancesB(String file_name) {
		
		return 2;
		
	}
	
	public int get_number_of_author_appearancesC(String file_name) {
		
		int number_of_author_appearances = 0;
		
		String xml_file = getClass().getResource(file_name).toExternalForm();
		
		String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
				"return count(for $y in $x/*/author return 1)";
		
		System.out.println("XQuery query:"+query);

		try{
			XQDataSource ds = new SaxonXQDataSource();
			XQConnection conn = ds.getConnection();
			XQExpression exp = conn.createExpression();
	
	
			XQSequence seq = exp.executeQuery(query);			
	
			seq.next();
			
			number_of_author_appearances = seq.getInt();
	
			System.out.println("Number of authors of is "+number_of_author_appearances);
			
			seq.close();
	
		} catch (XQException err) {
			System.out.println("Failed as expected: " + err.getMessage());
		}
		
		return number_of_author_appearances;
		
	}
	
	
	public double get_mean_number_of_authors_per_publicationA(String file_name) {
		
		double mean = 0.0;
		
		return mean;
		
	}
	
	public double get_mean_number_of_authors_per_publicationB(String file_name) {
		
		double mean = 2.0;
		
		return mean;
		
	}
	
	
	public double get_mean_number_of_authors_per_publicationC(String file_name) {
		
		double mean = 0.0;
		
		double num_publications = this.get_number_of_publicationsC(file_name);
		double num_authors = this.get_number_of_author_appearancesC(file_name);
		
		mean = num_authors/num_publications;
		
		return mean;
		
	}

public int get_number_of_conference_proceedings(String file_name) {
		
		int number_of_conference_proceedings = 0;
		
		String xml_file = getClass().getResource(file_name).toExternalForm();
		
		String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
				"return count(for $y in $x/inproceedings return 1)";
		
		System.out.println("XQuery query:"+query);

		try{
			XQDataSource ds = new SaxonXQDataSource();
			XQConnection conn = ds.getConnection();
			XQExpression exp = conn.createExpression();
	
	
			XQSequence seq = exp.executeQuery(query);			
	
			seq.next();
			
			number_of_conference_proceedings = seq.getInt();
	
			System.out.println("Number of proceedings is "+number_of_conference_proceedings);
			
			seq.close();
	
		} catch (XQException err) {
			System.out.println("Failed as expected: " + err.getMessage());
		}
		
		return number_of_conference_proceedings;
		
	}
	
public int get_number_of_journal_articles(String file_name) {
	
	int number_of_journal_articles = 0;
	
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
			"return count(for $y in $x/article return 1)";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_journal_articles = seq.getInt();

		System.out.println("Number of articles is "+number_of_journal_articles);
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_journal_articles;
	
	}

public int get_number_of_books(String file_name) {
	
	int number_of_book = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
			"return count(for $y in $x/book return 1)";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_book = seq.getInt();

		System.out.println("Number of books is "+number_of_book );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_book;
	
	}

public int get_number_of_incollection(String file_name) {
	
	int number_of_incollection = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
			"return count(for $y in $x/incollection return 1)";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_incollection = seq.getInt();

		System.out.println("Number of book chapters is "+number_of_incollection );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_incollection;
	
	}

public int get_number_of_publication_by_author(String file_name, String author) {
	
	int number_of_publication = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/* where $y/author = \"" + author + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_publication = seq.getInt();

		//System.out.println("Number of publication by "+ author + " is "+ number_of_publication );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_publication;
	
	}

public int get_number_of_publication_by_year(String file_name, String year) {
	
	int number_of_publication = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/* where $y/year = \"" + year + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_publication = seq.getInt();

		//System.out.println("Number of publication by "+ author + " is "+ number_of_publication );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_publication;
	
	}

public int get_number_of_conference_by_year(String file_name, String year) {
	
	int number_of_conference = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/inproceedings where $y/year = \"" + year + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_conference = seq.getInt();

		//System.out.println("Number of publication by "+ author + " is "+ number_of_publication );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_conference;
	
	}

public int get_number_of_articles_by_year(String file_name, String year) {
	
	int number_of_articles = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/article where $y/year = \"" + year + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_articles = seq.getInt();

		//System.out.println("Number of publication by "+ author + " is "+ number_of_publication );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_articles;
	
	}

public int get_number_of_incollections_by_year(String file_name, String year) {
	
	int number_of_incollections = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/incollection where $y/year = \"" + year + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_incollections = seq.getInt();

		//System.out.println("Number of publication by "+ author + " is "+ number_of_publication );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_incollections;
	
	}

public int get_number_of_books_by_year(String file_name, String year) {
	
	int number_of_books = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/book where $y/year = \"" + year + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_books = seq.getInt();

		//System.out.println("Number of publication by "+ author + " is "+ number_of_publication );
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_books;
	
	}

public int get_number_of_authors_by_year(String file_name, String year) {
	
	int number_of_publication = 0;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return count(for $y in $x/*/author where $y/../year = \"" + year + "\"  return 1)";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);			

		seq.next();
		
		number_of_publication = seq.getInt();
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return number_of_publication;
	
	}

public String get_authors_publication(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/*/author/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_publication_by_author(file_name, s) + "\n";
		
		}

		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_authors_proceeding(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/inproceedings/author/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_publication_by_author(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_authors_articles(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/article/author/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_publication_by_author(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_authors_books(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/book/author/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_publication_by_author(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}


public String get_authors_incollections(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/incollection/author/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_publication_by_author(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_years_publications(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/*/year/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_publication_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_years_proceeding(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/inproceedings/year/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_conference_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_years_articles(String file_name) {
	System.out.println("brux : "+file_name);

	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/article/year/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_articles_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_years_books(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/book/year/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_books_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_years_incollections(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/incollection/year/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_incollections_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_nb_authors_by_years(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/*/year/text())";
	
	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_authors_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_nb_authors_proceedings_by_years(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/inproceedings/year/text())";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_authors_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}
public String get_nb_authors_articles_by_years(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/article/year/text())";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_authors_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_nb_authors_books_by_years(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/book/year/text())";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_authors_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

public String get_nb_authors_incollection_by_years(String file_name) {
	
	String authors = "";
	String xml_file = getClass().getResource(file_name).toExternalForm();
	
	String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values($x/incollection/year/text())";

	System.out.println("XQuery query:"+query);

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();


		XQSequence seq = exp.executeQuery(query);
		//Boolean b = seq.next();
		String s;
		while(seq.next()==true){
			//seq.next();
			s = seq.getItemAsString(null);
			authors += s + " : " + get_number_of_authors_by_year(file_name, s) + "\n";
		
		}

		
		
		
		seq.close();

	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	return authors;
	
	}

}

