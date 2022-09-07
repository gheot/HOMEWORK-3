public class Main {
    public static void main(String[] args) {
        short git = 1000;
        int bobo = 100000;
        long vsxo = 394949392L;
        float adto = 5.5f;
        double hert = 432.42342425;




        float b = 27.12f;
        long a = 987_678_965_549L;
        float n = 2.786f;
        boolean gogo = false;
        short nemo = 569;
        short vorg = -159;
        int hot = 27897;
        short utri = 67;



        int sheetNumber = 480;
        int LudmilaPavlovna = 23;
        int EkaterinaAndreevna = 30;
        int AnnaSergeevna = 27;
        int pupilsSum = LudmilaPavlovna + EkaterinaAndreevna + AnnaSergeevna;
        int sheetPerStudent = sheetNumber / pupilsSum;
        System.out.println("На каждого ученика рассчитано " + sheetPerStudent + " листов бумаги.");


        int bottles = 16;
        int minutes = 2;
        int productivity = bottles / minutes;
        int time = 20;
        int twentyFourHours = 1;
        int days = 3;
        int months = 1;
        int productivityOne = productivity * time;
        int productivityTwo = twentyFourHours * 24 * 60 * productivity;
        int productivityThree = days * 24 * 60 * productivity;
        int productivityFour = months * 24 * 60 * 30 * productivity;
        System.out.println("За " + time + " мин машина произвела бутылок " + productivityOne + " штук");
        System.out.println("За " + twentyFourHours + " сутки машина произвела бутылок " + productivityTwo + " штук");
        System.out.println("За " + days + " дня машина произвела бутылок " + productivityThree + " штук");
        System.out.println("За " +  months +  " месяц машина произвела бутылок " + productivityFour + " штук");



        int cans = 120;
        int whiteColourForClass = 2;
        int brownColourForClass = 4;
        int classesNumber = cans / (whiteColourForClass + brownColourForClass);
        int allBrownCans = classesNumber * brownColourForClass;
        int allWhiteCans = classesNumber * whiteColourForClass;
        System.out.println("В школе, где " + classesNumber + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски.");



        short milk = 200;
        byte icecream = 2;
        byte eggs = 4;
        byte bananas = 5;
        var bananasWeight = bananas * 80;
        var milkWeight = (milk / 100) * 105;
        var icecreamWeight = icecream * 100;
        var eggsWeight = eggs * 70;
        float summaWeight = bananasWeight + icecreamWeight + milkWeight + eggsWeight;
        System.out.println( "Вес завтрака: " + summaWeight + " грамм");
        summaWeight = summaWeight / 1000;
        System.out.println( "Вес завтрака: " + summaWeight + " кг!");



        var athletesWeight = 7;
        athletesWeight = athletesWeight * 1000;
        var daysNumber1 = athletesWeight / 250;
        var daysNumber2 = athletesWeight / 500;
        var approximatelyDays = (daysNumber2 + daysNumber1) / 2;
        System.out.println( "В среднем потребуется " + approximatelyDays + " день для похудения");




        float MashaIncome =  67760;
        float DenisIncome = 83690;
        float KristinaIncome = 76230;
        var annualMashaIncomeBefore = MashaIncome * 12;
        var annualDenisIncomeBefore = DenisIncome * 12;
        var annualKristinaIncomeBefore = KristinaIncome * 12;
        MashaIncome = MashaIncome * 1.1f;
        DenisIncome = DenisIncome * 1.1f;
        KristinaIncome = KristinaIncome * 1.1f;
        var annualMasha = MashaIncome * 12;
        var annualDenis = DenisIncome * 12;
        var annualKristina = KristinaIncome * 12;
        var incomeDifferenceKristina = annualKristina - annualKristinaIncomeBefore;
        var incomeDifferenceDenis = annualDenis - annualDenisIncomeBefore;
        var incomeDifferenceMasha = annualMasha - annualMashaIncomeBefore;
        System.out.println( "Маша теперь получает " + MashaIncome + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей.");
        System.out.println( "Денис теперь получает " + DenisIncome + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println( "Маша теперь получает " + KristinaIncome + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");




    }
}