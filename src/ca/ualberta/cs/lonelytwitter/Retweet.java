package ca.ualberta.cs.lonelytwitter;


public class Retweet extends Fave
{
	static final String SUBNOTE = "retweeted from myself";
	private String tweet;
	public Retweet()
	{

		super();
	}

	public Retweet(String tweetName)
	{
		super(tweetName);
		this.tweetName = "A retweeted";
	}

	
	public String getTweet()
	{
		
		return tweet+SUBNOTE;
	}

	
	public void setTweet(String tweet)
	{
		
		this.tweet = tweet;
	}
	
	
	

	
}
