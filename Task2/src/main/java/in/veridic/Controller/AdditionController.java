package in.veridic.Controller;

import in.veridic.Service.AdditionService;
import in.veridic.model.AdditionClass;
import in.veridic.model.AdditionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class AdditionController
{
    @Autowired
    private AdditionService additionService;

    /*@PostMapping("/Adddata")
    public int Add(@RequestParam int FirstParam, @RequestParam int SecondParam)
    {
       return additionService.Add(FirstParam,SecondParam);
    }*/

    @PostMapping("/addnumber")
    public ResponseEntity<AdditionResult> Add(@RequestParam("firstParam") int firstParam,@RequestParam("secondParam") int secondParam )
    {
        return new ResponseEntity<>(additionService.Add(firstParam,secondParam), HttpStatus.OK);
    }

}