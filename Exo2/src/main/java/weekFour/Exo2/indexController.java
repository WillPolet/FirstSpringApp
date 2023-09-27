package weekFour.Exo2;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@Controller
public class indexController {
    @GetMapping("/counting")
    public String index(){
        return "counting"; //return counting.html in templates
    }
    @PostMapping("/counting")
    public String coutingWords(@ModelAttribute dataFromHTML data, Model model){
        System.out.println(data.toString());
        HashMap<String, Integer> wordsOccurrence = counting.Words(data.toString()); //Need to use toString method (defined in class dataFromHTML) otherwise it's an object
        model.addAttribute("wordsOccurence", wordsOccurrence); // Add the data to the model

        return "counting";
    }

}
