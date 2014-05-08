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



public class UserStory3 extends XMLPublicationTask3{
	//get_allYear() et fare test si == 0 alors mettre 0 sinon mettre le resultat dans rslt
	
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
	
	public double questionAMean (String file_name){
		//Mean number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "*")) , "year", "*"));
		return get_mean(list);
	}
	
	public double questionAMedian(String file_name) {
		//Median number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "*")) , "year", "*"));
		return get_median(list);
	}
	
	public double questionAMode(String file_name) {
		//Mode number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "*")) , "year", "*"));
		return get_mode(list);
	}

	public double questionBMean(String file_name) {
		//Mean number of articles in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "article")) , "year", "article"));
		return get_mean(list);

	}
	
	public double questionBMedian(String file_name) {
		//Median number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "article")) , "year", "article"));
		return get_median(list);
	}
	
	public double questionBMode(String file_name) {
		//Mode number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "article")) , "year", "article"));
		return get_mode(list);
	}
	public double questionCMean(String file_name) {
		//Mean number of conference proceedings in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "inproceedings")) , "year", "inproceedings"));
		return get_mean(list);

	}
	public double questionCMedian(String file_name) {
		//Median number of conference  proceedings in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "inproceedings")) , "year", "inproceedings"));
		return get_median(list);
	}
	
	public double questionCMode(String file_name) {
		//Mode number of conference proceedings in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "inproceedings")) , "year", "inproceedings"));
		return get_mode(list);
	}

	public double questionDMean(String file_name) {
		//Mean number of books in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "book")) , "year", "book"));
		return get_mean(list);

	}
	public double questionDMedian(String file_name) {
		//Median number of books in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "book")) , "year", "book"));
		return get_median(list);
	}
	
	public double questionDMode(String file_name) {
		//Mode number of book in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "book")) , "year", "book"));
		return get_mode(list);
	}

	public double questionEMean(String file_name) {
		//Mean number of books chapter in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "incollection")) , "year", "incollection"));
		return get_mean(list);

	}
	public double questionEMedian(String file_name) {
		//Median number books chapter in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "incollection")) , "year", "incollection"));
		return get_median(list);
	}
	
	public double questionEMode(String file_name) {
		//Mode number of books chapter in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_allYear(get_data_by_type(file_name, "year", "incollection")) , "year", "incollection"));
		return get_mode(list);
	}


}
