public int blueTicket(int a, int b, int c) {
  if((a + b) == 10 || (b + c) == 10 || (c + a) == 10) {
    return 10;
  }
  if((a + b) - 10 == (b + c) || (a + b) - 10 == (c + a)) {
    return 5;
  }
  
  return 0;
}