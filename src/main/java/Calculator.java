import org.jetbrains.annotations.NotNull;
//Main code of Calculator
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Calculator {
    public static int add(String string) {
        if(!string.isEmpty()){
            List<Integer> numbers = strArrToIntList(getSplit(string));
            negatives(numbers);
            return numbers.stream()
                    .reduce(Integer::sum)
                    .orElseThrow();
        }

        return 0;
    }

    private static void negatives(List<Integer> numbers) {
       StringBuilder stringbuilder = new StringBuilder();
       numbers.stream()
               .filter(num->num<0)
               .forEach(num->stringbuilder.append(num).append(" "));
       if(!stringbuilder.toString().isEmpty()){
           throw new RuntimeException("negative number are not allowed"+stringbuilder.toString());

       }
    }

    @NotNull
    private static List<Integer> strArrToIntList(String[] stringArr) {
        return Arrays.stream(stringArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    @org.jetbrains.annotations.NotNull
    private static String[] getSplit(String string){
        if(string.startsWith("//")){
           Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(string);
           if(matcher.matches()){
               String delimitor = matcher.group(1);
               String toSplit = matcher.group(2);
               return toSplit.split(delimitor);

           }
           throw new RuntimeException("Wrong Custom Delimiter");
           
        }

        return string.split(",|\n");
    }
}
