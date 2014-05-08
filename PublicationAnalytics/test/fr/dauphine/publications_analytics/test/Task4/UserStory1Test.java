package fr.dauphine.publications_analytics.test.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import fr.dauphine.publications_analytics.src.Task4.UserStory1;

public class UserStory1Test {

	@Test
	public void question1() {
		//TODO : Ajouter Spec de la questions US1
		//TODO : Tester avec un assertEquals(Map m, Map m1) ?
		//L'utilisation de ces deux fonctions permettent aussi de satisfaire les besoins de l'US3
		
		
		String file_name = "../dblp_US2-3.xml";
		UserStory1 xb = new UserStory1();	
		
		List<String> listAuthor = xb.get_data_by_type(file_name, "author", "incollection");
		Map<String,List<String>> test = xb.get_cohauthor_by_data(file_name,listAuthor,"incollection");
		
		/*Map<String,List<String>> map = new HashMap<String, List<String>>();
		map.put("Rick Ross", (new ArrayList<String>()).add("Stefano Ceri"));
		*/
		
		for (String mapKey : test.keySet()) {
			// utilise ici hashMap.get(mapKey) pour accéder aux valeurs
			System.out.println("Key: "+mapKey);
			for(int i=0;i< test.get(mapKey).size();i++){
				System.out.println("Coauthors: "+ test.get(mapKey).get(i));
			}	
			 	System.out.println("--------------------------------***");
		}
	}
}
