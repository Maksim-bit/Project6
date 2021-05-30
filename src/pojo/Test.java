package pojo;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List fridges = new LinkedList<Fridge>();
        System.out.println(fridges.toString());
        //Collections.sort(fridges);
        Fridge[] fridgArr = new Fridge[]{
                new Fridge(1, "DEXP RF-MN430NHE/S", "DEXP", 39999, "Серебристый", 4.6),
        new Fridge(2, "DEXP RF-CD170NMA/W", "DEXP", 12999, "Белый", 4.8),
        new Fridge(3, "LG GA-B459CLWL", "LG", 35999, "Серебристый", 4.8),
        new Fridge(4, "INDESIT DFN 18", "INDESIT", 21649, "Белый", 4.5),
        new Fridge(5, "LG GA-B509MLS", "LG", 42999, "Серый", 4.8),
        new Fridge(6, "Samsung RB30J3000WW/WT", "Samsung", 28999, "Белый", 4.4),
        new Fridge(7, "LG GA-B509MESL", "LG", 36999, "Бежевый", 4.8),
        new Fridge(8, "BEKO RCNK310KC0W", "BEKO", 22999, "Белый", 4.6),
        new Fridge(9, "Bosch KGV39XW22R", "Bosch", 28999, "Белый", 4.7),
        new Fridge(10, "Samsung RB30J3000SA/WT", "Samsung", 29999, "Серебристый", 4.4)};
        //Сортировка Холодосов по именам
        fridges = Arrays.stream(fridgArr)
                .sorted(Comparator.comparing(Fridge::getName))
                .collect(Collectors.toList());
        System.out.println(fridges.toString());
        //Сортировка Холодосов по цене
        fridges = Arrays.stream(fridgArr)
                .sorted(Comparator.comparingDouble(Fridge::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println(fridges.toString());
        //Холодосы по оценке
        fridges = Arrays.stream(fridgArr)
                .sorted(Comparator.comparingDouble(Fridge::getScore).reversed())
                .collect(Collectors.toList());
        System.out.println(fridges.toString());

        fridges = Arrays.stream(fridgArr)
                .filter(hairDryer -> hairDryer.getPrice() > 20000 && hairDryer.getPrice() < 30000)
                .collect(Collectors.toList());
        System.out.println(fridges.toString());
        //Средняя оценка
        double averageRating = Arrays.stream(fridgArr)
                .mapToDouble(Fridge::getScore)
                .average()
                .orElse(0);
        System.out.println("Middle rate"+averageRating);
        //Холодос белый
        long whiteFriedge = Arrays.stream(fridgArr)
                .filter(fridge -> fridge.getColor().equals("Белый"))
                .count();
        System.out.println("Id Белого холодильника "+whiteFriedge);
        //Оценка покупателей больше 4
        boolean isRatingGoodEnough = Arrays.stream(fridgArr)
                .allMatch(hairDryer -> hairDryer.getScore() > 4.0);
        System.out.println("Холодильник с оценкой >4 "+isRatingGoodEnough);
        //Стоимость больше 50000
        boolean isRatingPriceEnough = Arrays.stream(fridgArr)
                .allMatch(hairDryer -> hairDryer.getPrice() > 50000);
        System.out.println("Цена >50000 "+isRatingPriceEnough);
        //Самый дорогой холодос
        Fridge fridg = Arrays.stream(fridgArr)
                .collect(Collectors.maxBy(Comparator.comparingDouble(Fridge::getPrice))).orElse(null);
        //Холодосы по маркам
        Map<String, List<Fridge>> FridgeGroupedByBrand = Arrays.stream(fridgArr)
                .collect(Collectors.groupingBy(Fridge::getMark));
        System.out.println("Холодильники по марке");

    }

}


