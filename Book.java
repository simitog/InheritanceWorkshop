package InheritanceWorkshop;

public abstract class Book
{
   private String title;
   private String isbn;

   public Book(String title, String isbn)
   {
      this.title = title;
      this.isbn = isbn;
   }

   public String getTitle()
   {
      return title;
   }

   public String getIsbn()
   {
      return isbn;
   }

   public abstract String getBookType();

   public String toString()
   {
      return "Title = " + title + ", isbn = " + isbn;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Book))
      {
         return false;
      }
      Book obj1 = (Book) obj;
      return this.title.equals(obj1.title) && this.isbn.equals(obj1.isbn);

   }

}
