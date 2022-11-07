
import java.util.Hashtable;
/* Library class: Building to store and take books from */
public class Library extends Building {
    private java.util.Hashtable<String, Boolean> collection;

    /** 
     *  Constructor for Library class
     *  @param name Name of the Library
     *  @param address Location of the library
     *  @param nFloors Number of floors in the library
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);//parent constructor
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /** 
     *  Adds a book to our library collection and automatically makes it available
     *  @param title Title of the book
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book to be removed
     *  @return The title that was removed
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return(title);
    } 

    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book to be checked out
     */
    public void checkOut(String title){
      if (collection.contains(title)) {
        collection.replace(title, true, false);
      }
      else{
        System.err.println("This title is not is our collection.");
      }
    }
    
    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book to be checked in (returned)
     */
    public void checkIn(String title){
      if (collection.contains(title)) {
        collection.replace(title, false, true);
      }
      else{
        System.err.println("This title is not is our collection.");
      }
    }

    /** 
     *  Checks whether a book is in our library collection
     *  @param title Title of the book
     *  @return T/F: Is the book in our collection?
     */
    public boolean containsTitle(String title){
    if (collection.contains(title)) {
      return true;
    }
    else{
      return false;
    }
  }

  /** 
   *  Checks whether a book is available
   *  @param title Title of the book
   *  @return T/F: Is the book available?
   */
  public boolean isAvailable(String title){ 
    if (collection.contains(title)) {
      return collection.get(title);
    }
    else{
      System.err.println("This bookis not in out collection");
      return false;
    }
  }

  /** 
   *  Prints out our entire library collection
   */
  public void printCollection(){
    System.out.println(this.collection);
  }

    public static void main(String[] args) {
      Library x = new Library("Nielson","Chapin Drive",4);
      x.addTitle("Bambi - Jidenna");
      x.addTitle("Snow White -Disney");
      x.printCollection();
    }
  
  }