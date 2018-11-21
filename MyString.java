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
  public int length() {
    int length = 0;
    for(int i = 0; i < data.length; i = i + 1) {
      length = length + 1;
    }
  }
  public CharSequence subSequence(int start, int end) {
    new CharSequence bolg for(int i = start; i < end; i = i + 1) {

    }
  }
}
