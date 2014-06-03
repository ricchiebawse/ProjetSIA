package fr.dauphine.publications_analytics.test.Task4;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import fr.dauphine.publications_analytics.src.Task4.XMLPublicationTask4;

public class UserStory1Test {
    
    @Test
    public void question1() {
        //L'utilisation de ces deux fonctions permettent aussi de satisfaire les besoins de l'US3
        
        String file_name = "../dblp_US2-3.xml";
        XMLPublicationTask4 xb = new XMLPublicationTask4();    
        
        List<String> listAuthor = xb.get_data_by_type(file_name, "author", "incollection");
        Map<String,List<String>> listCoAuthor = xb.get_cohauthor_by_data(file_name,listAuthor,"incollection");
        String checkJunit = "";
        
        for (String mapKey : listCoAuthor.keySet()) {
            // utilise ici hashMap.get(mapKey) pour accéder aux valeurs
            //System.out.println("Key: "+mapKey);
            checkJunit +="Key: "+mapKey;
            for(int i=0;i< listCoAuthor.get(mapKey).size();i++){
                //System.out.println("Coauthors: "+ listCoAuthor.get(mapKey).get(i));
                checkJunit +="Coauthors: "+ listCoAuthor.get(mapKey).get(i);
            }    
                 //System.out.println("--------------------------------***");
        }
        
        assertEquals(checkJunit,"Key: Rick RossCoauthors: Stefano CeriKey: Stefano CeriCoauthors: Raghu RamakrishnanCoauthors: Rick RossKey: Raghu RamakrishnanCoauthors: Stefano Ceri");
        
    }
    
}