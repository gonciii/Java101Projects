package week2.boxGame;


public class Fighter {
    // fields
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    // constructor :
    public  Fighter (String name,int damage,int health,int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >=0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }


    }
    //
    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + "  hasar verdi.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            System.out.println("-----------------");
        }
        if (foe.health - this.damage < 0 ) {
            return 0;
        }
        return  foe.health - this.damage;
    }


    // random blocking
    public boolean isDodge() {
        // random number
        double randomNumberb = Math.random() * 100;
        return randomNumberb <= dodge;
    }


}
