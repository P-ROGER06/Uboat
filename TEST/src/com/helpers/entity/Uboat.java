package com.helpers.entity;
import java.util.Scanner;

public class Uboat {

    Scanner Uboat = new Scanner(System.in);
    private static int bombCapacity = 100;
    public static boolean isMoving = false;
    private static int life = 100;
    private boolean isAlive =true;
    private static String Name;


    public static void saisie() {
        Scanner sc = new Scanner(System.in);
        Uboat uboat = new Uboat();
        uboat.setName(sc.nextLine());
    }

    public static void isAlive() {
       if (life >= 100){
           System.out.println("La structure est intact");
       } else {
           System.out.println("you are dead");
       }
    }

    public static void Fire() {
        if (!isMoving) {
            bombCapacity = bombCapacity - 1;
            System.out.println("1...2...3 Fire! 1 missile vient d'être lancé. " + bombCapacity + " missiles sont disponibles.");
        } else {
            System.out.println("Les moteurs doivent être stoppés");
        }
    }


    public static void MovingForward() {
        com.helpers.entity.Uboat.setMoving(true);
    }

    public static void StopMoving() {
        com.helpers.entity.Uboat.setMoving(false);
    }



    public int getBombCapacity() {
        return bombCapacity;
    }

    public void setBombCapacity(int bombCapacity) {
        this.bombCapacity = bombCapacity;
    }

    public static boolean isMoving() {
        return isMoving;
    }

    public static void setMoving(boolean moving) {
        isMoving = moving;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public static String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}