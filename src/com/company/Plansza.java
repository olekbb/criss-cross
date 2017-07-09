package com.company;

import java.io.IOException;

/**
 * Created by Olek on 08.07.2017.
 */
public class Plansza
{
    char[][] plansza;

    Plansza() {
        plansza = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                plansza[i][j] = '_';
            }
        }
    }

    void wyswietl() throws IOException{
        Runtime.getRuntime().exec("cls");
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.print(plansza[i][j] + " ");
            }
        }
    }

    void postawKrzyzyk() {

    }

}
