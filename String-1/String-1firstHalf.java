public String firstHalf(String str) {
  String newString = "";
  for (int i = 0; i < str.length()/2; i++){
    newString += Character.toString(str.charAt(i));
  }
  return newString;
}
