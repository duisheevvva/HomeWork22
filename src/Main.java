import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        fileReader();

    }

    private static void fileReader() throws IOException {
        try {
            FileReader fileReader = new FileReader("song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


    private static void extracted() throws IOException {
        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write("\n Flowers" +
                "We were good ,we were gold " +
                "Kind of dream that can't be sold " +
                "We were right,'till we werem't" +
                "Built a home and watched it burn");
        fileWriter.close();

        Song song =new Song("Miley Cyres","Flowers",fileWriter);
        System.out.println("Title:" + song.getTitle()+ "Author:" + song.getAuthor()+ "text:" + fileWriter);

    }
}