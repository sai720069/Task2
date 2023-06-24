package in.veridic.model;

import lombok.Data;

@Data
public class AdditionClass
{

    private int firstParam;
    private int secondParam;


    public int getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(int firstParam) {
        this.firstParam = firstParam;
    }

    public int getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(int secondParam) {
        this.secondParam = secondParam;
    }


}
