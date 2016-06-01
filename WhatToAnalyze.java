package sentiment;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WhatToAnalyze {

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
	
	

	
    

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
		System.out.println("ENTER your paramenter for search");
		search = in.nextLine();
    	int senti = 0;
    	ArrayList<Integer> sentiment = new ArrayList<Integer>();
    	
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
        	System.out.println(tweet + ":::::: " +senti);
        	sentiment.add(senti);
        }
   

        Calculate.individualCalculation(Tweets, favoriteTweets, reTweets,sentiment,search);
        accumulator();
        
	}
        shower();
   
	
	
	
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

	  System.out.println(queryTitle.get(maxIndex)+" IS THE WINNER55");
	  System.out.println("Analysing THE WINNER66"); 
	  try {System.out.println("Analysing THE WINNER77"); 
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


}  	



