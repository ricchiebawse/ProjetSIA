package fr.dauphine.publications_analytics.src.Task3;

import java.util.List;



public class UserStory3 extends XMLPublicationTask3{
	public double questionAMean (String file_name){
		//Mean number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "*"));
		return get_mean(list);
	}
	
	public double questionAMedian(String file_name) {
		//Median number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "*"));
		return get_median(list);
	}
	
	public double questionAMode(String file_name) {
		//Mode number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "*"));
		return get_mode(list);
	}

	public double questionBMean(String file_name) {
		//Mean number of articles in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "") , "year", "article"));
		return get_mean(list);

	}
	
	public double questionBMedian(String file_name) {
		//Median number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "article"));
		return get_median(list);
	}
	
	public double questionBMode(String file_name) {
		//Mode number of publication in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "article"));
		return get_mode(list);
	}
	public double questionCMean(String file_name) {
		//Mean number of conference proceedings in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "") , "year", "inproceedings"));
		return get_mean(list);

	}
	public double questionCMedian(String file_name) {
		//Median number of conference  proceedings in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "inproceedings"));
		return get_median(list);
	}
	
	public double questionCMode(String file_name) {
		//Mode number of conference proceedings in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "inproceedings"));
		return get_mode(list);
	}

	public double questionDMean(String file_name) {
		//Mean number of books in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "") , "year", "book"));
		return get_mean(list);

	}
	public double questionDMedian(String file_name) {
		//Median number of books in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "book"));
		return get_median(list);
	}
	
	public double questionDMode(String file_name) {
		//Mode number of book in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "book"));
		return get_mode(list);
	}

	public double questionEMean(String file_name) {
		//Mean number of books chapter in a year
		
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "") , "year", "incollection"));
		return get_mean(list);

	}
	public double questionEMedian(String file_name) {
		//Median number books chapter in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "incollection"));
		return get_median(list);
	}
	
	public double questionEMode(String file_name) {
		//Mode number of books chapter in a year
		List<Double> list = (get_number_of_publication_by_data(file_name,get_data_by_type(file_name, "year", "*") , "year", "incollection"));
		return get_mode(list);
	}


}
