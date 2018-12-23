import java.util.*;

public class ArithmeticProblems{

  public static void main(String[] args){
    Random rand = new Random();
    boolean correctness;
    for (int i = 1; i<=10; i++){
      int problem = rand.nextInt(3);
      if (problem == 0){
        correctness = addition();
      }
      else if (problem == 1){
        correctness = subtraction();
      }
      else if (problem == 2){
        correctness = multiplication();
      }
      else if (problem == 3){
        correctness = division();
      }
    }
    //if (correctness == true){
      //car will mooooooove
    //}
    //else if (correctness == false){
      //car will NOT mooooooove
    //}
  }

  public static boolean addition(){
    Random rand = new Random();

    int x = rand.nextInt(100);
    int y = rand.nextInt(100);

    System.out.printf("%d + %d = ___%n", x, y);
    int userAnswer = getUserInput();
    if (x + y == userAnswer){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean subtraction(){
    Random rand = new Random();

    int x = rand.nextInt(100);
    int y = rand.nextInt(100);

    while (x - y < 0){
      x = rand.nextInt(100);
      y = rand.nextInt(100);
    }

    System.out.printf("%d - %d = ___%n", x, y);
    int userAnswer = getUserInput();
    if (x - y == userAnswer){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean multiplication(){
    Random rand = new Random();

    int x = rand.nextInt(12);
    int y = rand.nextInt(12);

    System.out.printf("%d * %d = ___%n", x, y);
    int userAnswer = getUserInput();
    if (x * y == userAnswer){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean division(){
    Random rand = new Random();

    int x = rand.nextInt(144);
    int y = rand.nextInt(12);

    while (x % y != 0){
      x = rand.nextInt(144);
      y = rand.nextInt(12);
    }
 s
    System.out.printf("%d / %d = ___%n", x, y);
    int userAnswer = getUserInput();
    if (x / y == userAnswer){
      return true;
    }
    else{
      return false;
    }
  }
  public static int getUserInput(){
    Scanner answer = new Scanner(System.in);
    int a = answer.nextInt();
    return a;
  }
}
