import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieGame {
    public static void main(String[] args) {
       
        int counter = 1;
        String dashedMovie ="";
        String userInput;          

        try {
           
            String movie  =  PickUpMovie("movies.txt");
            Scanner input  = new Scanner(System.in);
            char[] pattern = new char[movie.length()];
            for (int i = 0; i < pattern.length; i++) {
                pattern[i] = '-';
            }
            dashedMovie = String.valueOf(pattern);
            System.out.print("Your hidden movie .. : ");
            for (int i = 0; i < pattern.length; i++) {
                System.out.print(pattern[i]);
            }
            System.out.print("\n");
            int fin = 15;
            while(counter<=fin){
                
               // if user complete game and recognize the movie name ..
                if(!(dashedMovie.toString().contains("-"))){
                    break;
                }
                System.out.println("you have "+(fin - counter)+" Gusses");
                System.out.print("enter char : ");
                userInput = input.nextLine();
                char[] charArrayUserInput = userInput.toCharArray();
                
                for (char charUserInput : charArrayUserInput) {    
                    for (int y = 0; y < pattern.length; y++) {
        
                        if (movie.charAt(y) == charUserInput) {
                            pattern[y] = charUserInput;
                                    
                        }
        
                    }
                    dashedMovie = String.valueOf(pattern);
                    
                for (int i = 0; i < pattern.length; i++) {
                    System.out.print(pattern[i]);
                }  
                System.out.print("\n");

 
             
            }
            counter++;
   
           
             
        } 
         } catch (FileNotFoundException e) {
         }
         System.out.print("\n");

         if(counter < 20){
            System.out.println("you win");
            System.out.println("Your moive  = "+ dashedMovie.toString());

         }
       
            
        
        
        
    }
    public static String PickUpMovie(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner filScanner  = new Scanner(file);
        Scanner input = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        int index = 0;
        while(filScanner.hasNextLine()){
            movies.add(filScanner.nextLine());
            index++;
        }
       

        return movies.get(input.nextInt());

    }
}
