public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()]; //Initiates an array with same length as CharSequence
    for(int i = 0; i < data.length; i = i + 1) {
      data[i] = s.charAt(i); //Fills in the elements of CharSequence
    }
  }
  public char charAt(int index) {
    if (index < 0 || index >= data.length) {
      throw new IndexOutOfBoundsException(); //Index can't be less than zero or equal to or greater than length
    }
    return data[index]; //Returns the element at the index
  }
  public int length() {
    int length = 0;
    for(int i = 0; i < data.length; i = i + 1) {
      length = length + 1; //Adds 1 for every element
    }
    return length; //Returns length
  }
  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || end > data.length || start > end) {
      throw new IndexOutOfBoundsException(); //Start and end can't be less than zero, end can't be bigger than length and start can't be bigger than end
    }
    String bolg = ""; //Declares new String
    for(int i = start; i < end; i = i + 1) {
      bolg = bolg + charAt(i); //Builds up the String
    }
    return bolg; //Returns the String
  }
  public String toString() {
    String print = ""; //Declares new String
    for(int i = 0; i < data.length; i = i + 1) {
      print = print + charAt(i); //Builds up the String
    }
    return print; //Returns the String
  }
  public int compareTo(CharSequence s) throws ClassCastException { //Type must be valid
    if (s == null) {
      throw new NullPointerException(); //Can't test null
    }
    if (length() > s.length()) { //First sequence is longer
      for(int i = 0; i < s.length(); i = i + 1) {
        if (charAt(i) != s.charAt(i)) { //The characters are not equal
          return charAt(i) - s.charAt(i); //Return the difference of the value of the character and the value of the character in the parameter
        }
      }
      return length() - s.length(); //If all elements match, return the difference of the length and the length of the parameter
    }
    if (length() < s.length()) { //Second sequence is longer
      for(int i = 0; i < length(); i = i + 1) {
        if (charAt(i) != s.charAt(i)) { //The characters are not equal
          return charAt(i) - s.charAt(i); //Return the difference of the value of the character and the value of the character in the parameter
        }
      }
      return length() - s.length(); //If all elements match, return the difference of the length and the length of the parameter
    }
    for(int i = 0; i < length(); i = i + 1) { //There is only one case left: the two lengths are equal
      if (charAt(i) != s.charAt(i)) { //The characters are not equal
        return charAt(i) - s.charAt(i); //Return the difference of the value of the character and the value of the character in the parameter
      }
    }
    return 0; //If all elements match, the two sequences are equal and 0 should be returned
  }
}
