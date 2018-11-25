public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()]; //Initiates an array with same length as CharSequence
    for(int i = 0; i < data.length; i = i + 1) {
      data[i] = s.charAt(i); //Fills in the elements of CharSequence
    }
  }
  public char charAt(int index) {
    return data[index]; //Returns the element at the index
  }
  public int length() {
    int length = 0;
    for(int i = 0; i < data.length; i = i + 1) {
      length = length + 1; //Adds 1 for every element
    }
  }
  public CharSequence subSequence(int start, int end) {
    CharSequence gae; //Declares new CharSequence
    String bolg = ""; //Declares new String
    for(int i = start; i < end; i = i + 1) {
      bolg = bolg + charAt(i); //Builds up the String
    }
    gae = bolg; //Sets CharSequence equal to String
    return gae; //Returns the CharSequence
  }
  public String toString() {
    String print = ""; //Declares new String
    for(int i = 0; i < data.length; i = i + 1) {
      print = print + charAt(i); //Builds up the String
    }
    return print; //Returns the String
  }
}
