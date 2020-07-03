package view;

import java.io.Serializable;

import model.bc.module.User1;

import model.bc.module.User2;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class LoginBean2 implements Serializable {
    private String doctorname="";
    private String password="";
    private User2 user=null;

    public LoginBean2() {
    }

    public void setUser(User2 user) {
        this.user = user;
    }

    public User2 getUser() {
        return user;
    }

    public String validateLogin2() {
        BindingContainer bindingContainer = BindingContext.getCurrent().getCurrentBindingsEntry();
                   OperationBinding loginOperation = bindingContainer.getOperationBinding("checkLogin2");
        System.out.println("111111111");
                    loginOperation.getParamsMap().put("userName",doctorname);
                    loginOperation.getParamsMap().put("password", password);
            
                       Boolean checkLogin = (Boolean) loginOperation.execute();   
            
        System.out.println("2222222222222");
                 if(loginOperation.getErrors().isEmpty())
                       if(checkLogin){
                      
                           user = (User2) ADFContext.getCurrent().getSessionScope().get("USER2");
                         System.out.println("gjjkkhjkjdkfjdkf");
                            return "doc_nav";
                       }
        return null;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
