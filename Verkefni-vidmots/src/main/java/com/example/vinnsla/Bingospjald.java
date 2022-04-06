/***
 * Nafn:  Gunnar Björn Þrastarson
 * email: gbt6@hi.is
 *
 * Lýsing: Klasi sem sér um bakendavinnslu á bakvið Bingóspjald
 */

package com.example.vinnsla;

import java.util.Arrays;

public class Bingospjald implements BingospjaldInterface {

    private final int[][] spjald;

    public Bingospjald() {
        spjald = nyttSpjald();
    }

    public int[][] getSpjald() {
        return spjald;
    }

    /**
     * Tekur inn fimm fylki og setur það saman í eitt 5x5 fylki
     *
     * @param B fylki af 5 tölum
     * @param I fylki af 5 tölum
     * @param N fylki af 5 tölum
     * @param G fylki af 5 tölum
     * @param O fylki af 5 tölum
     * @return 5x5 fylki í réttri röð fyrir bingóspjald
     */
    private static int[][] Bingospjaldnr(int[] B, int[] I, int[] N, int[] G, int[] O) {

        int[][] bingospjaldid = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (j == 0) {
                    bingospjaldid[i][j] = B[i];
                }
                if (j == 1) {
                    bingospjaldid[i][j] = I[i];
                }
                if (j == 2) {
                    bingospjaldid[i][j] = N[i];
                }
                if (j == 3) {
                    bingospjaldid[i][j] = G[i];
                }
                if (j == 4) {
                    bingospjaldid[i][j] = O[i];
                }
            }
        }

        return bingospjaldid;
    }

    /**
     * Býr til fylki af lengdinni "lines" og setur inn tölur innan þeyrra marka
     * sem gefin eru
     *
     * @param upper efri mörk talna sem á að setja í fylkið
     * @param lower neðri mörk talna sem á að setja í fylkið
     * @return fylki af random tölum sem passa inn í þau mörk sem gefið er
     */
    private static int[] random(int upper, int lower) {
        int[] fylki;
        fylki = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = (int) Math.floor(Math.random() * (upper - lower + 1)) + lower;
            boolean val = contains(fylki, number);
            if (!val) {
                fylki[i] = number;
            } else {
                i--;
            }
        }
        return fylki;
    }

    /**
     * Athugar hvort stak sé núþegar í fyllki
     *
     * @param fylki  Fylki sem á að athuga
     * @param number talan sem leitað er að
     * @return True eða False hvort talan sé í fylkinu
     */
    private static boolean contains(final int[] fylki, final int number) {
        return Arrays.stream(fylki).anyMatch(i -> i == number);
    }

    private static int[] B() {
        return random(15, 1);
    }

    private static int[] I() {
        return random(30, 16);
    }

    private static int[] N() {
        return random(45, 31);
    }

    private static int[] G() {
        return random(60, 46);
    }

    private static int[] O() {
        return random(75, 61);
    }

    /**
     *Setur inn -1 í fylkið þar sem búið er að ýta á takkann
     * @param i RowIndex
     * @param j ColumnIndex
     */
    @Override
    public void aReit(int i, int j) {
        spjald[i][j] = -1;
    }

    /**
     * tekur við 5x5 fylki úr Bingospjadnr og sendir það í interface
     * @return 5x5 fylki
     */
    public int[][] nyttSpjald() {
        return Bingospjaldnr(B(), I(), N(), G(), O());
    }

    /**
     * Athugar hvort að komið sé bingó í skálínu frá efra
     * vinstra horni niður í hægra hornið
     * @return True eða False
     */
    @Override
    public boolean erBingo() {

        for (int i = 0; i < 5; i++) {
            if (spjald[i][i] != -1) return false;
        }
        return true;
    }
}
