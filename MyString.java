public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[CharSequence.length]; //Initiates an array with same length as CharSequence
    for(int i = 0; i < data.length; i = i + 1) {
      data[i] = CharSequence.charAt(i); //Fills in the elements of CharSequence
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
    new CharSequence bolg for(int i = start; i < end; i = i + 1) {

    }
  }
}
