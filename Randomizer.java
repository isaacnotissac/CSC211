import java.util.Random;
import java.util.Scanner;
class Randomizer{

    // public int getRandNum() {
    //     Random random = new Random();
    //     int num = random.nextInt(10+1);
    //     return num;
    // }
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("testing");
        int num = random.nextInt(10+1);
        
        int i = 0;
        while (true) {
            if (i<5){
                int guess = input.nextInt();
                if (num > guess) {
                    System.out.println("Too low, try again");
                }
                else if (num < guess) {
                    System.out.println("Too high, try again");
                }
                else {
                    System.out.println("Congratulations! You guessed the correct number");
                    break;
                }
                i++;
            }
            else {
                System.out.println("Timed out!");
                break;
            }
            
        }


    }
}