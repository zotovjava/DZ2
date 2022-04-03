package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
    int box1 = 2;
    byte box2 = 4;
    short box3 = 6;
    long box4 = 200L;
    double box5 = 14.5;
    float box6 = 15.5f;
    boolean box1IsFull = box1 > 16;
    char percent = 37;
    System.out.println (percent);
    System.out.println(box1IsFull);

    //Задание 2
        float fighter1 = 78.2f;
        float fighter2 = 82.7f;
        float total = fighter1 + fighter2;
        float diff = fighter2 - fighter1;
        System.out.println("both fighters weight - " + total);
        System.out.println("weith diff - " + diff);

  //Задание 3
  long bananas = 5L;
  long oneBanansWeith = 80L;
  long BananasWeith = bananas * oneBanansWeith;
  long milk = 200L;
  float milk1Ml = 105 / 100f;
  float milkGm = 200 * 1.05f;
  long oneIcecreamWeith = 100;
  int icecream = 2;
  long allIcecreamWeith = oneIcecreamWeith * icecream;
  int eggs = 4;
  long oneEggsWeith = 70L;
  long eggsWeith = eggs * oneEggsWeith;
  float breakfast = BananasWeith + milkGm + allIcecreamWeith + eggsWeith;
  System.out.println("breakfast weith - " + breakfast + " gm");
  float breakfastKG = breakfast / 1000;
  System.out.println("breakfast in KG - " + breakfastKG + " kg");

  //Задание 4
        int targetKg = 7;
        long targetGm = targetKg * 1000;
        long dayTargetMin = 250;
        long dayTargetMax = 500;
        long daysMax = targetGm / dayTargetMin;
        System.out.println(daysMax);
        long daysMin = targetGm / dayTargetMax;
        System.out.println(daysMin);
        long dayTargetMid = (dayTargetMax + dayTargetMin) /2;
        float daysMid = targetGm / 375f;
        System.out.println(daysMid);

        //Задание 5
        long Masha = 67760L;
        long Denis = 83690L;
        long Kris = 76230L;

        double Masha10 = Masha + (Masha * 0.1);
        double Denis10 = Denis + (Denis * 0.1);
        double Kris10 = Kris + (Kris * 0.1);

        System.out.println("new Mashas ZP - " + Masha10 + " RUB.");
        System.out.println("new Denis ZP - " + Denis10 + " RUB.");
        System.out.println("new Kris ZP - " + Kris10 + " RUB.");

        long MashaYearOld = Masha * 12;
        long DenisYearOld = Denis * 12;
        long KrisYearOld = Kris * 12;

        double MashaYearNew = Masha10 * 12;
        double DenisYearNew = Denis10 * 12;
        double KrisYearNew = Kris10 * 12;

        double difMasha = MashaYearNew - MashaYearOld;
        double difDenis = DenisYearNew - DenisYearOld;
        double difKris = KrisYearNew - KrisYearOld;

        System.out.println("difference new/old year-ZP Masha = " + difMasha + " RUB.");
        System.out.println("difference new/old year-ZP Masha = " + difDenis + " RUB.");
        System.out.println("difference new/old year-ZP Masha = " + difKris + " RUB.");








}


}
