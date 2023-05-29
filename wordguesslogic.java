import java.util.Scanner;
import java.util.Random;
public class wordguesslogic {
    static String []movies={"fast and furious" , "avenger", "jack rayn", "boss baby", "cars"};

    static boolean flag=true;

   static String gen_word(){
        Random ra=new Random();
        int index=ra.nextInt(5);
        return movies[index];
    }

    static void gues(){
        Scanner sc=new Scanner(System.in);
        String com=gen_word();
        System.out.println("enter the movies name which length of movies name is  "+ com.length() );
        String s1= sc.nextLine();
        if(s1.equalsIgnoreCase(com)){
            System.out.println("you won.");
        }
        else{
            System.out.println("you loose!!!! do you want to play again press Y for yes & N for exit ");
            String s2;
            s2= sc.next();
            if(s2.equals("Y")){
                flag=true;
            }
            else {
                flag=false;
                System.out.println("Game over...");
            }
            if(flag){
                gues();
            }
        }
    }
}
