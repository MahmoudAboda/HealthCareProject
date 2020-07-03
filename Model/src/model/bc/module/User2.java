package model.bc.module;

import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;

public class User2 {
    private String DoctorName;
    private String PASSWORD;
      private String Doctorgender;
    private String email;
   
    private int age;
    DBSequence id;
    private String disease;

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public User2(String DoctorName, String PASSWORD, String Doctorgender, String email,int age, DBSequence id,String disease) {
        super();
        this.DoctorName = DoctorName;
        this.PASSWORD = PASSWORD;
        this.Doctorgender = Doctorgender;
        this.email = email;
      
        this.age=age;
        this.id=id;
        this.disease=disease;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPatientgender(String Doctorgender) {
        this.Doctorgender = Doctorgender;
    }

    public String getDoctorgender() {
        return Doctorgender;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


   
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
}
