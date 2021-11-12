package com.bmi;

public class BMI {

    private float berat;
    private float tinggi;
    private String gender;
    private float bmi;


    public BMI(float berat, float tinggi, String gender) {
        this.berat = berat;
        this.tinggi = tinggi / 100;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BMI(float berat, float tinggi) {
        this.berat = berat;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setBmi() {
        this.bmi = berat / (this.tinggi * this.tinggi);
    }

    public float getBmi() {
        return bmi;
    }

    public String getHasil() {
        String result;
        if (this.gender.matches("Pria")){
            if (this.bmi >= 27 ){
                result = "Obesitas";
            }else if (this.bmi >= 25){
                result = "Kegemukan";
            }else if (this.bmi >= 18){
                result = "Normal";
            }else {
                result = "Kurus";
            }
        }else {
            if (this.bmi >= 27 ){
                result = "Obesitas";
            }else if (this.bmi >= 23){
                result = "Kegemukan";
            }else if (this.bmi >= 17){
                result = "Normal";
            }else {
                result = "Kurus";
            }
        }

        return result;
    }


}
