/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentiment;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
/**
 *
 * @author GRV
 */
public class NewJFrame extends javax.swing.JFrame {

        public static String search;
    static Scanner in = new Scanner(System.in);
    public static ArrayList<Integer> sentiment = new ArrayList<Integer>();
    public static ArrayList<String> Tweets=TweetManager.tweetList;
	public static ArrayList<Integer> favoriteTweets=TweetManager.favoritelist;	
	public static ArrayList<Integer> reTweets=TweetManager.retweetList;
	//public  ArrayList<Integer> sentiTweets=WhatToThink.sentiTweets();
	public static ArrayList<String> queryTitle=new ArrayList<String>();
	public static ArrayList<Integer> consolidatedFav=new ArrayList<Integer>();
	public static ArrayList<Integer> consolidatedreTweets=new ArrayList<Integer>();
	/*JList<String> jlist;
	DefaultListModel<String> model;*/
	int hx,vx;
	JScrollPane pane;
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	 try {
			UIManager.setLookAndFeel ("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 /*hx=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
   	     vx=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
   	     model = new DefaultListModel<>();
       jlist = new JList<String>(model);
        jlist.setMinimumSize(new Dimension(1000, 1000));
        jlist.setMaximumSize(new Dimension(1000, 1000));
        jlist.setLocation(500,500);
*/       /* pane = new JScrollPane();
        jlist = new JList<String>(model);
        pane = new JScrollPane();
      //  pane.setViewportView(jlist);
        pane.setViewportView(jlist);
        jlist.setVisible(true);*/
        jScrollPane4 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        textarea2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        textarea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        finalArea = new javax.swing.JTextArea();
        textfield1 = new javax.swing.JTextField();
        textfield2 = new javax.swing.JTextField();
        textfield3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textarea1.setColumns(20);
        textarea1.setRows(5);
        jScrollPane4.setViewportView(textarea1);

        textarea2.setColumns(20);
        textarea2.setRows(5);
        jScrollPane5.setViewportView(textarea2);

        textarea3.setColumns(20);
        textarea3.setRows(5);
        jScrollPane6.setViewportView(textarea3);

        jLabel1.setText("Product Recommendation");

        finalArea.setColumns(20);
        finalArea.setRows(5);
        jScrollPane7.setViewportView(finalArea);

        jLabel2.setText("Enter Product1");

        jLabel3.setText("Enter Product2");

        jLabel4.setText("Enter Product3");
      //  getContentPane().add(pane, BorderLayout.NORTH);

        runButton.setText("Run");
        setVisible(true);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(textfield1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(textfield2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(textfield3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(runButton)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static  void onto(String winner,javax.swing.JTextArea finalAA) throws FileNotFoundException
		{
			
			
			// Create an empty model
			OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			
			// Use the FileManager to find the input file
			FileInputStream in = new FileInputStream(new File("a1.owl"));

			
                        
			// Read the RDF/XML file
			model.read(in, null);
                        finalAA.setText(finalAA.getText()+"\n"+"Modelling Ontology: ");
			System.out.println("Modelling Ontology: ");
			
			// ** List all individuals of "class" **
			if ((winner.equals("iphone3")) ||(winner.equals("iphone4")) ||(winner.equals("iphone5")) ||(winner.equals("iphone6"))||(winner.equals("iphone 4")||(winner.equals("iphone 5")||(winner.equals("iphone 6")))))
			//if ((winner.equals("iphone 3")) ||(winner.equals("iphone 4")) ||(winner.equals("iphone 5")) ||(winner.equals("iphone 6")) ||(winner.equals("iPhone3")||(winner.equals("iPhone4")||(winner.equals("iPhone5")||(winner.equals("iPhone6"))
			{//Return a Resource instance with the given URI in this model.
			Resource individ = model.getResource("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#Apple");
			ExtendedIterator<Individual> iter = model.listIndividuals(individ);
			System.out.println("Individuals Of Class: ");
			while(iter.hasNext())
			{
				System.out.println(iter.next().getLocalName());
                                finalAA.setText(finalAA.getText()+"\n"+iter.next().getLocalName());
			}
			
			
			// ** List all subclasses of "class" **
			
			OntClass person = model.getOntClass("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#PRODUCTS");
			ExtendedIterator<? extends OntResource> iter2= person.listInstances();
			iter2 = person.listSubClasses();
			
			while(iter2.hasNext()) 
			{
				OntClass subclass = (OntClass)iter2.next();
				System.out.println("subclasses: " + subclass.getLocalName());
                                
			}
			System.out.println("\n\n");
			
			
			
			//@2 try in Case of Property:
			
			
				String NS = "http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#";
				// get this class 
				OntClass expert = model.getOntClass(NS + "PRODUCTS");
				// print out the name of the this class
				System.out.println(expert.getLocalName());
				// get the instances of the Expert class
				ExtendedIterator<? extends OntResource> it = expert.listInstances();
				// print out the instances of the this class
				while (it.hasNext()) {
				Individual oi = (Individual) it.next();
				System.out.println(oi.getLocalName());
				
				
				//get the properties of the instances of the this class
				for (ExtendedIterator<OntProperty> ipp = expert.listDeclaredProperties(); ipp.hasNext();) {
				OntProperty p = (OntProperty) ipp.next();
				
				
				//print out property name and its values
				System.out.println( p.getLocalName());
				{
				
				//System.out.println(oi.getOntModel().getObjectProperty().getRange()); }}
				}
				
				}
	}
				
				
			
			
			}
			
			if ((winner.equals("moto g")) ||(winner.equals("moto x")) ||(winner.equals("moto e")))
			{//Return a Resource instance with the given URI in this model.
			Resource individ = model.getResource("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#Moto");
			ExtendedIterator<Individual> iter = model.listIndividuals(individ);
			System.out.println("Individuals Of Class: ");
			while(iter.hasNext())
			{
				System.out.println(iter.next().getLocalName());
                                finalAA.setText(finalAA.getText()+"\n"+iter.next().getLocalName());
			}
			
			
	/*		// ** List all subclasses of "class" **
			
			OntClass person = model.getOntClass("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#PRODUCTS");
			ExtendedIterator<? extends OntResource> iter2= person.listInstances();
			iter2 = person.listSubClasses();
			
			while(iter2.hasNext()) 
			{
				OntClass subclass = (OntClass)iter2.next();
				System.out.println("subclasses: " + subclass.getLocalName());
			}
			System.out.println("\n\n");
			
			
			
			//@2 try in Case of Property:
			
			
				String NS = "http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#";
				OntClass expert = model.getOntClass(NS + "PRODUCTS");
				// print out the name of the this class
				System.out.println(expert.getLocalName());
				// get the instances of the Expert class
				ExtendedIterator<? extends OntResource> it = expert.listInstances();
				// print out the instances of the this class
				while (it.hasNext()) {
				Individual oi = (Individual) it.next();
				System.out.println(oi.getLocalName());
				
				
				//get the properties of the instances of the this class
				for (ExtendedIterator<OntProperty> ipp = expert.listDeclaredProperties(); ipp.hasNext();) {
				OntProperty p = (OntProperty) ipp.next();
				
				
				//print out property name and its values
				System.out.println( p.getLocalName());
				{
				
				//System.out.println(oi.getOntModel().getObjectProperty().getRange()); }}
				}
				
				}
	}
				
				
				
	*/		
			}
			
			
			if ((winner.equals("Mi pad")) ||(winner.equals("Redmi")) ||(winner.equals("Xiomi")) ||(winner.equals("mi pad")) ||(winner.equals("redmi")) ||(winner.equals("xiomi")))
			{//Return a Resource instance with the given URI in this model.
			Resource individ = model.getResource("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#Mi");
			ExtendedIterator<Individual> iter = model.listIndividuals(individ);
			System.out.println("Individuals Of Class: ");
			while(iter.hasNext())
			{
				System.out.println(iter.next().getLocalName());
                                finalAA.setText(finalAA.getText()+"\n"+iter.next().getLocalName());
			}
			
			
			// ** List all subclasses of "class" **
			
			OntClass person = model.getOntClass("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#PRODUCTS");
			ExtendedIterator<? extends OntResource> iter2= person.listInstances();
			iter2 = person.listSubClasses();
			
			while(iter2.hasNext()) 
			{
				OntClass subclass = (OntClass)iter2.next();
				System.out.println("subclasses: " + subclass.getLocalName());
			}
			System.out.println("\n\n");
			
			
			
			//@2 try in Case of Property:
			
			
				String NS = "http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#";
				
				OntClass expert = model.getOntClass(NS + "PRODUCTS");
				// print out the name of the this class
				System.out.println(expert.getLocalName());
				// get the instances of the Expert class
				ExtendedIterator<? extends OntResource> it = expert.listInstances();
				// print out the instances of the this class
				while (it.hasNext()) {
				Individual oi = (Individual) it.next();
				System.out.println(oi.getLocalName());
				
				
				//get the properties of the instances of the this class
				for (ExtendedIterator<OntProperty> ipp = expert.listDeclaredProperties(); ipp.hasNext();) {
				OntProperty p = (OntProperty) ipp.next();
				
				
				//print out property name and its values
				System.out.println( p.getLocalName());
				{
				
				//System.out.println(oi.getOntModel().getObjectProperty().getRange()); }}
				}
				
				}
	}
				
				
				
			
			}		
			
			if ((winner.equals("canvas")) ||(winner.equals("canvas 2")))
			{//Return a Resource instance with the given URI in this model.
			Resource individ = model.getResource("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#Micromax");
			ExtendedIterator<Individual> iter = model.listIndividuals(individ);
			System.out.println("Individuals Of Class: ");
			while(iter.hasNext())
			{
				System.out.println(iter.next().getLocalName());
                                finalAA.setText(finalAA.getText()+"\n"+iter.next().getLocalName());
			}
			
			
			// ** List all subclasses of "class" **
			
			OntClass person = model.getOntClass("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#PRODUCTS");
			ExtendedIterator<? extends OntResource> iter2= person.listInstances();
			iter2 = person.listSubClasses();
			
			while(iter2.hasNext()) 
			{
				OntClass subclass = (OntClass)iter2.next();
				System.out.println("subclasses: " + subclass.getLocalName());
			}
			System.out.println("\n\n");
			
			
			
			//@2 try in Case of Property:
			
			
				String NS = "http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#";
				
				OntClass expert = model.getOntClass(NS + "PRODUCTS");
				// print out the name of the this class
				System.out.println(expert.getLocalName());
				// get the instances of the Expert class
				ExtendedIterator<? extends OntResource> it = expert.listInstances();
				// print out the instances of the this class
				while (it.hasNext()) {
				Individual oi = (Individual) it.next();
				System.out.println(oi.getLocalName());
				
				
				//get the properties of the instances of the this class
				for (ExtendedIterator<OntProperty> ipp = expert.listDeclaredProperties(); ipp.hasNext();) {
				OntProperty p = (OntProperty) ipp.next();
				
				
				//print out property name and its values
				System.out.println( p.getLocalName());
				{
				
				//System.out.println(oi.getOntModel().getObjectProperty().getRange()); }}
				}
				
				}
	}
				
				
				
			
			}
			
			
			if ((winner.equals("Galaxy")) ||(winner.equals("Gear")) ||(winner.equals("Grand")) ||(winner.equals("Grand 2")) ||(winner.equals("Note")))
			{//Return a Resource instance with the given URI in this model.
			Resource individ = model.getResource("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#Samsung");
			ExtendedIterator<Individual> iter = model.listIndividuals(individ);
			System.out.println("Individuals Of Class: ");
			while(iter.hasNext())
			{
				System.out.println(iter.next().getLocalName());
                                finalAA.setText(finalAA.getText()+"\n"+iter.next().getLocalName());
			}
			
			
			// ** List all subclasses of "class" **
			
			OntClass person = model.getOntClass("http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#PRODUCTS");
			ExtendedIterator<? extends OntResource> iter2= person.listInstances();
			iter2 = person.listSubClasses();
			
			while(iter2.hasNext()) 
			{
				OntClass subclass = (OntClass)iter2.next();
				System.out.println("subclasses: " + subclass.getLocalName());
			}
			System.out.println("\n\n");
			
			
			
			//@2 try in Case of Property:
			
			
				String NS = "http://www.semanticweb.org/grv/ontologies/2016/2/PRODUCT_SERVICES#";
			
				OntClass expert = model.getOntClass(NS + "PRODUCTS");
				// print out the name of the this class
				System.out.println(expert.getLocalName());
				// get the instances of the Expert class
				ExtendedIterator<? extends OntResource> it = expert.listInstances();
				// print out the instances of the this class
				while (it.hasNext()) {
				Individual oi = (Individual) it.next();
				System.out.println(oi.getLocalName());
				
				
				//get the properties of the instances of the this class
				for (ExtendedIterator<OntProperty> ipp = expert.listDeclaredProperties(); ipp.hasNext();) {
				OntProperty p = (OntProperty) ipp.next();
				
				
				//print out property name and its values
				System.out.println( p.getLocalName());
				{
				
				//System.out.println(oi.getOntModel().getObjectProperty().getRange()); }}
				}
				
				}
	}
				
				
				
			
			}
		
		
		}
    
    static void accumulator()
{
	queryTitle.add(Calculate.query());
	consolidatedFav.add(Calculate.consolidatedfav());
	consolidatedreTweets.add(Calculate.consolidatedreTweets());
	


}

static void shower()
{
	System.out.println(queryTitle);
	System.out.println(consolidatedFav);
	System.out.println(consolidatedreTweets);
	int totalfav=0;
	int totalrt=0;
	float favper;
	float rtper;
	
	float[] successper = new float[5];
	  for(int i = 0; i < queryTitle.size(); i++) 
	  {
     
       	totalfav=totalfav+consolidatedFav.get(i);
       	totalrt=totalrt+consolidatedreTweets.get(i);
	  
	  }
	  
	  for(int i = 0; i < queryTitle.size(); i++) 
	  {
	       	
		System.out.println(queryTitle.get(i));
	       	System.out.println(consolidatedFav.get(i));
	       	System.out.println(consolidatedreTweets.get(i));
	       	favper=(((float)consolidatedFav.get(i)/(float)totalfav)*100);
	       	rtper=(((float)consolidatedreTweets.get(i)/(float)totalrt)*100);
	       	System.out.println(favper + "%");
	       	System.out.println(rtper  + "%");
	       	
	      	System.out.println("___________________ JUDGING OVERALL SUCCESSRATE _________________________");
	       	successper[i]=(float) (((float)rtper*0.8)+((float)favper*0.2));
	       	
	       	System.out.println(" Product Successrate");
	       	System.out.println((((float)rtper*0.8)+((float)favper*0.2)));
	       	
		  
	       	
	       	successper[i]=(float) (((float)rtper*0.8)+((float)favper*0.2));
	 }
	  
	  int maxIndex = 0;
	  
	  
	  for(int i = 0; i < queryTitle.size(); i++) 
	  {
		  float newnumber = successper[i];
		  if ((newnumber > successper[maxIndex]))
		  {
			     maxIndex = i;
		  }
       	  
	  }
          //finalArea.setText(queryTitle.get(maxIndex)+" IS THE WINNER55");
	  System.out.println(queryTitle.get(maxIndex)+" IS THE WINNER");
	  System.out.println("Analysing THE WINNER"); 
	  try {System.out.println("Analysing THE WINNER"); 
              String winner=queryTitle.get(maxIndex);
		  
		ontology.onto(winner);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
            System.out.println("Analysing THE WINNER88"); 
		e.printStackTrace();
	}
	  catch(Exception e)
          {
              System.out.println("Analysing THE WINNER99"); 
          }
	  
	  

}

    
    
    
    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        for(int i=1;i<=3;i++)
		{
		if(i==1)
                    search = textfield1.getText();
                if(i==2)
                    search = textfield2.getText();
                if(i==3)
                    search = textfield3.getText();
                
		
    	int senti = 0;
    	ArrayList<Integer> sentiment = new ArrayList<Integer>();
    	/*JList list;
    	DefaultListModel model = null;*/
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("i hate aakash verma.he is saloni's boyfriend and i am very much jealous of him ");
    	list.add("i love saloni khurana. she is very cute.i love her a lot.");
    	list.add("i am very much positive about my brother");
    	list.add("It truly shows that the age of the Rs 50,000 smartphone has ended. #Mi5 https://t.co/k9jwUZ1O6Ie");
    	ArrayList<String> tweets = TweetManager.getTweets(search);//REPLACE TweetManager.getTweets(Search); WITH LIST; TO GET THE SENTIMENT OF ABOVE SENTENCES
    	System.out.println("Performing sentiment analysis");
    	
    	NLP.init();
        for(String tweet : tweets) {
        	System.out.println("printing sentiments");
        	senti= NLP.findSentiment(tweet);
        	/*model.addElement(tweet + ":::::: " +senti);
        	jlist.setVisible(true);*/
        	System.out.println(tweet + ":::::: " +senti);
        	sentiment.add(senti);
        }
   

        Calculate.individualCalculation(Tweets, favoriteTweets, reTweets,sentiment,search);
        accumulator();
        
	}

        
        
        System.out.println(queryTitle);
	System.out.println(consolidatedFav);
	System.out.println(consolidatedreTweets);
	int totalfav=0;
	int totalrt=0;
	float favper;
	float rtper;
	
	float[] successper = new float[5];
	  for(int i = 0; i < queryTitle.size(); i++) 
	  {
     
       	totalfav=totalfav+consolidatedFav.get(i);
       	totalrt=totalrt+consolidatedreTweets.get(i);
	  
	  }
	  
	  for(int i = 0; i < queryTitle.size(); i++) 
	  {
	       	if(i==0)
                {    
                    textarea1.setText(queryTitle.get(i)+"\n"+queryTitle.get(i)+"\nLikes: "+consolidatedFav.get(i)+"\nShares: "+
                            consolidatedreTweets.get(i));
                    System.out.println(queryTitle.get(i));
	       	System.out.println(consolidatedFav.get(i));
	       	System.out.println(consolidatedreTweets.get(i));
	       	favper=(((float)consolidatedFav.get(i)/(float)totalfav)*100);
	       	rtper=(((float)consolidatedreTweets.get(i)/(float)totalrt)*100);
	       	System.out.println(favper + "%");
	       	System.out.println(rtper  + "%");
                textarea1.setText(textarea1.getText()+"\nSR on Likes"+favper+"%");
                textarea1.setText(textarea1.getText()+"\nSR on Shares"+rtper+"%");
                }
                if(i==1)
                {
                    textarea2.setText(queryTitle.get(i)+"\n"+queryTitle.get(i)+"\nLikes: "+consolidatedFav.get(i)+"\nShares: "+
                            consolidatedreTweets.get(i));
                    System.out.println(queryTitle.get(i));
	       	System.out.println(consolidatedFav.get(i));
	       	System.out.println(consolidatedreTweets.get(i));
	       	favper=(((float)consolidatedFav.get(i)/(float)totalfav)*100);
	       	rtper=(((float)consolidatedreTweets.get(i)/(float)totalrt)*100);
	       	System.out.println(favper + "%");
	       	System.out.println(rtper  + "%");
                textarea2.setText(textarea2.getText()+"\nSR on Likes"+favper+"%");
                textarea2.setText(textarea2.getText()+"\nSR on Shares"+rtper+"%");
                }
                if(i==2)
                {
                    textarea3.setText(queryTitle.get(i)+"\n"+queryTitle.get(i)+"\nLikes: "+consolidatedFav.get(i)+"\nShares: "+
                            consolidatedreTweets.get(i));
                    System.out.println(queryTitle.get(i));
	       	System.out.println(consolidatedFav.get(i));
	       	System.out.println(consolidatedreTweets.get(i));
	       	favper=(((float)consolidatedFav.get(i)/(float)totalfav)*100);
	       	rtper=(((float)consolidatedreTweets.get(i)/(float)totalrt)*100);
	       	System.out.println(favper + "%");
	       	System.out.println(rtper  + "%");
                textarea3.setText(textarea3.getText()+"\nSR on Likes"+favper+"%");
                textarea3.setText(textarea3.getText()+"\nSR on Shares"+rtper+"%");
                }
		System.out.println(queryTitle.get(i));
	       	System.out.println(consolidatedFav.get(i));
	       	System.out.println(consolidatedreTweets.get(i));
	       	favper=(((float)consolidatedFav.get(i)/(float)totalfav)*100);
	       	rtper=(((float)consolidatedreTweets.get(i)/(float)totalrt)*100);
	       	System.out.println(favper + "%");
	       	System.out.println(rtper  + "%");
	       	
	      	System.out.println("___________________ JUDGING OVERALL SUCCESSRATE _________________________");
	       	successper[i]=(float) (((float)rtper*0.8)+((float)favper*0.2));
	       	
	       	System.out.println(" Product Successrate");
	       	System.out.println((((float)rtper*0.8)+((float)favper*0.2)));
	       	
		  
	       	
	       	successper[i]=(float) (((float)rtper*0.8)+((float)favper*0.2));
	 }
	  
	  int maxIndex = 0;
	  
	  
	  for(int i = 0; i < queryTitle.size(); i++) 
	  {
		  float newnumber = successper[i];
		  if ((newnumber > successper[maxIndex]))
		  {
			     maxIndex = i;
		  }
       	  
	  }
          finalArea.setText(queryTitle.get(maxIndex)+" IS THE WINNER");

	  try {

              String winner=queryTitle.get(maxIndex);
		  
		onto(winner,finalArea);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
            System.out.println("Analysing THE WINNER"); 
		e.printStackTrace();
	}
	  catch(Exception e)
          { 

          }
	  
	  


        
        
        
    }//GEN-LAST:event_runButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
         Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
         If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
    	
    	SplashScreen frame = new SplashScreen();
		frame.setVisible(true);
		frame.startProgress();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea finalArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton runButton;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textarea2;
    private javax.swing.JTextArea textarea3;
    private javax.swing.JTextField textfield1;
    private javax.swing.JTextField textfield2;
    private javax.swing.JTextField textfield3;
}
