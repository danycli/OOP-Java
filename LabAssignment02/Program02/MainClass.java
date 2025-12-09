package LabAssignment02.Program02;

public class MainClass {
    public static void main(String [] args){
        Country c1 = new Country("Af.rica.", "SouthAfrica", 2344);
        System.out.println(c1.CountConsecutiveTwoSameLettersInCountryName());
        System.out.println(c1.checkCoutryNameAndcontinentNameStartsWithSameLetterOrNot());
        System.out.println(c1.CombineCountryNameAndContinentName());
        c1.ChangeContinentName();
        System.out.println(c1.getContinentName());
        c1.replace();
        System.out.println(c1.getCountryName());
    }
} 
