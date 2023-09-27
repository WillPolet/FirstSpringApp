package weekFour.Exo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class counting {
    public static HashMap<String, Integer> Words(String S) {
//        String S = "Here's some words with no repetition, or maybe that I will write until some words appears twice or more !";
        String[] array = S.split("\\W+");

        ArrayList<String> stringArray = new ArrayList<>();
        HashMap<String, Integer> wordsOccurence = new HashMap<String, Integer>();

        for (int i = 0; i < array.length ; i++ ){
            int count = 0;
            for (int j = 0; j < array.length ; j++){
                if (Objects.equals(array[i].toLowerCase(), array[j].toLowerCase())){
                    count += 1;
                }
            }
            if (!stringArray.contains(array[i].toLowerCase())){
                stringArray.add(array[i].toLowerCase());
//                System.out.println(array[i] + " : " + count);
                wordsOccurence.put(array[i],count);
            }
        }
        return wordsOccurence;
    }
}
