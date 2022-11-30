public class Main {
    public static void main(String[] args) {
        Man maksim = new Man(1988,"Максим","Минск","бренд менеджером");
        maksim.name = "Максим";
        maksim.setTown("Минск");
        maksim.setYearOfBirth(1988);
        maksim.jobTitle = "бренд менеджером.";
        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.getTown() +
                ". Я родился в " + maksim.getYearOfBirth() + " году.Я работаю на должгости " + maksim.jobTitle + " Будем знакомы!");



        Man katy = new Man(1992,"Катя","Калининград","продакт менеджером");
        katy.name = "Катя";
        katy.setYearOfBirth(1992);
        katy.setTown(" Калининград");
        katy.jobTitle = "продакт менеджером.";
        System.out.println("Привет! Меня зовут " + katy.name + ". Я из города " + katy.getTown() +
                ". Я родилась в " + katy.getYearOfBirth() + " году. Я работаю на должности " + katy.jobTitle + " Будем знакомы!");


        Man any = new Man(1993,"Аня","Москва","методистом образовательных программ.");
        any.setYearOfBirth(1993);
        any.setTown("Москва");
        any.name = "Аня";
        any.jobTitle = "методистом образовательных программ.";
        System.out.println("Привет! Меня зовут " + any.name + ". Я из города " + any.getTown() +
                ". Я родиллась в " + any.getYearOfBirth() +" году.Я работаю на должности " + any.jobTitle +" Будем знакомы!");

        Man artem = new Man(1995,"Артем","Москва","директором по развитию бизнеса.");
        artem.name = "Артем";
        artem.setYearOfBirth(1995);
        artem.setTown("Москва");
        artem.jobTitle = "директором по развитию бизнеса.";
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() +" году.Я работаю " + artem.jobTitle + " Будем знакомы!");


        Man vladimir = new Man( 0,"Владимир","Казань","нигде не работаю");
        vladimir.name ="Владимир";
        vladimir.setAge(21);
        vladimir.setTown("Казань");
        vladimir.jobTitle= ",нигде не работаю";
        System.out.println("Меня зовут "+ vladimir.name + ". Я из города " + vladimir.getTown() + ", мне " + vladimir.getAge()+ "лет" + vladimir.jobTitle);


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