package fr.dauphine.publications_analytics.src.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQSequence;

import net.sf.saxon.xqj.SaxonXQDataSource;



public class UserStory4 extends XMLPublicationTask3{
	
	public List<Double> get_data_by_type_by_year(String file_name, String select, String sortedBy, List year) {
		//US4

		List<Double> number_author_by_year =new ArrayList<Double>();
		
		List<String> rslt = new ArrayList<String>();
		String xml_file = getClass().getResource(file_name).toExternalForm();
		String query="";
		
		Iterator i = year.iterator();
		
		while(i.hasNext()){
		query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
		"return distinct-values(for $y in $x/"+sortedBy+" where $y/year = \"" + i.next() + "\"  return $y/author/text())";

		try{
			XQDataSource ds = new SaxonXQDataSource();
			XQConnection conn = ds.getConnection();
			XQExpression exp = conn.createExpression();

			XQSequence seq = exp.executeQuery(query);
			String s;
			
			while(seq.next()==true){
				s=seq.getItemAsString(null);
				rslt.add(s);
			}
	
			seq.close();
			if (rslt.size() == 0){
				number_author_by_year.add((double) 0);
			}
			else{
				number_author_by_year.add((double) rslt.size());
			}
			
			rslt.clear();

		} catch (XQException err) {
			System.out.println("Failed as expected: " + err.getMessage());
		}
		
		}
		
		return number_author_by_year;
		
		}
	

	public List<String> get_data_by_type(String file_name, String select, String sortedBy) {
	
		List<String> rslt = new ArrayList<String>();
		String xml_file = getClass().getResource(file_name).toExternalForm();
		
		String query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
		"return distinct-values($x/"+sortedBy+"/"+select+"/text())";
		
		int total=0;
		try{
			XQDataSource ds = new SaxonXQDataSource();
			XQConnection conn = ds.getConnection();
			XQExpression exp = conn.createExpression();

			XQSequence seq = exp.executeQuery(query);
			String s;
			
			while(seq.next()==true){
				rslt.add(seq.getItemAsString(null));
			
			}
	
			seq.close();

		} catch (XQException err) {
			System.out.println("Failed as expected: " + err.getMessage());
		}
		
		return rslt;
		
		}

	public List get_allYear(List list){
		// verifier list non vide
		int anneeMin= 3000;
		int anneeMax= 0;
		
		for(int i=0; i<list.size();i++){
			int annee = Integer.parseInt((String) list.get(i));
			if (annee !=0 && annee < anneeMin)
				anneeMin= annee;
			if (annee !=0 && annee > anneeMax)
				anneeMax= annee;
		}
		
		List allYear = new ArrayList();
		while(anneeMin <= anneeMax){
			allYear.add(anneeMin);
			anneeMin++;
		}

		return allYear;
	}
	
	public List<Double> question (String file_name , String firstData, String publicationType, String secondData){
		//Number of authors who wrote incollection in a year
		List<String> list_Year = get_data_by_type(file_name, firstData, publicationType);
		List list_allYear = get_allYear(list_Year);
		
		return get_data_by_type_by_year(file_name, secondData, publicationType, list_allYear);
	}

}
