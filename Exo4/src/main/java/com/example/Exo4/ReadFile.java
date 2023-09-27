package com.example.Exo4;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

class person{
        private String fName;
        private String lName;
        private String doctor;
        private String ToV;

    public person(String fName, String lName, String doctor, String toV) {
        this.fName = fName;
        this.lName = lName;
        this.doctor = doctor;
        ToV = toV;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getToV() {
        return ToV;
    }

    public void setToV(String toV) {
        ToV = toV;
    }

    public void print(){
        System.out.println(getfName() + ", " + getlName() +", doctor : " + getDoctor() + " at " + getToV());
    }
}
public class ReadFile {
    public static List<person> toObject(String path){
        List<person> listOfPersons = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] headers = reader.readNext(); // Read the header line

            listOfPersons = new ArrayList<>();


            String[] line;
            while ((line = reader.readNext()) != null) {
                person person = new person(
                        line[0], line[1], line[2],
                        line[3]
                );
                listOfPersons.add(person);
            }

            return listOfPersons;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return listOfPersons;
    }
    
}
