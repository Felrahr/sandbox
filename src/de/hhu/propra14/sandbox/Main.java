package de.hhu.propra14.sandbox; 

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5)i++;
            if (i < 5)
                System.out.println("smaller than five!" + " " + i);
            else System.out.println("bigger than five!" + " " + i);
        }
    }

}
