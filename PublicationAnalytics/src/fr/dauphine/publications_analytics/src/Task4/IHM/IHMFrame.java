package fr.dauphine.publications_analytics.src.Task4.IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import fr.dauphine.publications_analytics.src.Task3.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;

import fr.dauphine.publications_analytics.src.Task3.XMLPublicationTask3;
import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IHMFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHMFrame frame = new IHMFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IHMFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserStory3 us3 = new UserStory3();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 21, 170, 251);
		contentPane.add(scrollPane);
		JList list = new JList(us3.get_data_by_type("../dblp_curated_sample.xml", "author", "*").toArray());
		scrollPane.setViewportView(list);
		
		JButton btnSeeCoauthors = new JButton("See co-authors");
		btnSeeCoauthors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//TODO:
					//En cliquant sur le bouton, on ré-exécute la fonction avec l'author selectionné, et on
					//Redirige vers la même Frame, mais cette fois-ci avec le nouveau résultat de la fonction.
					IHMFrame frame1 = new IHMFrame();
					//setVisible(false);
					frame1.setVisible(true);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		btnSeeCoauthors.setBounds(211, 110, 158, 29);
		contentPane.add(btnSeeCoauthors);
	}

}
