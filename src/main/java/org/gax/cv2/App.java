package org.gax.cv2;

import java.util.*;

public class App
{
    public static void vypisR(String s){
        System.out.println(s);
    }

    public static void vypis(String s){
        System.out.print(s);
    }

    public static int Soucet(int a, int b) {
        return a + b;
    }

    public static int Rozdil(int a, int b)
    {
        return a - b;
    }

    public static int Soucin(int a, int b)
    {
        return a * b;
    }

    public static int Podil(int a, int b)
    {
        return a / b;
    }

    public static int Modulo(int a, int b){
        return a%b;
    }

    public static void rek(int a){
        if(a<=0){
            return;
        }
        System.out.print(a);
        rek(a/2);
        rek(a/2);
    }

    public static void PrezentaceV(String nazev,int vysledek){
        System.out.printf(nazev + " = " + vysledek);
        System.out.println();
    }

    public static int[][] Idk2(int[] z){
        int[][] matice= new int[4][4];

        Random rnd = new Random();
        int sum=0;

        for(int i = 0 ; i < z.length; i++){
            sum+=z[i];
        }
        System.out.println(sum);

        while(sum>0){
            int add = rnd.nextInt(sum+1);
            if(add > sum+1){
                add = sum;
            }
            int i = rnd.nextInt(matice.length);
            int j = rnd.nextInt(matice.length);
            if(i == j){

            }else if(matice[i][j]!=0){

            }else{
                matice[i][j]=add;
                sum=sum-add;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i==j){
                    matice[i][j]=z[i];
                }

            }
        }
        return matice;
    }

    public static int[][] Idk(int[] z){
        int[][] matice= new int[4][4];

        Random rnd = new Random();

        int[] sorted = z.clone();
        Arrays.sort(sorted);

        int min = sorted[0],max = sorted[sorted.length-1];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i!=j){
                    matice[i][j]=rnd.nextInt(max-min)+min;
                }else{
                    matice[i][j]=z[i];
                }

            }
        }

        return matice;
    }

    public static void KontrolaMatice(int[][] matice){
        int v = matice.length, s = matice[0].length;
        int sumDiag =0, sumRest =0;
        for(int i = 0; i < v; i++){
            for(int j = 0; j < s; j++){
                if(i == j) {
                    sumDiag += matice[i][j];
                }
                else{
                    sumRest+= matice[i][j];
                }
            }
        }
        System.out.println(sumDiag + " " + sumRest);
    }

    public static void VypisMatice(int[][] matice){
        int v = matice.length, s = matice[0].length;
        for(int i = 0; i < v; i++){
            for(int j = 0; j < s; j++){
                System.out.print(matice[i][j]+ " ");

            }
            System.out.println();
        }

    }

    public static void main( String[] args )
    {
        int[] a= {2,3,1,4};

        int[][] matice = Idk2(a);
        VypisMatice(matice);
        KontrolaMatice(matice);

//        int[] arr={0,1,2,3,4};
//        int[] arr2=new int[5];
//        int[][] arr3=new int[5][5];
//
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        ArrayList<ArrayList<Integer>> arrList2d = new ArrayList<>();
//        ArrayList<Integer> listOne = new ArrayList<>();
//
//        arrList2d.add(listOne);
//
//
//        arrList.add(6);
//
//        System.out.printf("%d, %d, %d",arr[0],arr[0],arrList.get(0));


//        int a = 5,b = 4,c = 2;
//        int p1 = Rozdil(Soucin(a,c),b);
//        int p2 = Podil(Soucet(Rozdil(a,b),c),Soucet(c,Soucin(b,a)));
//        int p3 = Podil(Rozdil(Soucet(a,b),Soucet(Modulo(a,2),c)),Rozdil(Soucin(b,a),Podil(Rozdil(c,a),2)));
//        PrezentaceV("P1",p1);
//        PrezentaceV("P2",p2);
//        PrezentaceV("P3",p3);
//        rek(6);
//        String s=String.format("Funkce mi vratila:%d",pricti2(5));
//        vypisR(s);

//        int r = 11, s=r/2;
//
//        for(int i = 0; i<r;i++){
//            for(int j = 0; j<s; j++){
//                if(i%2==1){
//                    System.out.print(4-j);
//                }else{
//                    if(j % 2 == 1){
//                        System.out.print("/");
//                    }else{
//                        System.out.print("*");
//                    }
//
//                }
//
//            }
//            System.out.println();
//        }

//        for(int i = 0; i<r; i++){
//            for(int j = i+1; j<r;j++){
//                System.out.print(" ");
//            }
//            for(int j = 0; j<2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i<2; i++){
//            for(int j = 0; j<r-2;j++){
//                System.out.print(" ");
//            }
//            System.out.println("X");
//
//        }
    }
}
