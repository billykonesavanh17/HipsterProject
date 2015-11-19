package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
//  private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
//		this.hipsterBook = new Book[3];
		setupArray();
//		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is art. ";
		hipsterPhrases[1] = "I liked Guy Fieri before he was cool.  ";
		hipsterPhrases[2] = "I am trying to be a vegan, but meat is so good ";
		hipsterPhrases[3] = "Equal rights for plants.  ";
	}
	
	private void setupBooks()
	{
		
	}
	
	public Hipster(String name)
	{
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

}
