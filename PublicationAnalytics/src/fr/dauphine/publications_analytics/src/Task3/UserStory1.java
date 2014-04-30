package fr.dauphine.publications_analytics.src.Task3;

import java.util.List;

public class UserStory1 extends XMLPublicationTask3{

	
	public double questionAMean (String file_name){
		//Mean number of author per publication
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "*") , "title"));
		return get_mean(list);
	}
	
	public double questionAMedian(String file_name) {
		//Median number of authors per publication
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "*") , "title"));
		return get_median(list);
	}
	public double questionAMode(String file_name) {
		//Mode number of authors per publication
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "*") , "title"));
		return get_mode(list);
		}

	public double questionBMean(String file_name) {
		// Mean Number of author per journal article
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "article") , "title"));
		return get_mean(list);
	}

	public double questionBMedian(String file_name) {
		// Median Number of author per journal article
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "article") , "title"));
		return get_median(list);	
		}
	

	public double questionBMode(String file_name) {
		// Mode Number of author per journal article
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "article") , "title"));
		return get_mode(list);	
		
	}


	public double questionCMean(String file_name) {
		//Mean number of author per conference proceeding
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "inproceedings") , "title"));
		return get_mean(list);		
	}
	
	public double questionCMedian(String file_name) {
		//Median number of author per conference proceeding
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "inproceedings") , "title"));
		return get_median(list);	
		}


	public double questionCMode(String file_name) {
		//Mode number of author per conference proceeding
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "inproceedings") , "title"));
		return get_mode(list);	
		}



	public double questionDMean(String file_name) {
		//Mean number of authors per book chapter
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "incollection") , "title"));
		return get_mean(list);
	}
	public double questionDMedian(String file_name) {
		//Median number of authors per book chapter
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "incollection") , "title"));
		return get_median(list);
		}
	

	public double questionDMode(String file_name) {
		//Mode number of authors per book chapter
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "incollection") , "title"));
		return get_mode(list);	
		}



	public double questionEMean(String file_name) {
		//Mean number of authors per book
		
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "book") , "title"));
		return get_mean(list);	
	}

	public double questionEMedian(String file_name) {
		//Median number of authors per book
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "book") , "title"));
		return get_median(list);	
		
	}

	public double questionEMode(String file_name) {
		//Mode number of authors per book
		List<Double> list = (get_number_of_author_by_data(file_name,get_data_by_type(file_name, "title", "book") , "title"));
		return get_mode(list);	
		}






}
