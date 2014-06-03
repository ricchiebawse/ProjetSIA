package fr.dauphine.publications_analytics.test.Task4;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import fr.dauphine.publications_analytics.src.Task4.XMLPublicationTask4;

public class UserStory2Test {
    
    @Test
    public void question2() {
        String file_name = "../dblp_US2-3.xml";
        XMLPublicationTask4 xb = new XMLPublicationTask4();    
        
        List<String> range_year= xb.get_year_range(1992, 1993);
        Map<String,List<String>> listAuthor_by_year = xb.get_data_by_type_by_year(file_name, "author", "*", range_year);
        Map<String,Map<String,List<String>>> listCoAuthor_by_year = xb.get_cohauthor_by_data_by_year(file_name,listAuthor_by_year,"*");
        
        String checkJunit= "";
        
        for (String mapKey : listCoAuthor_by_year.keySet()) {
            // utilise ici hashMap.get(mapKey) pour accéder aux valeurs
           // System.out.println("Year: "+mapKey);
            checkJunit +="Year: "+mapKey;
            Map<String,List<String>> coAuthor_by_author = listCoAuthor_by_year.get(mapKey);
                for (String mapKey2 : coAuthor_by_author.keySet()) {
                    //System.out.println("Auteur: "+mapKey2);
                    checkJunit +="Auteur: "+mapKey2;
                for(int i=0;i< coAuthor_by_author.get(mapKey2).size();i++){
                   // System.out.println("Coauthors: "+ coAuthor_by_author.get(mapKey2).get(i));
                    checkJunit +="Coauthors: "+ coAuthor_by_author.get(mapKey2).get(i);
                }    
                     //System.out.println("--------------------------------***");
                }
            }
        
        assertEquals(checkJunit,"Year: 1992Auteur: Shamkant B. NavatheCoauthors: Carlo BatiniCoauthors: Stefano CeriAuteur: Stefano CeriCoauthors: Carlo BatiniCoauthors: Shamkant B. NavatheAuteur: Carlo BatiniCoauthors: Stefano CeriCoauthors: Shamkant B. NavatheYear: 1993Auteur: No Publication");        
    }    
}