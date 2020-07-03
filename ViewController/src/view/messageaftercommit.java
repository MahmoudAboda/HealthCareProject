package view;

import com.asn1c.codec.Factory;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class messageaftercommit {
    public messageaftercommit() {
    }

    public String msgaction() {
        
       FacesMessage message=new FacesMessage("Message Send succesfully wait untill Doctors reply");
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc=FacesContext.getCurrentInstance();
        fc.addMessage(null, message);
        
        
        return null;
    }
}
