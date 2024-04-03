public class Main {
public static void main(String[] args) {    
  System.out.println("Hello world!");
  // winter, spring, summer, autumn
  // warm jacket, t-shirt, swimming suite, rain coat
  String season = "spring";

  if (season == "winter") {
    System.out.println("Wear a warm jacket!");
  }
  else if (season == "spring") {
    System.out.println("Wear a T-shirt!");
  }
  else if (season == "summer") {
    System.out.println("Wear a swimming suite!");
  }
  else if (season == "autumn") {
    System.out.println("Wear a rain coat!");
  }    

// else if, performs only, if last one is not runned. Stops, as finds true meaning.
  // in case of IF, runs all functions at the same time.

  {
 double temperature = 10;

  if (temperature <= 5) {
    System.out.println("Super warm clothes needed");
  }
  else if (temperature <= 15) {
    System.out.println("Wear warm!");
  }
  else if (temperature <= 30) {
    System.out.println("Wear normal!");
  }
  else  {
    System.out.println("You need cooling");
  } 
  }
}
}
