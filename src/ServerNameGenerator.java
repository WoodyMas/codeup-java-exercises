import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
        private String[] adjectives = {
                "Scary", "Hairy", "Revolting", "Graceful", "Jolly", "Dangerous", "Ecstatic", "Appalling", "Jovial", "Somber"
        };

        private String[] nouns = {
                "Dog", "Cat", "Woman", "Man", "Codeup", "Duck", "Java", "Misery", "News", "VETTEC"
        };

        private String name;
        public String getName(){
                return name;
        }
        public static String getRandomElement(String[] array) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(array.length);
                return array[randomIndex];
        }

        public ServerNameGenerator(){
                String adjective = getRandomElement(adjectives);
                String noun = getRandomElement(nouns);
                String combined = adjective + "_" + noun;
                this.name = combined;
        }
}
