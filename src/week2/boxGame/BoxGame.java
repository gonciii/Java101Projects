package week2.boxGame;

public class BoxGame {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Fox",15,100,95,40);
        Fighter f2 = new Fighter("Henry",10,95,85,40);

        Match match = new Match(f1,f2,60,95);
        match.whichFighter();
        match.run();


    }


}
