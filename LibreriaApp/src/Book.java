public class Book{
  private int id=0;
  private String title="";
  private String author="";
  private int publicationYear=0;
  private int numberOfPages=0;

 
 

  public Book() {
    //TODO Auto-generated constructor stub
  }

  public Book(String author2, String title2, int id2, int publicationYear2, int numberOfPages2) {
    //TODO Auto-generated constructor stub
}

public void setId(int newid){
     id=newid;
  }

  public int getId(){
      return id; 
  }

  public String getTitle(){
      return title;
  }

  public String getAuthor(){
      return author;

  }

 
      public void settitle(String titles){
        title=titles;
      }
      public String gettitle(){
          return title;
      }
  
      public void setauthor(String authors){
        this.author=authors;
      }
      public String getauthor(){
          return author;
      
    }

      public void setpublicationYear(int publicationYears){
      this.publicationYear=publicationYears;
    }

      public int getpublicationYear(){
        return publicationYear;

      }

      public void setnumberOfPages(int numberOfPages){
          this.numberOfPages=numberOfPages;

      }
      public int getnumberOfPages(){
          return numberOfPages;

      }



    public Book CreateBook(String author, String title, int id, int publicationYear, int numberOfPages){
      Book book = new Book();
      book.setauthor(author);
      book.settitle(title);
      book.setId(id);
      book.setpublicationYear(publicationYear);
      book.setnumberOfPages(numberOfPages);
      return book;
    }

    

    

    
 

}