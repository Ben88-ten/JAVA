import java.nio.file.Paths;
import java.util.Scanner;


public class Textdurchsuchen {
    public static void main(String[] args) throws Exception{
        String file = "/home/benni/Dokumente/IdeaProjects/ErstesProjekt/src/faust.txt";

        Scanner input = new Scanner(Paths.get(file));

        int countI = 0;
        int countYou = 0;
        while (input.hasNext()){
            String word = input.next();
            word = word.toLowerCase();

            if (word.equals("ich")){
                countI++;
            }
            if (word.equals("du")){
                countYou++;
            }
        }
        System.out.println("Ich " + countI);
        System.out.println("Du " + countYou);
    }

}


