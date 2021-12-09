public String withoutEnd(String str) {
  String middle = "";
  for (int i = 1; i < str.length() - 1; i++){
    middle = middle + str.charAt(i);
  }
  return middle;
}
