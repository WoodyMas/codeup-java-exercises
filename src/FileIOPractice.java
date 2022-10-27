import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {



//    public static void deleteName(String nameToDelete){
//        List<String> updatedNames = new ArrayList<>();
//        // use for loop to loop thru oldNames
        // use an if statement to match the desired name to delete
//         updateNames.add
//    }


    public static void main(String[] args) {
        Path pathToPeople = Paths.get("src", "fileIO", "people.txt");
        boolean peopleExist = Files.exists(pathToPeople);
        System.out.println(peopleExist);

//
        List<String> peopleLines = new ArrayList<>();
        try {
            peopleLines = Files.readAllLines(pathToPeople);
            System.out.println(peopleLines);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Something may be wrong with the file or filepath");
        }
        for (int i = 0 ; i < peopleLines.size(); i++){
            System.out.printf("%n%s works at Codeup.", peopleLines.get(i));
        }
        List<String> classmatesArrayList = Arrays.asList("David", "Danny", "Aaron", "Fernando");
        try {
            Files.write(pathToPeople, classmatesArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }




//
        //        Path p = Paths.get("src", "weywot", "java", "test.txt.txt");
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }

    }
}
