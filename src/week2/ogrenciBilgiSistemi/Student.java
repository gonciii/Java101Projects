package week2.ogrenciBilgiSistemi;

public class Student {
    // fields
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    // constructor method:
    public Student (String name,String stuNo,int classes,Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat  = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;

    }
    public void addBulkExamNote(int mat,int fizik,int kimya) {
        if (mat >=0 && mat<=100  ) {
            this.mat.note = mat;
        }
        if (fizik >=0 && fizik<=100) {
            this.fizik.note = fizik;
        }
        if (kimya>=0 && kimya<=100) {
            this.kimya.note = kimya;
        }
    }
    public void addVerbalNote(double matVerbalNote,double fizikVerbalNote,double kimyaVerbalNote) {
        this.mat.verbalNote = matVerbalNote;
        this.fizik.verbalNote = fizikVerbalNote;
        this.kimya.verbalNote = kimyaVerbalNote;
    }
    public void calcAverage() {
        double matAverage = this.mat.note * (1-this.mat.verbalPercent)  + this.mat.verbalNote * this.mat.verbalPercent;
        double fizikAverage = this.fizik.note * (1-this.fizik.verbalPercent)  + this.fizik.verbalNote * this.fizik.verbalPercent;
        double kimyaAverage = this.kimya.note * (1-this.kimya.verbalPercent)  + this.kimya.verbalNote * this.kimya.verbalPercent;


        // average note:
        this.average = ((matAverage + fizikAverage + kimyaAverage) / 3) * 0.80 + ((this.mat.verbalNote + this.fizik.verbalNote + this.kimya.verbalNote) / 3) * 0.20;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note==0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;

    }

    public void printNote() {
        System.out.println("-------ÖĞRENCİ BİLGİ SİSTEMİ-------");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik notu : " +this.mat.note +" Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Fizik notu : " + this.fizik.note + " Sözlü Notu: "+ this.fizik.verbalNote);
        System.out.println("Kimya notu: " + this.kimya.note + "  Sözlü Notu : " + this.kimya.verbalNote);
    }

}

