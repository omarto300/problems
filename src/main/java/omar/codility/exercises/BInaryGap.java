package omar.codility.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BInaryGap {

    public int solution(int N) {
        List<Integer> residuos = new ArrayList<>();
        while(N > 0) {
            int divicion = N / 2;
            residuos.add( N % 2);
            N = divicion;
        }
        String numBInario =residuos.reversed().stream().map(String::valueOf).collect(Collectors.joining(""));
        System.out.println("numBInario = " + numBInario);
        Pattern pattern = Pattern.compile("(?=(1(0+1)))");
        Matcher matcher = pattern.matcher(numBInario);
        List<String> gaps = new ArrayList<>();
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            gaps.add(matcher.group(1));
        }

        int mayor = 0;
        for(String gap : gaps) {
            if(mayor < gap.length()) {
                mayor = gap.length();
            }
        }

        return Math.max(mayor - 2 , 0);
    }
}
