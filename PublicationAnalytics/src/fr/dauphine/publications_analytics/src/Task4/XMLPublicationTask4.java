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


public Map<String,List<String>> get_data_by_type_by_year(String file_name, String select, String sortedBy, List<String> year) {
	//Task4 - US2
	
	//Select corresponds la donnees qu'on veut recuperer
	//SortedBy c'est un filtre
	//Ex: Select="author" et SortedBy="article" : La liste des auteurs qui ont ecrit uniquement des articles
	//SortedBy="*" pour publication
	//year la donnée est filtrée par année
	
	//Ex : get_data_by_type_by_year(file_name, "title", "incollection", year)  -->  Renvoie la liste des incollection des années year sous forme de Map<String (annee) ,ArrayList<String> (titre des incollections)>

	
	List<String> rslt;
	String xml_file = getClass().getResource(file_name).toExternalForm();
	String query="";
	Map<String,List<String>> mm = new HashMap<String,List<String>>();
	String currentyear;
	
	Iterator i = year.iterator();
	
	while(i.hasNext()){
	rslt = new ArrayList<String>();
	currentyear = (String) i.next();
	query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
	"return distinct-values(for $y in $x/"+sortedBy+" where $y/year = \"" + currentyear + "\"  return $y/author/text())";

	try{
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQExpression exp = conn.createExpression();

		XQSequence seq = exp.executeQuery(query);
		String s;
		
		//if(seq.next()==true){
		while(seq.next()==true){
			s=seq.getItemAsString(null);
			rslt.add(s);
		}
		//}
		
		if (rslt.isEmpty())
			rslt.add("No Publication");
		/*else{
			if(rslt.isEmpty())
			{
				rslt.add("No publications");
			}
		}*/

		mm.put(currentyear, rslt);
		seq.close();
		
	} catch (XQException err) {
		System.out.println("Failed as expected: " + err.getMessage());
	}
	
	}
	
	return mm;
	}

	public List<String> get_year_range(int start, int stop){
		List<String> range_year= new ArrayList<String>();
		while (start <= stop){
			range_year.add(String.valueOf(start));
			start++;
		}
		return range_year;
	}

	public Map<String,Map<String,List<String>>> get_cohauthor_by_data_by_year(String file_name, Map<String,List<String>> listIterated, String sortedBy) {
		//Récupère une Map de Map : Year(String) -> auteurs(String)/Co-auteurs(List) à partir d'une Map d'auteurs par année listIterated
		//SortedBy du type : "*", "book", "inproceedings"...
		


		List<String> rslt;
		String xml_file = getClass().getResource(file_name).toExternalForm();
		String query="";
		String s="";
		String currentautor="";
		Map<String,Map<String,List<String>>> result= new HashMap<String,Map<String,List<String>>>();
		Map<String,List<String>> m = null;
		
		// On parcour la map en commençant par l'année
		for (String mapKey : listIterated.keySet()){
			
			// Pour chaque année on va itérer sur ses auteurs
			for(int i=0;i< listIterated.get(mapKey).size();i++){
				m = new HashMap<String,List<String>>();
				Iterator it = listIterated.get(mapKey).iterator();
				while(it.hasNext()){
					rslt=new ArrayList<String>();
					currentautor = (String) it.next();
					 query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
				"return distinct-values(for $y in $x/"+sortedBy+" where $y/author= \"" + currentautor + "\" and $y/year= \"" +mapKey+ "\" return $y/author/text())";
					
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
							// Pour chaque auteur on a une map de auteur -> List co-auteur
							m.put(currentautor, rslt);					
							seq.close();

						} catch (XQException err) {
							System.out.println("Failed as expected: " + err.getMessage());
						}	 
				}
				// On ajoute cette Map de Auteur et co-auteur a une Map global qui regroupe pour une annee une Map de Auteur et coAuteur
				//result.put(mapKey, m);
			}	result.put(mapKey, m);
		}
		
		
		return result;
		
		}
}

