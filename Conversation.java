import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    System.out.println("For how many rounds would you like to play?");
    Scanner rounds = new Scanner(System.in);
    int num_rounds = rounds.nextInt(); 
    System.out.println("Hi there!  What's on your mind?");
    String[] responses = {"uh-huh", "Is that so?", "Really?", "Are you sure?", "wow", "Interesting"};
    int[] roundsArray = {0, num_rounds - 1};
    for(int i  : roundsArray){
      Scanner input = new Scanner(System.in);
      String userInput = input.nextLine();
      //String[] words = userInput.split(" ");
      System.out.println(responses[i]);


      }

      Scanner input = new Scanner(System.in);
      String userInput = input.nextLine();
      System.out.println("Goodbye!");
    }
    

  
  }

