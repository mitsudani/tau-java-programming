package collections;

import java.util.HashMap;
import java.util.Map;

public class Gradebook {

    public static void main(String args[]) {

        System.out.println(getFinalGrades(TestResults.getOriginalGrades(), TestResults.getMakeUpGrades()));

    }

    public static Map getFinalGrades(Map<String, Integer> originalGrades, Map<String, Integer> makeUpGrades) {

        Map finalGrades = new HashMap();

       originalGrades.forEach((k, v) -> {

           for (var entry: makeUpGrades.entrySet()) {
               if (k == entry.getKey()) {
                   if (v > entry.getValue()) {
                       finalGrades.put(k, v);
                   } else {
                       finalGrades.put(k, entry.getValue());
                   }
               }
           }
       });

        return finalGrades;
    }
}
