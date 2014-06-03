package fr.dauphine.publications_analytics.src.Task4.IHM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class StaticMethods {
	public static void exportCSV(String filename, Map<String, List<String>> listAuthors) {
		//Exporte la Map listAuthors en paramètre dans un fichier CSV de chemin filename.
        File outputFile = new File(filename);
        try {
            FileWriter out = new FileWriter(outputFile);
            
            for (Entry<String, List<String>> e : listAuthors.entrySet()) {
                String key = e.getKey();
                List<String> value = e.getValue();
                
                out.write(key);
                out.write(',');
                for(int i=0; i<value.size();i++){
                out.write(value.get(i).toString());
                }
                out.write('\n');
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
