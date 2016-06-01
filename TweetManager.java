
package sentiment;
import twitter4j.*;
import java.util.Date;

import java.text.SimpleDateFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.PrintStream;

import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;

public class TweetManager {
	  /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
	static ArrayList<String> tweetList = new ArrayList<String>();
	static ArrayList<Integer> favoritelist = new ArrayList<Integer>();
	static ArrayList<Integer> retweetList = new ArrayList<Integer>();
	
	public static ArrayList<String> getTweets(String SearchQuery) {
          
        ConfigurationBuilder cf = new ConfigurationBuilder();
        
            cf.setDebugEnabled(true) 
                    .setOAuthConsumerKey("Yz9cPVWtyudwues7rHhdPh45G")
                    .setOAuthConsumerSecret("qVmOWZx67yLuhGVm2BrVnONzszmQ0RRDowhA0f7KpZAvtfQQpY")
                    .setOAuthAccessToken("1642245708-x5XTk8HWQEZMmaSlQEr7TC2makZBPx2MRaJsAfm")
                    .setOAuthAccessTokenSecret("UemIPoRTxnXqLzpeBrU9bFItbuy6qIq63bVNOmB9zjYCG");

            tweetList.clear();
            favoritelist.clear();
            retweetList.clear();
            
            		TwitterFactory tf = new TwitterFactory(cf.build());
                      twitter4j.Twitter twitter = tf.getInstance();
                      
                      //CREATING FILE
                      new File("data\\twitter").mkdirs();//make directory
                      String fileName = new SimpleDateFormat("'data_"+SearchQuery+"'yyyy-MM-dd_hh-mm'.txt'").format(new Date());// create file name
                      File f = new File("data\\twitter\\"+fileName);//create file
                      if(!f.exists())
                      {
                        try {
                                   f.createNewFile();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                      }
                     
                      PrintStream console = System.out;// to switch back to console after writing a file
                      System.out.println("showing tweet result");    
                      Query query = new Query(SearchQuery).lang("en");;
                   	  QueryResult result = null;
                          
                              
                             
                             do {
                                  
                            	  
                            	  
                        
                                  

                                try {    
                                	 	
                                		result = twitter.search(query);
                                        
                                       
                                       
                                        List<Status> tweets = result.getTweets();
                                        for (Status tweet : tweets) {
                                        	 
                                        	System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                                            System.out.println(tweet.getFavoriteCount()+1);
                                            System.out.println(tweet.getRetweetCount()+1);
                                            tweetList.add(tweet.getText());
                                            favoritelist.add(tweet.getFavoriteCount()+1);
                                           retweetList.add(tweet.getRetweetCount()+1);
                                            
                                        }
                                        
                                        
                                       
                           
                                    
                                      
                                    
                                         

                                      
                                        
                                    } 
                                        catch (Exception e) {
                                    e.printStackTrace();
                                }
                                  

                               
                              } 
                              
                             
                             while ((query = result.nextQuery()) != null); //search till end page//52 tweets with this
                             
                             System.out.println("SAVING IN FILE");
                         	try {
             					FileOutputStream fos = new FileOutputStream(f);
             					PrintStream ps = new PrintStream(fos);
                                 System.setOut(ps);   //for copy console to file
             				} catch (FileNotFoundException e) {
             					// TODO Auto-generated catch block
             					e.printStackTrace();
             				}
                         	//for (Status tweet : tweets) {
                              //   System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                             	//System.out.println(tweet.getFavoriteCount());
                             	//System.out.println(tweet.getRetweetCount());
                            // }  
                         	
                         	
                             
                         	
                         	  
                         	System.out.println(SearchQuery);
                         	System.out.println(tweetList.size());
                             
                           for(int i = 0; i < tweetList.size(); i++) {
                             	System.out.println(tweetList.get(i));
                             	System.out.println(favoritelist.get(i));
                             	System.out.println(retweetList.get(i));
                           }
                           System.setOut(console);
                           System.out.println("savED tweet in the text file......."); 
                         
                              
                              
                              
                          
						
                          return tweetList;
						
                        
                    
                                 
          
    }


	public static ArrayList<String> Tweets()
	{
		return tweetList;
		
		
		
	}
	
	public static ArrayList<Integer> favoriteTweets()
	{
		return favoritelist;
		
		
	}
	
	public static ArrayList<Integer> reTweets()
	{
		return retweetList;
		
		
	}
	
}