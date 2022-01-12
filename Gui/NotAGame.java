public class NotAGame
{
	private int myNum;
	private String myString;


	public NotAGame()
	{
		myNum = 0;
		myString = "this is a string";
	}

	public void update(int num, String ss)
	{
		myNum = num;
		myString = ss;
	}
	public String getStringVal()
	{
		return myString;
	}
	public int getIntVal(){
		return myNum;
	}


}