package fr.dauphine.publications_analytics.src.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQSequence;

import net.sf.saxon.xqj.SaxonXQDataSource;

public class XMLPublicationTask3 {
	
	public static double median(List<Double> m) {
	    int middle = (m.size()/2);
	    if (m.size()%2 == 1) {//impair
	        return m.get(middle);
	    } else {//pair
	        return (m.get(middle-1) + m.get(middle)) / 2.0;
	    }
	}

	public static double mode(List<Double> m) {
	    double maxValue = 0;
	    int maxCount = 0;

	    for (int i = 0; i < m.size(); ++i) {
	        int count = 0;
	        for (int j = 0; j < m.size(); ++j) {
	            if (m.get(j).equals( m.get(i))) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = m.get(i);
	        }
	    }

	    return maxValue;
	}
	
	public List<Double> get_number_of_publication_by_data(String file_name, List<String> listIterated, String typeWhere, String typePublication) {
		//US 2
		
		//La liste de String est parcourue, et pour chaque élement de cette liste,
		//on vérifie qu'elle est le nombre de publication du type typePublication (ex: *, book, inproceedings etc...)
		//Par ex : listIterated=liste d'author et typeWhere="author" et typePublication = inproceedings,
		//on récupère une liste qui contient pour chaque author, le nombre d'auteurs : ( 2 3 9 )
		
		
		List<Double> rslt=new ArrayList<Double>();
		String xml_file = getClass().getResource(file_name).toExternalForm();
		String query="";
		
		Iterator i = listIterated.iterator();
		while(i.hasNext()){
			 query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
		"return count(for $y in $x/"+typePublication+" where $y/"+typeWhere+" = \"" + i.next() + "\"  return 1)";
			
			 try{
					XQDataSource ds = new SaxonXQDataSource();
					XQConnection conn = ds.getConnection();
					XQExpression exp = conn.createExpression();


					XQSequence seq = exp.executeQuery(query);			

					seq.next();
					
					rslt.add((double)seq.getInt());
					
					seq.close();

				} catch (XQException err) {
					System.out.println("Failed as expected: " + err.getMessage());
				}	 
		}
		
		return rslt;
		
		}
	
	
public List<Double> get_number_of_author_by_data(String file_name, List<String> listIterated, String typeWhere) {
		//US1
	
		//La liste de String est parcourue, et pour chaque élement de cette liste,
		//on vérifie qu'elle est le nombre d'author correspondant
		//Par ex : listIterated=liste d'articles et typeWhere="title", on récupère une
		//liste qui contient pour chaque article, le nombre d'auteurs : ( 2 3 9 )
		
		//get_number_of_author_by_data(file_name,xb.get_data_by_type(file_name, "title", "*") , "title") : Renvoie une ArrayList<Double>
		//qui contient la nombre d'author par publication


		
		List<Double> rslt=new ArrayList<Double>();
		String xml_file = getClass().getResource(file_name).toExternalForm();
		String query="";
		
		Iterator i = listIterated.iterator();
		while(i.hasNext()){
			 query = "for $x in doc(\"" +xml_file+ "\")/dblp " +
		"return count(for $y in $x/*/author where $y/../"+typeWhere+" = \"" + i.next() + "\"  return 1)";
			
			 try{
					XQDataSource ds = new SaxonXQDataSource();
					XQConnection conn = ds.getConnection();
					XQExpression exp = conn.createExpression();


					XQSequence seq = exp.executeQuery(query);			

					seq.next();
					
					rslt.add((double)seq.getInt());
					
					seq.close();

				} catch (XQException err) {
					System.out.println("Failed as expected: " + err.getMessage());
				}	 
		}
		
		return rslt;
		
		}



public List<String> get_data_by_type(String file_name, String select, String sortedBy) {
		//US1-2
	
		//Select corresponds à la données qu'on veut récupérer
		//SortedBy c'est un filtre
		//Ex: Select="author" et SortedBy="article" : La liste des auteurs qui ont écrit uniquement des articles
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
	

public double get_mean(List<Double> list) {
	//Renvoie la moyenne à partir d'une liste de double
	double sum=0;
	
	int i;
	for(i=0; i<list.size(); i++){
		sum+=list.get(i);
	}
		
	//System.out.println("test");
	
	return sum/list.size();		
	}

public double get_median(List<Double> list) {
	
	Collections.sort(list);

	return (median(list));
	
}


public double get_mode(List<Double> list) {

	return (mode(list));
	
}

}
