package fr.dauphine.publications_analytics.src.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQSequence;

import net.sf.saxon.xqj.SaxonXQDataSource;

public class XMLPublicationTask4 {

public Map<String,List<String>> get_cohauthor_by_data(String file_name, List<String> listIterated, String sortedBy) {
		//Récupère une Map : auteurs(String)/Co-auteurs(List) à partir d'une liste d'auteurs listIterated
		//SortedBy du type : "*", "book", "inproceedings"...
		


		List<String> rslt;
		String xml_file = getClass().getResource(file_name).toExternalForm();
		String query="";
		String s="";
		String currentautor="";
		Map<String,List<String>> m = new HashMap<String,List<String>>();
		
		Iterator i = listIterated.iterator();
		while(i.hasNext()){
			rslt=new ArrayList<String>();
			currentautor = (String) i.next();
			 query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
		"return distinct-values(for $y in $x/"+sortedBy+" where $y/author= \"" + currentautor + "\"  return $y/author/text())";
			
			 try{
					XQDataSource ds = new SaxonXQDataSource();
					XQConnection conn = ds.getConnection();
					XQExpression exp = conn.createExpression();


					XQSequence seq = exp.executeQuery(query);			

					while(seq.next()==true){
						s=seq.getItemAsString(null);
						
						if(!(s.equals(currentautor))){
								rslt.add(s);
						}
					}
					
					m.put(currentautor, rslt);					
					seq.close();

				} catch (XQException err) {
					System.out.println("Failed as expected: " + err.getMessage());
				}	 
		}
		
		return m;
		
		}

public List<String> get_data_by_type(String file_name, String select, String sortedBy) {
		//Task4 - US1-3
	
		//Select corresponds ˆ la donnŽes qu'on veut rŽcupŽrer
		//SortedBy c'est un filtre
		//Ex: Select="author" et SortedBy="article" : La liste des auteurs qui ont Žcrit uniquement des articles
		//SortedBy="*" pour publication
	
		//Ex : get_data_by_type(file_name, "title", "incollection")  -->  Renvoie la liste des incollection sous forme de ArrayList<String>

	
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

}
