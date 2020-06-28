public String fizzString2(int n) {
  String output = "" + n;
  if (n % 3 == 0) {
    output = "Fizz";
  }
  if (n % 5 == 0) {
    output = "Buzz";
  }
  if ((n % 3 == 0) && (n % 5 == 0)) {
    output = "FizzBuzz";
  }
  
  return output + "!";
}
