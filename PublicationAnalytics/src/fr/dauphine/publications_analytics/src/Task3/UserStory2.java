package fr.dauphine.publications_analytics.src.Task3;

import java.util.List;

public class UserStory2 extends XMLPublicationTask3{
	
	public double questionAMean (String file_name){
		//Mean number of publication per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "*"));
		return get_mean(list);
	}
	
	public double questionAMedian(String file_name) {
		//Median number of publication per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "*"));
		return get_median(list);
	}
	
	public double questionAMode(String file_name) {
		//Mode number of publication per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "*"));
		return get_mode(list);
	}
	
	public double questionBMean(String file_name) {
		//Mean number of journal articles per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "article"));
		return get_mean(list);	
	}
	public double questionBMedian(String file_name) {
		//Median number of journal articles per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "article"));
		return get_median(list);
		}
	public double questionBMode(String file_name) {
		//Mode number of journal articles per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "article"));
		return get_mode(list);
	}

	public double questionCMean(String file_name) {
		//Mean number of conference proceedings per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "inproceedings"));
		return get_mean(list);	
	}
	public double questionCMedian(String file_name) {
		//Median number of conference proceedings per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "inproceedings"));
		return get_median(list);	
		
	}
	public double questionCMode(String file_name) {
		//Mode number of conference proceedings per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "inproceedings"));
		return get_mode(list);	
		
	}
	public double questionDMean(String file_name) {
		//Mean number of books per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "book"));
		return get_mean(list);	
	}

	public double questionDMedian(String file_name) {
		//Median number of books per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "book"));
		return get_median(list);	
	}
	public double questionDMode(String file_name) {
		//Mode number of books per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "book"));
		return get_mode(list);	
	}


	public double questionEMean(String file_name) {
		//Mean number of books chapter per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "incollection"));
		return get_mean(list);	
	}

	public double questionEMedian(String file_name) {
		//Median number of books chapter per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "incollection"));
		return get_median(list);	
	}

	public double questionEMode(String file_name) {
		//Mode number of books chapter per author
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "author", "*") , "author", "incollection"));
		return get_mode(list);	
	}











}
