package ca.ualberta.cs.lonelytwitter;


public class Fave
{
	private String faveTweet;
	protected String tweetName;

	public Fave(String tweetName)
	{

		super();
		this.tweetName = tweetName;
	}
	
	public Fave()
	{
		super();
		this.tweetName = "Some tweet";
	}

	
	public String getFaveTweet()
	{
	
		return faveTweet;
	}

	
	public void setFaveTweet(String faveTweet)
	{
	
		this.faveTweet = faveTweet;
	}
	
}
