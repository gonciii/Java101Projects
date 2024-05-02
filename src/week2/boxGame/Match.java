package week2.boxGame;

public class Match {
    // variables :
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    // constructor metot :
    public  Match (Fighter f1,Fighter f2, int minWeight,int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //  according to healt points control and
    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health >0) {
                System.out.println("----NEW ROUND----");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit((this.f1));
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " kalan canı : " +  this.f1.health);
                System.out.println(this.f2.name + " kalan canı: " +  this.f2.health);
            }


        } else {
            System.out.println("Sporcuların sikletleri uymuyor !");
        }

    }
    public boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;

        }
        return false;
    }

    // With %50 random chance for fighters
    public void whichFighter(){
        if ( Math.random() < 0.50 ) {
            System.out.println(this.f1.name + " ilk dövüşe başlıyor..");
        } else {
            System.out.println(this.f2.name + " ilk dövüşe başlıyor..");
            Fighter temp = this.f1;
            this.f1 = this.f2;
            this.f2 = temp;
            run();

        }
    }


}
