public class Main {
    public static void main(String[] args) {
        Man maksim = new Man(1988,"Максим","Минск","бренд менеджером");
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.yearOfBirth = 1988;
        maksim.jobTitle = "бренд менеджером.";
        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.town +
                ". Я родился в " + maksim.yearOfBirth + " году.Я работаю на должгости " + maksim.jobTitle + " Будем знакомы!");


        Man katy = new Man(1992,"Катя","Калининград","продакт менеджером");
        katy.name = "Катя";
        katy.yearOfBirth = 1992;
        katy.town = " Калининград";
        katy.jobTitle = "продакт менеджером.";
        System.out.println("Привет! Меня зовут " + katy.name + ". Я из города " + katy.town +
                ". Я родилась в " + katy.yearOfBirth + " году. Я работаю на должности " + katy.jobTitle + " Будем знакомы!");


        Man any = new Man(1993,"Аня","Москва","методистом образовательных программ.");
        any.yearOfBirth = 1993;
        any.town = "Москва";
        any.name = "Аня";
        any.jobTitle = "методистом образовательных программ.";
        System.out.println("Привет! Меня зовут " + any.name + ". Я из города " + any.town +
                ". Я родиллась в " + any.yearOfBirth +" году.Я работаю на должности " + any.jobTitle +" Будем знакомы!");

        Man artem = new Man(1995,"Артем","Москва","директором по развитию бизнеса.");
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.jobTitle = "директором по развитию бизнеса.";
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth +" году.Я работаю " + artem.jobTitle + " Будем знакомы!");


        // Задание 2 и задание 3
        Car lada = new Car("Lada","Granta","1.7","желтого цвет",2015,"российская");
        lada.brend = "Lada";
        lada.model = "Granta";
        lada.engineVolume = "1.7";
        lada.color = "желтого цвет";
        lada.country = "российская";
        lada.year = 2015;
        System.out.println("Автомобиль " + lada.brend + lada.model + lada.color + ", сборка " + lada.country + ". Год выпуска " +lada.year+ ". Обьем двигателя " + lada.engineVolume);

        Car audi = new Car("Audi","A8 50 L TDI quattro","3,0","черный",2020,"Германия");
        audi.engineVolume ="3,0";
        audi.year = 2020;
        audi.country = "Германия";
        audi.color = "черный";
        audi.brend = "Audi";
        audi.model = " A8 50 L TDI quattro ";
        System.out.println("Автомобиль "+audi.brend+ audi.model + audi.color + ", объем двигателя "+ audi.engineVolume + ". Год выпуска "+ audi.year + "производитель "+ audi.country );


        Car bmv = new Car("BMV","Z8","3,0","черный",2021,"Германия");
        bmv.country = "Германия";
        bmv.year= 2021;
        bmv.engineVolume = "3,0";
        bmv.color ="черный";
        bmv.model = "Z8,";
        bmv.brend = "BMV";
        System.out.println("Автомобиль "+ bmv.brend+ bmv.model + "цвета "+ bmv.color+ ". Объем двигателя " + audi.engineVolume+ ". Год выпуска "+ bmv.year + ". Страна сборки "+ audi.country);


        Car kia = new Car("Kia","Sportage 4-го поколения","2,4","красный",2018,"Южная Корея");
        kia.country = "Южная Корея";
        kia.year = 2018;
        kia.engineVolume = "2,4";
        kia.color = "красный";
        kia.model = "Sportage 4-го поколения";
        kia.brend = "Kia";
        System.out.println("Автомобиль "+ kia.brend + kia.model + ", цвет "+ kia.color + ". Объем двигателя "+ kia.engineVolume+ ". Год выпуска "+ kia.year+ ". Сборка " + kia.country);


        Car huinday = new Car("Huinday","Avente","1,6","оранжевый",2016,"Южная Корея");
        huinday.country = "Южная Корея";
        huinday.year = 2016;
        huinday.engineVolume = "1,6";
        huinday.color = "оранжевый";
        huinday.model = "Avente";
        huinday.brend = "Huinday";
        System.out.println("Автомобиль " + huinday.brend+huinday.model+ "сборка "+ huinday.country +"цвет кузова — "+  huinday.color + " объем двигателя "+ huinday.engineVolume+ "год выпуска "+ huinday.year);

    }
}