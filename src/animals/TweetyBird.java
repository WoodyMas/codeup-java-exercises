package animals;

public class TweetyBird extends Bird {
    public void makeNoise(){
        // Overriding: a subclass redefines one of its inherited methods when it needs to change or extend the behavior of that method.
        System.out.println("Tweet Tweet");
    }

}
