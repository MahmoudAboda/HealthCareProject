package view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class messageaftersend {
    public messageaftersend() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String b2_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        FacesMessage message=new FacesMessage("Message Send succesfully ");
         message.setSeverity(FacesMessage.SEVERITY_INFO);
         FacesContext fc=FacesContext.getCurrentInstance();
         fc.addMessage(null, message);
         
        return null;
    }
}
