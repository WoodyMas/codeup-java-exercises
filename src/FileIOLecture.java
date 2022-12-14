import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {

        // ============================ PATH
//        String path = "src/test.txt.txt"; // Setting a filepath using String data type
//        Path pathToTest = Paths.get("src", "fileIOLecture", "test.txt.txt");
//        System.out.println(pathToTest);

//        Path pathToWeywot = Paths.get("src", "fileIoLecture", "test.txt.txt");
//        System.out.println(pathToTest);

//        Path pathToWeywot = Paths.get("hello", "weywot.txt");
//        System.out.println(pathToWeywot);

//        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java");
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

//        Path pathToText = Paths.get("src", "practiceTest", "test.txt");
//        System.out.println(pathToText);
//        boolean textExist = Files.exists(pathToText);
//        System.out.println(textExist);

        // ============================ FILE METHODS

//        Path fileLecturePath2 = Paths.get("src", "fileIOLecture", "FileIOLecture.java");
//        System.out.println(Files.exists(fileLecturePath2));
//        System.out.println(Files.exists(Paths.get("bob.txt")));
////
        String directory = "data";
        String filename = "info.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
//
        System.out.println(dataDirectory);
        System.out.println(dataFile);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



//
//        if (Files.notExists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // ============================ READING FILES

        // p is a Paths.get
//        Path p = Paths.get("src", "weywot", "java", "test.txt.txt");
        Path peopleTxtPath = Paths.get("src", "fileIO", "people.txt");
        System.out.println(peopleTxtPath);
        System.out.println(Files.exists(peopleTxtPath));

//        System.out.println(p);

//        List<String> lines = new ArrayList<>();
//
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




//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }



        // ============================ WRITING FILES

//        Path p = Paths.get("src", "weywot", "java", "test.txt.txt");

//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
//        try {
//            Files.write(p, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }



    }
}
