package com.bmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);

        float tinggi, berat;
        String gender;

        while (true){
            System.out.println("===== CALCULATOR BMI =====");
            System.out.print("Masukan berat badan (KG): ");
            berat = sc.nextFloat();
            System.out.print("Masukan tinggi badan (CM): ");
            tinggi = sc.nextFloat();
            sc.nextLine();

            System.out.print("Jenis Kelamin (Pria|Wanita): ");
            gender = sc.nextLine();
            while (!(gender.matches("Pria") || gender.matches("Wanita"))){
                System.out.println("Salah input, ulang lagi!");
                System.out.print("Jenis Kelamin (Pria|Wanita): ");
                gender = sc.nextLine();
            }

            BMI bmi = new BMI(berat, tinggi, gender);
            bmi.setBmi();

            System.out.println("\n\n========== HASIL =========");

            System.out.println("Berat: "+(int)bmi.getBerat()+"KG");
            System.out.println("Tinggi: "+(int)(bmi.getTinggi() * 100)+"CM");
            System.out.println("BMI: "+bmi.getBmi());
            System.out.println("Hasil: "+bmi.getHasil());

            System.out.print("Ulangi program? (Y/T)");
            gender = sc.nextLine();
            while (!(gender.matches("Y") || gender.matches("T"))){
                System.out.println("Salah input, ulang lagi!");
                System.out.print("Ulangi program? (Y/T): ");
                gender = sc.nextLine();
            }

            if (gender.matches("T")){
                break;
            }

        }

    }
}
