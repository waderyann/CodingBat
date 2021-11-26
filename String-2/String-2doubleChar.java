public String doubleChar(String str) {
  String newStr = "";
  for (int i =0; i < str.length(); i++){
    char b = str.charAt(i);
    newStr = newStr + b + b;
  }
  return newStr;
}