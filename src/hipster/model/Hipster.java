package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
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
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Rick Riordan");
		firstBook.setTitle("Red Pyramid");
		firstBook.setSubject("Adventure fiction");
		firstBook.setPageCount(516);
		firstBook.setPrice(12.83);
		
		secondBook = new Book();
		secondBook.setAuthor("John Steinbeck");
		secondBook.setTitle("Of Mice and Men");
		secondBook.setSubject("Novella");
		secondBook.setPageCount(187);
		secondBook.setPrice(17.79);
		
		thirdBook = new Book(336, "Harper Lee", "To Kill A Mockingbird", "Southern Gothic", 14.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
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
	
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

}
