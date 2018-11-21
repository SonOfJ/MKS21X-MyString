public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[CharSequence.length];
    for(int i = 0; i < data.length; i = i + 1) {
      data[i] = CharSequence.charAt(i);
    }
  }
  public char charAt(int index) {
    return data[index];
  }
}
