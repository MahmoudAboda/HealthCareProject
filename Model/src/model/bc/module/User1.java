package model.bc.module;

import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;

public class User1 {
  private String PatientName;
  private String PASSWORD;
 
    private String patientgender;
    
    private String email;
    
    private int age;
    DBSequence id;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(DBSequence id) {
        this.id = id;
    }

    public DBSequence getId() {
        return id;
    }

    

    public User1(String PatientName, String PASSWORD, String patientgender, 
                 String email,int age,DBSequence id) {
        super();
        this.PatientName = PatientName;
        this.PASSWORD = PASSWORD;
        
        
        this.patientgender = patientgender;
        
        this.email = email;
        
        this.age=age;
        this.id=id;
        
    }
   
  

   


    
      

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

   
    

    public void setPatientgender(String patientgender) {
        this.patientgender = patientgender;
    }

    public String getPatientgender() {
        return patientgender;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

   
  

}