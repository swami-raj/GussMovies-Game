import java.util.Scanner;
import java.util.Random;
public class wordguesslogic {
    static String []movies={"fast and furious" , "avenger", "jack rayn", "boss baby", "cars"};

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
            System.out.println("you won");
        }
        else{
            System.out.println("you loose");
        }
    }
}
