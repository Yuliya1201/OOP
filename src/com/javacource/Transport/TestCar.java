package com.javacource.Transport;
import java.time.LocalDate;
import java.util.concurrent.Callable;


public class TestCar {
    public static void main(String[] args) {
        CarPart2 audi = new CarPart2<>("audi", "Q8", 1800, "", "yellow",
                "hatchback", false, null, "р443но193", 4,
                190);
        CarPart2.Key audikey = audi.new Key(true, true);

        CarPart2.Insurance audiInsurance =audi.new Insurance(LocalDate.of(2023,9,6),-300,"123456789");
        audi.setKey(audikey);
        audi.setInsurance(audiInsurance);

        System.out.println(audi);
    }
}
