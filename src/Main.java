import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        List<Prastakat> prostokaty = Arrays.asList(
                new Prastakat(5,3),
                new Prastakat(3,9),
                new Prastakat(8,4),
                new Prastakat(12,5),
                new Prastakat(8,15),
                new Prastakat(5,10),
                new Prastakat(7,2),
                new Prastakat(6,9),
                new Prastakat(14,12)
        );

        System.out.println(prostokaty);
//zadanie A
        List<Prastakat> wiekszePole = prostokaty.stream()
              .filter(pro -> pro.getArea() > pro.getPerimeter())
              .collect(Collectors.toList());
        System.out.println(wiekszePole);
//zadanie B
        List<Double> rosnacoObwod = prostokaty.stream()
                .sorted(Comparator.comparingDouble(Prastakat::getPerimeter))
                .map(pro -> pro.getArea())
                .collect(Collectors.toList());
        System.out.println(rosnacoObwod);
//zadanie C
        DoubleSummaryStatistics sredniObwod = prostokaty.stream()
                .mapToDouble(Prastakat::getPerimeter)
                .summaryStatistics();
        System.out.println(sredniObwod.getAverage());
//zadanie E
        DoubleSummaryStatistics sumaPol = prostokaty.stream()
                .mapToDouble(Prastakat::getArea)
                .summaryStatistics();
        System.out.println(sumaPol.getSum());
//zadanie D
        DoubleSummaryStatistics sredniePole = prostokaty.stream()
                .mapToDouble(Prastakat::getArea)
                .summaryStatistics();

        List<Prastakat> zadanied = prostokaty.stream()
                .sorted(Comparator.comparingDouble(Prastakat::getPerimeter))
                .filter(pro -> pro.getArea() < sredniePole.getAverage())
                .collect(Collectors.toList());
        System.out.println(zadanied);
    }
}
