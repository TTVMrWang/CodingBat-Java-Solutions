public String plusOut(String str, String word) {
  String s = "";
  int i = 0;
  int end = 0;
  int l =str.length();
  while(i < str.length()) {
    end = i + word.length();
    if(end > l) {
      end = l;
    }
    if(str.substring(i, end).equals(word)) {
      s += word;
      i += word.length();
    }
    else {
      s += "+";
      i++;
    }
  }
  return s;
}
