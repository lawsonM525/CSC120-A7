import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private Boolean hasDiningRoom;

  /** 
   *  Constructor for House Building
   *  @param name Name of the House
   *  @param address Location of the House
   *  @param nFloors Number of Floors in the house
   *  @param hDR Whether or not the house has a dining room
   */
  public House(String name, String address, int nFloors, Boolean hDR) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hDR;
    System.out.println("You have built a house: 🏠");
  }
  
  /** 
   *  Checks whether the house has a  dining room
   *  @return T/F: Does this house have a dining room?
   */
  public Boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /** 
   *  Counts number of residents in the house
   *  @return The number of residents is the residents array
   */
  public int nResidents(){
    return this.residents.size();
  }

  /** 
   *  Adds a student to the array of residents
   *  @param name Name of the Student
   */
  public void moveIn(String name){
    this.residents.add(name);
  }

  /** 
   *  Removes a student from the array of residents
   *  @param name Name of the students
   *  @return Message that says a student has moved out
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name+" has moved out. Bye!";
  }

  /** 
   *  Checks whether a student is a resident of the house
   *  @param person Name of the person
   *  @return T/F: Is the person a resident of the house?
   */
  public boolean isResident (String person){
    return this.residents.contains(person);
  }

  /** 
   *  Main Method
   */
  public static void main(String[] args) {
    new House("Wilson House", "27 Elm Street", 4, false);
  }

}