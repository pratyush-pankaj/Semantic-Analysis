package sentiment;


import com.hp.hpl.jena.ontology.OntModel;
//import com.hp.hpl.jena.ontology.*;
//import com.hp.hpl.jena.rdf.model.*;
//import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

        
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author GRV
 */
public class ontology {

	


	// print individual of a specific class and print subclasses if needed
	
    /**
     *
     * @param winner
     * @throws FileNotFoundException
     */
    	

		public static  void onto(String winner) throws FileNotFoundException
		{
			
			
			// Create an empty model
			OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			
			// Use the FileManager to find the input file
			FileInputStream in = new FileInputStream(new File("a1.owl"));

			
                        
			// Read the RDF/XML file
			model.read(in, null);
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
	
	
	
}
