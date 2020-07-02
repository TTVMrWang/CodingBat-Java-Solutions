public boolean catDog(String str) {
  int catC = 0;
  int dogC = 0;
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i, i + 3).equals("cat")) {
      catC++;
    }
    if(str.substring(i,i + 3).equals("dog")) {
      dogC++;
    }
  }
  
  return(catC == dogC);
}
