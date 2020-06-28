public String fizzString(String str) {
  String output = "";
  boolean fb = false;
  if (str.startsWith("f")) {
    output = "Fizz";
    fb = true;
  }
  if (str.endsWith("b")) {
    output = output + "Buzz";
    fb = true;
  }
  if (!(fb)) {
    return str;
  }
  
  return output;
}
