package com.company;

public class Student {
    private String naam;
    private int nummer;

    public Student(String naam, int nummer){
        setNaam(naam);
        setNummer(nummer);
    }

    public Student(int nummer){
        setNummer(nummer);
    }

    public String getNaam(){

        return naam;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public int getNummer(){

        return nummer;
    }

    public void setNummer(int nummer){

        this.nummer = nummer;
    }


    public void info(){
        if (naam == null){
            System.out.println("Deze student heeft geen naam");
        }
        else{
            System.out.println("Deze student heet: "+getNaam());
        }
        System.out.println("Studentennummer: "+getNummer());
        System.out.println("-------------------------------------------------");
    }
}

