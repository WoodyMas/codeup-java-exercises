package animals;

public class Parrot extends Bird implements Pet{
    public void makeNoise(){
        super.makeNoise();
        System.out.println("When torrential water tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is because of timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely regulated. Their potential is that of a fully drawn crossbow; their timing, the release of the trigger.");
    }
    public void echo (String input){
        super.makeNoise();
        System.out.println(input);
    }

    public Parrot(){
        System.out.println("output Parrot");
    }
    public void beCute(){
        System.out.println("AAAWWWwwwwWWWwwwAAAwwwwwWWWWWWaaaAAAAA says the human");
    }
}
