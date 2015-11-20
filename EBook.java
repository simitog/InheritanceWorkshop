package InheritanceWorkshop;

public class EBook extends Book
{
   private String url;

   public EBook(String url, String title, String isbn)
   {
      super(title, isbn);
      this.url = url;
   }

   public String getUrl()
   {
      return url;
   }

   public String getBookType()
   {
      return "E-Book";
   }

   public String toString()
   {
      return super.toString() + ", url = " + url;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof EBook))
      {
         return false;
      }
      EBook obj1 = (EBook) obj;
      return this.url.equals(obj1.url) && super.equals(obj1);

   }

}
