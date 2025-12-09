package LabAssignment02.Program02;

public class Country {
    private String countryName;
    private String continentName;
    private double area;
    //Constructor
    public Country(String countryName, String continentName, double area) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.area = area;
    }
    //Getters and Setters
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    } 
    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void displaInfo(){
        System.out.println("Country name = "+countryName+"\nContinent Name = "+continentName+"\nArea of the Country = "+area);
    }
    //Other methods
    public boolean checkCoutryNameAndcontinentNameStartsWithSameLetterOrNot(){
        return countryName.charAt(0) == (continentName.charAt(0));
    }
    public int CountConsecutiveTwoSameLettersInCountryName(){
        int count = 0;
        String[] split = countryName.split("");
        for(int i = 0; i < split.length - 1; i++){ 
            if(split[i].equals(split[i+1])){  
                count++;
            }
        }
        return count;
    }
    public void ChangeName(){
        this.countryName = "Islamic Republic of "+countryName;
    }
    public String CombineCountryNameAndContinentName(){
        String combine = countryName + continentName;
        return combine;
    }
    public void ChangeContinentName(){
        String[] split = continentName.split("");
        for(int i = 1; i < split.length; i++){
            if(split[i].equals(split[i].toUpperCase())){
                continentName = continentName.substring(0,i)+" "+continentName.substring(i); 
            }
        }
    }
    public static String addTwoCountryNamesAndContinentNames(Country C1, Country C2){
        String combine = C1.countryName + C2.countryName;
        if(C1.continentName.equals(C2.continentName)){
            return combine + C1.continentName;
        }else{
            return combine + C1.continentName + C2.continentName;
        }
    }
    public void replace(){
        if(countryName.charAt(countryName.length() - 1) == '.'){
        String replace = countryName.substring(0, countryName.length() - 1);
        countryName = replace.replace('.', ',')+".";
    }else{
        countryName = countryName.replace('.', ',');
    }
    }
}
