package in.veridic.Service;

import in.veridic.Utility.AdditionUtility;
import in.veridic.model.AdditionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionService
{
    @Autowired
    private AdditionUtility additionUtility;

    public AdditionResult  Add(int FirstParam, int SecondParam)
    {
        int addition = additionUtility.addition(FirstParam, SecondParam);


        AdditionResult additionResult = new AdditionResult(FirstParam,SecondParam,addition);
        return additionResult;
    }


}
