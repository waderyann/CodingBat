public String extraEnd(String str) {
  String first = Character.toString(str.charAt(str.length() - 1));
  String Second = Character.toString(str.charAt(str.length() - 2));
  return Second + first + Second + first + Second + first;
}
