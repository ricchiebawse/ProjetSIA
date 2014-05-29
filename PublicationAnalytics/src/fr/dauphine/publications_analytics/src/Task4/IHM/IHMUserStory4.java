package fr.dauphine.publications_analytics.src.Task4.IHM;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.dauphine.publications_analytics.src.Task3.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

import fr.dauphine.publications_analytics.src.Task3.XMLPublicationTask3;
import fr.dauphine.publications_analytics.src.Task4.UserStory1;

import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IHMUserStory4 extends JFrame {

    private int currentCard = 1;
    private ArrayList<JList> listJlist;
    private JPanel cardPanel;
    private CardLayout cl;
    private UserStory1 us;
    private JButton b2;
    private String file_name;
    
    private void setList(ArrayList<String> author, JPanel p, String authorName, int currentPanel){
    	//Ajout de la liste des co-auteurs de author dans la JList de la JPanel p		
        if(p.getComponentCount()>1){//Si le JPanel possède déjà une JScrollPane (content une JList)
        	p.remove(1);//On supprime cette JScrollPane pour la remplacer par une nouvelle
        }
        JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 21, 170, 251);
		p.add(scrollPane);
		
		//On recherche les co-auteurs de l'auteur sélectionné
		Map<String,List<String>> test = us.get_cohauthor_by_data(file_name,author,"*");
		JList list = new JList(test.get(authorName).toArray());
		if(listJlist.size()<=currentPanel){
			listJlist.add(list);
		}
		else{
			listJlist.set(currentPanel, list);
		}
		scrollPane.setViewportView(list);
	
    }
    public IHMUserStory4(String file) {
    		us = new UserStory1();	   
    		//file_name="../dblp_US2-3.xml";
    		file_name=file;
            setTitle("SIA2 - Task4");
            setSize(500, 300);
            cardPanel = new JPanel();

            cl = new CardLayout();
            cardPanel.setLayout(cl);
            JPanel p1 = new JPanel();
    		
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel();
            JPanel p4 = new JPanel();
            JLabel lab1 = new JLabel("");
            JLabel lab2 = new JLabel("");
            JLabel lab3 = new JLabel("");
            JLabel lab4 = new JLabel("");
            p1.add(lab1);
            p2.add(lab2);
            p3.add(lab3);
            p4.add(lab4);
            
	    		//Ajout de la liste de TOUS les auteurs dans la JPanel1. La JPanel1 et sa JList ne varira JAMAIS.
	    		JScrollPane scrollPane = new JScrollPane();
	    		scrollPane.setBounds(29, 21, 170, 251);
	    		p1.add(scrollPane);
	    		JList list = new JList(us.get_data_by_type(file_name, "author", "*").toArray());
	    		scrollPane.setViewportView(list);
	    		listJlist = new ArrayList<JList>();
	    		listJlist.add(list);

            cardPanel.add(p1, "1");
            cardPanel.add(p2, "2");
            cardPanel.add(p3, "3");
            cardPanel.add(p4, "4");
            JPanel buttonPanel = new JPanel();
            JButton b1 = new JButton("Previous");
            b2 = new JButton("Next");
            buttonPanel.add(b1);
            buttonPanel.add(b2);
            b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                    	//boutton previous
                    	//On efface la JList du JPanel actuel, et on redirige vers la JPanel précédente.
                            if (currentCard > 1) {
                        			b2.setVisible(true);
                                    ((JPanel)cardPanel.getComponent(currentCard-1)).remove(1);
                                    currentCard -= 1;
                                    cl.show(cardPanel, "" + (currentCard));
                            }
                    }
            });

            b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                    	//boutton next
                    	//Modifier la JList du JPanel suivant.
                            if (currentCard < 4) {
	                                //On place dans la liste author le nom de l'author selectionné
	                                ArrayList<String> author = new ArrayList<String>();
	                                author.add((String) listJlist.get(currentCard-1).getSelectedValue());
	                                 
	                                //On exécute setList pour modifier la JList du JPanel fraîchement affiché (le JPanel++).
	                                	// cardPanel.getComponent(currentCard-1)  : Récupère le JPanel     
	                                setList(author, (JPanel)cardPanel.getComponent(currentCard), author.get(0), currentCard);
	                               
	                                //Changement de JPanel vers le JPanel++
                                    currentCard += 1;
                                    cl.show(cardPanel, "" + (currentCard));
                                    if(currentCard>=4){
                                    	b2.setVisible(false);
                                    }


                            }
                    }
            });
            getContentPane().add(cardPanel, BorderLayout.NORTH);
            getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
            IHMUserStory4 cl = new IHMUserStory4("../dblp_US2-3.xml");
        //IHMFrame cl = new IHMFrame("/Users/ricchie/Documents/workspace/PublicationAnalyticsRichIHM/src/fr/dauphine/publications_analytics/src/dblp_2.xml");

            cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cl.setVisible(true);
    }
}