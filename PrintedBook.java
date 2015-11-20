package InheritanceWorkshop;

public class PrintedBook extends Book
{
   private boolean isPaperback;

   public PrintedBook(String title, String isbn, boolean paperback)
   {
      super(title, isbn);
      this.isPaperback = paperback;
   }

   public boolean isPaperback()
   {
      return isPaperback;
   }

   public String getBookType()
   {
      if (isPaperback)
      {
         return "Paperback";
      }
      else
      {
         return "Hard cover";
      }
   }

   public String toString()
   {
      return super.toString() + ", the back is " + isPaperback;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof PrintedBook))
      {
         return false;
      }
      PrintedBook obj1 = (PrintedBook) obj;
      return this.isPaperback == obj1.isPaperback && super.equals(obj1);
   }

}
