package com.company;

public class Main {

    public static void main(String[] args) {
    int baris, kolom;

    int matriksA[][]= {{2,3,4}, //inisialisasi matriks a
                       {5,6,7},
                       {8,9,10}};

    int matriksB[][]= {{-2,-3,-4},//inisialisasi matriks b
                         {-5,-6,-7},
                        {-8,-9,-10}};

    baris=matriksA.length;// sebagai baris
    kolom =matriksA[0].length;// sebagai kolom
    int hasil[][]= new int[baris][kolom];// hasil diberi baris dan kolom agar variabel hasil dapat mengetahui berapa ordo dalam kedua matriks

        System.out.println("Hasil");
    for (int i=0; i<baris; i++){// baris
        for (int j=0; j<kolom;j++){// kolom
            hasil[i][j]=matriksA[i][j]-matriksB[i][j];
            System.out.print(hasil[i][j]+" ");


        }
        System.out.println(" ");
    }



    }
    }

