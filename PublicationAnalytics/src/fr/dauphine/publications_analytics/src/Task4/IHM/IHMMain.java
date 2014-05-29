package fr.dauphine.publications_analytics.src.Task4.IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JTextPane;

public class IHMMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHMMain frame = new IHMMain();
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
	public IHMMain() {
		setTitle("SIA2 - Task4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ouvre une fenêtre de selection de fichier XML dans : 

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new FileFilter() {

			        @Override
			        public boolean accept(File f) {
			            return f.getName().endsWith(".xml");
			        }

			        @Override
			        public String getDescription() {
			            return "XML files";
			        }

			    });
		        int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		        File selectedFile = fileChooser.getSelectedFile();
				  
		        //Création de la JFrame de recherche de co-autheurs
		        IHMUserStory4 cl = new IHMUserStory4("../"+selectedFile.getName());
		        cl.setVisible(true);
		        
		        }
			}
		});
		btnBrowse.setBounds(175, 126, 117, 29);
		
		contentPane.add(btnBrowse);
		
		JTextPane txtpnChooseTheXml = new JTextPane();
		txtpnChooseTheXml.setText("Choose the XML file to be analysed.");
		txtpnChooseTheXml.setBounds(126, 98, 224, 16);
		contentPane.add(txtpnChooseTheXml);
	}
}
