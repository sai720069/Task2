package in.veridic.model;

import lombok.Data;

@Data
public class AdditionResult
{

    private int FirstParam;
    private int SecondParam;
    private int result;

    public AdditionResult(int firstParam, int secondParam, int result) {
        this.FirstParam = firstParam;
        this.SecondParam = secondParam;
        this.result = result;
    }

    public int getFirstParam() {
        return FirstParam;
    }

    public void setFirstParam(int firstParam) {
        FirstParam = firstParam;
    }

    public int getSecondParam() {
        return SecondParam;
    }

    public void setSecondParam(int secondParam) {
        SecondParam = secondParam;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
