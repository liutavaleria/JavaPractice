public class Main {
    public static void main(String[] args) {
        int n = 10;
        Car[] cars = new Car[n];
        cars[0] = new Car(01,"tesla","s",2010,"white",70000,"BB 2101 AX");
        cars[1] = new Car(10,"tesla","s",2010,"white",70000,"BB 2101 AX");
        cars[2] = new Car(02,"tesla","3",2011,"black",82000,"BB 2501 AX");
        cars[3] = new Car(03,"tesla","x",2012,"white",74000,"BB 8101 AX");
        cars[4] = new Car(04,"bmw","m3 e46",2013,"white",30000,"BB 6101 AX");
        cars[5] = new Car(05,"bmw","x5",2010,"white",10000,"BB 2161 AX");
        cars[6] = new Car(06,"dodge","challenger",2010,"white",100000,"BB 8601 AX");
        cars[7] = new Car(07,"tesla","s",2017,"white",70000,"AA 2101 AX");
        cars[8] = new Car(80,"tesla","s",2011,"white",70000,"BB 2092 AX");
        cars[9] = new Car(90,"tesla","s",2010,"white",70000,"BB 1525 AX");
        String mark1 = "tesla";
        String model1="s";
        int year1 = 2011;
        int price1 = 60000;
        ListOfCarFirst.FirstFunction1(cars,mark1);
        ListOfCarSecond.SecondFunction(cars,model1,year1);
        ListOfCarThird.function_third(cars,year1,price1);
    }
}
