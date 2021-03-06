package com.helpers.entity;

public class Grid {
    private int nbrow;
    private int nbCol;
    private String[][] mapGrid;
    public boolean torpedo = false;

    public Grid(int n, int p) {
        nbrow = n;
        nbCol = p;
        System.out.println(p);
        System.out.println(n);
        mapGrid = new String[nbrow][nbCol];
        for (int i = 0; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                mapGrid[i][j] = ".";
            }
        }
    }

    public void showTest() {
        System.out.println();
        for (int i = 0; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                System.out.print("|" + mapGrid[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public void placer(int l, int c, String t) {
        l = l - 1;
        c = c - 1;
        //test on grid?
        if (l < 0 || c < 0 || l > nbrow || c > nbCol) {
            System.out.println("Erreur! de placement");
            return;
        }
        if (mapGrid[l][c] == ".") {
            mapGrid[l][c] = t;
        } else {
            System.out.println("Erreur, cette zone n'est pas vide");
        }
    }

    public String getCase(int l, int c) {
        return mapGrid[l - 1][c - 1];
    }

    public void movingH() {
        String tmp;
        for (int i = 0; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                if (mapGrid[i][j] == Uboat.getName()) {
                    if (i - 1 >= 0 && mapGrid[i - 1][j] == ".") {
                        tmp = mapGrid[i][j];
                        mapGrid[i][j] = ".";
                        mapGrid[i - 1][j] = tmp;
                    }
                }
            }
        }
    }

    public void movingB() {
        String tmp;
        for (int i = 1; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                if (mapGrid[i][j].equals(Uboat.getName())) {
                    if (i + 1 < nbrow && mapGrid[i + 1][j] == ".") {
                        tmp = mapGrid[i][j];
                        mapGrid[i++][j] = ".";
                        mapGrid[i][j] = tmp;
                    }
                }
            }
        }
    }

    public void movingR() {
        String tmp;
        for (int i = 0; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                if (mapGrid[i][j].equals(Uboat.getName())) {
                    if (j + 1 < nbCol && mapGrid[i][j + 1] == ".") {
                        tmp = mapGrid[i][j];
                        mapGrid[i][j++] = ".";
                        mapGrid[i][j++] = tmp;
                    }
                }
            }
        }
    }

    public void movingL() {
        String tmp;
        for (int i = 0; i < nbrow; i++) {
            for (int j = 1; j < nbCol; j++) {
                if (mapGrid[i][j].equals(Uboat.getName())) {
                    if (j <= nbCol && mapGrid[i][j - 1] == ".") {
                        tmp = mapGrid[i][j];
                        mapGrid[i][j] = ".";
                        mapGrid[i][j - 1] = tmp;
                    }
                }
            }
        }
    }

    public boolean torpedoFire(boolean torpedo) {
        for (int i = 0; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                if (mapGrid[i][j].equals(Uboat.getName())) {
                    int y = i;
                    int x = j+1;
                    System.out.println("x: " + x + " y: " + y);
                    if (mapGrid[y][x] == ".") {
                        mapGrid[y][x] = ">";
                    } else {
                        System.out.println("Erreur, cette zone n'est pas vide");
                    }
                }
            }
        }
        return torpedo = true;
    }



    public void torpedoTu(){
        String tmp;
        for (int i = 0; i < nbrow; i++) {
            for (int j = 0; j < nbCol; j++) {
                if (mapGrid[i][j] == ">" ) {
                    if (j + 2 < nbCol && mapGrid[i][j + 2] == ".") {
                        tmp = mapGrid[i][j];
                        mapGrid[i][j++] = ".";
                        mapGrid[i][j++] = tmp;
                    }
                }
            }
        }
    }

}

