package fr.dauphine.publications_analytics.test.Task4;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task4.UserStory1;

public class UserStory2Test {
	
	@Test
	public void question2() {
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		List<String> range_year= xb.get_year_range(1956, 1956);
		//Collections.sort(range_year);
		Map<String,List<String>> listAuthor_by_year = xb.get_data_by_type_by_year(file_name, "author", "*", range_year);
		Map<String,Map<String,List<String>>> test = xb.get_cohauthor_by_data_by_year(file_name,listAuthor_by_year,"*");
		
		/*Map<String,List<String>> map = new HashMap<String, List<String>>();
		map.put("Rick Ross", (new ArrayList<String>()).add("Stefano Ceri"));
		*/
		
		/*for (String mapKey : test.keySet()) {
			// utilise ici hashMap.get(mapKey) pour accéder aux valeurs
			System.out.println("Year: "+mapKey);
			Map<String,List<String>> l = test.get(mapKey);
				for (String mapKey2 : l.keySet()) {
					System.out.println("Auteur: "+mapKey2);
				for(int i=0;i< l.get(mapKey2).size();i++){
					System.out.println("Coauthors: "+ l.get(mapKey2).get(i));
				}	
				 	System.out.println("--------------------------------***");
				}
			}*/
		
		/*for (String mapKey : listAuthor_by_year.keySet()) {
			System.out.println("Key: "+mapKey);
			for(int i=0;i< listAuthor_by_year.get(mapKey).size();i++){
				System.out.println("authors: "+ listAuthor_by_year.get(mapKey).get(i));
			}	
			 	System.out.println("--------------------------------***");
		}*/
		
	}	
}
