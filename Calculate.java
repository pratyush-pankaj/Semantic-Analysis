package sentiment;

import java.util.ArrayList;

public class Calculate {

	
	
	public static String queryTitle=null;
	public static int consolidatedFav;
	public static int consolidatedreTweets;
	
static void individualCalculation(ArrayList<String> Tweets,ArrayList<Integer> favoriteTweets,ArrayList<Integer> reTweets,ArrayList<Integer> sentiTweets,String query)
{
	int positivefav=0;
	int positiveret=0;
	int negativefav=0;
	int negativeret=0;
	int neutralfav=0;
	int neutralret=0;
	int positivetweet=0;
	int negativetweet=0;
	int neutraltweet=0;
	float positivetweetpercentage=0;
	float negativetweetpercentage=0;
	float neutraltweetpercentage=0;
	int totaltweetfavorites=0;
	float negativefavpercentage=0;
	float positivefavpercentage=0;
	float neutralfavpercentage=0;
	int totalretweet=0;
	float negativertpercentage=0;
	float positivertpercentage=0;
	float neutralrtpercentage=0;
	int fusedfav=0;
	int fusedretweet=0;
	
	for(int i = 0; i < Tweets.size(); i++) {
     	if(sentiTweets.get(i)==0||sentiTweets.get(i)==1)
     	{
     		negativefav=negativefav+favoriteTweets.get(i);
     		negativeret=negativeret+reTweets.get(i);
     		negativetweet=negativetweet+1;
     	
     	
     	}
     	
     	if(sentiTweets.get(i)==3||sentiTweets.get(i)==4)
     	{
     		positivefav=positivefav+favoriteTweets.get(i);
     		positiveret=positiveret+reTweets.get(i);
     		positivetweet=positivetweet+1;
     	
     	}
     	
     	if(sentiTweets.get(i)==2)
     	{
     		neutralfav=neutralfav+favoriteTweets.get(i);
     		neutralret=neutralret+reTweets.get(i);
     		neutraltweet=neutraltweet+1;
     	}	
   
	
	}
	
	positivetweetpercentage=(((float)positivetweet/(float)Tweets.size())*100);
	negativetweetpercentage = (((float)negativetweet/(float)Tweets.size())*100);
	neutraltweetpercentage = (((float)neutraltweet/(float)Tweets.size())*100);
	
	System.out.println("___________________Showing result_________________________");
	System.out.println("___________________Based on tweets_________________________");
	System.out.println("OUT OF "+Tweets.size()+" Tweets which are scanned");
	System.out.println(positivetweet+" that is "+positivetweetpercentage+" percent of Tweets are positive");
	System.out.println(negativetweet+" that is "+negativetweetpercentage+" percent of Tweets are negative");
	System.out.println(neutraltweet+" that is "+neutraltweetpercentage+" percent of Tweets are neutal");
	
	totaltweetfavorites=negativefav+positivefav+neutralfav;
	if(totaltweetfavorites!=0)
	{
	System.out.println("___________________Based on tweetlikes_________________________");
	
	
	
	
	
	negativefavpercentage=(((float)negativefav/(float)totaltweetfavorites)*100);
	positivefavpercentage=(((float)positivefav/(float)totaltweetfavorites)*100);
	neutralfavpercentage=(((float)neutralfav/(float)totaltweetfavorites)*100);
	
	System.out.println("Based on "+totaltweetfavorites+" favorites in Tweets which are scanned");
	System.out.println(positivefav+" that is "+positivefavpercentage+" percent of people showed positive gesture liking tweet");
	System.out.println(negativefav+" that is"+negativefavpercentage+" percent of people showed negative gesture by liking tweet ");
	System.out.println(neutralfav+" that is "+neutralfavpercentage+" percent of people are neutal");
	
	fusedfav=positivefav-negativefav;
	
	}
	
	totalretweet=negativeret+positiveret+neutralret;
	if (totalretweet!=0)
	{
System.out.println("___________________Based on retweets_________________________");
	
	
	
	
	
	negativertpercentage=(((float)negativeret/(float)totalretweet)*100);
	positivertpercentage=(((float)positiveret/(float)totalretweet)*100);
	neutralrtpercentage=(((float)neutralret/(float)totalretweet)*100);
	
	System.out.println("Based on"+totalretweet+"retweets which are scanned");
	System.out.println(positiveret+" that is "+positivertpercentage+" percent of people showed showed positive gesture  retweet");
	System.out.println(negativeret+" that is "+negativertpercentage+" percent of people showed negative gesture by retweet ");
	System.out.println(neutralret+" that is "+neutralrtpercentage+" percent of people are neutal");

	fusedretweet=positiveret-negativeret;
	}
	
	
	System.out.println("___________________ JUDGING OVERALL INDIVIDUAL SUCCESSRATE _________________________");
	System.out.println(((float)positivertpercentage*0.8)+((float)positivefavpercentage*0.2)+" percent Succesrate");

queryTitle=query;
	




if(fusedfav<0)
{
  fusedfav=0;
  consolidatedFav=fusedfav;
}
else
{
	consolidatedFav=fusedfav;
}

if(fusedretweet<0)
{
  fusedretweet=0;
  consolidatedreTweets=fusedretweet;
}
else
{
	consolidatedreTweets=fusedretweet;
}


}

public static String query()
{
	return queryTitle;
	
	
	
}

public static int consolidatedfav()
{
	return consolidatedFav;
	
	
}

public static int consolidatedreTweets()
{
	return consolidatedreTweets;
	
	
}

}	
	

