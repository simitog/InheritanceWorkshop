package InheritanceWorkshop;

import java.util.ArrayList;

public class BookList
{
   private ArrayList<Book> books;

   public BookList()
   {
      this.books = new ArrayList<>();
   }

   public int getNumberOfBooks()
   {
      return books.size();
   }

   public void addBook(Book book)
   {
      books.add(book);
   }

   public Book getBook(int index)
   {
      return books.get(index);
   }

   public Book getBook(String isbn)
   {
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i).getIsbn().equals(isbn))
         {
            return books.get(i);
         }
      }
      return null;
   }

   public Book removeBook(int index)
   {
      return books.remove(index);
   }

   public int getIndexOfFirstPrintedBook()
   {
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i) instanceof PrintedBook)
         {
            return i;
         }

      }
      return -1;
   }

   public int getNumberOfBooksByType(String bookType)
   {
      int counter = 0;

      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i).getBookType().equals(bookType))
         {
            counter++;

         }

      }
      return counter;
   }

   public Book[] getBooksByType(String bookType)
   {
      Book[] books2 = new Book[getNumberOfBooksByType(bookType)];
      int counter = 0;
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i).getBookType().equals(bookType))
         {
            books2[counter] = books.get(i);
            counter++;
         }

      }
      return books2;
   }

   public EBook[] getAllEBooks()
   {
      EBook[] ebook = new EBook[getNumberOfBooksByType("E-Book")];
      int counter = 0;
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i).getBookType().equals("E-Book"))
         {
            ebook[counter] = (EBook) books.get(i);
            counter++;
         }
      }
      return ebook;
   }

   public String toString()
   {
      String s = "List has " + getNumberOfBooks() + " books\n";
      for (int i = 0; i < books.size(); i++)
      {
         s += "Book " + (i + 1) + ": " + books.get(i).toString() + "\n";
      }

      return s;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof BookList))
      {
         return false;
      }

      BookList temp = (BookList) obj;
      if (getNumberOfBooks() != temp.getNumberOfBooks())
      {
         return false;
      }
      else
      {
         for (int i = 0; i < books.size(); i++)
         {
            if (!(books.get(i).equals(temp.getBook(i))))
            {
               return false;
            }
         }
      }
      return true;

   }

}
