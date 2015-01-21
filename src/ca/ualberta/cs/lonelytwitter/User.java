package ca.ualberta.cs.lonelytwitter;


public abstract class User extends Object implements UserLike
{
	protected String name;

	
	public String getName()
	{
	
		return name;
	}

	
	public abstract void setName(String x) ;

	public User(String name)
	{
		super();
		this.name = name;
	}
	
	public User()
	{
		super();
		this.name = "anonymous";
	}
	
}
