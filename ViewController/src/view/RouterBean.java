package view;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class RouterBean {
    private RichOutputText code;

    public RouterBean() {
    }

    public void setCode(RichOutputText code) {
        this.code = code;
    }

    public RichOutputText getCode() {
        return code;
    }
}
