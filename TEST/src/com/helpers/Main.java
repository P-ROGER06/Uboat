package com.helpers;
import com.helpers.entity.Grid;
import com.helpers.entity.Uboat;
import java.util.Scanner;
import static com.helpers.entity.Uboat.*;

public class Main {

    public static void main(String[] args) {
        Grid firstLevel= new Grid(10, 15);
        firstLevel.placer(4,5,"j");firstLevel.placer(10,2,"O");firstLevel.placer(10,3,"O");

        boolean isStart = true;
        System.out.println("taper sur \"entrer\" pour commencer");
        Scanner sc = new Scanner(System.in).useDelimiter("[zqsdif]");
        String commande = sc.nextLine();

        System.out.println("Taper le nom de votre sous-marin:" );
        saisie();

        System.out.println("Déplacer votre sous-marin avec les touches z q s d et f pour faire feu");

        while (true) {
            commande = sc.nextLine();

            switch (commande) {
                case "z" -> {
                    firstLevel.movingH();
                    firstLevel.showTest();
                    MovingForward();
                    System.out.println("les moteurs du sous-marins " + Uboat.getName() + " sont en marche");
                }
                case "q" -> {
                    firstLevel.movingL();
                    firstLevel.showTest();
                }
                case "s" -> {
                    firstLevel.movingB();
                    firstLevel.showTest();
                   //StopMoving();
                   // System.out.println("les moteurs du sous-marins " + Uboat.getName() + " sont à l'arrêt");
                }
                case "d" -> {
                    firstLevel.movingR();
                    firstLevel.showTest();
                }
                case "f" -> Fire();
                case "i" -> isAlive();
            }
        }

    }
}



