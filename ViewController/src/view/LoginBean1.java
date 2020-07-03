package view;

import java.io.Serializable;
import model.bc.module.User1;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class LoginBean1 implements Serializable {
    private String patientName="";
    private String password="";
    private User1 user=null;
    
        public void setUser(User1 user) {
            this.user = user;
        }

        public User1 getUser() {
            return user;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
    }
    public LoginBean1() {
    }

    public String validatelogin() {
        BindingContainer bindingContainer = BindingContext.getCurrent().getCurrentBindingsEntry();
                   OperationBinding loginOperation = bindingContainer.getOperationBinding("checkLogin1");
   
                    loginOperation.getParamsMap().put("userName",patientName);
                    loginOperation.getParamsMap().put("password", password);
            
                       Boolean checkLogin = (Boolean) loginOperation.execute();   
            
       
                 if(loginOperation.getErrors().isEmpty())
                       if(checkLogin){
                      
                           user = (User1) ADFContext.getCurrent().getSessionScope().get("USER1");
                        
                            return "pat";
                       }
        return null;
    }

    
  
    
}
