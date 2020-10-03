public class ListOfCarSecond {
    static public void SecondFunction(Car[] cars, final String model, int year) {
        System.out.print("All cars of this model :\n");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel() == model && cars[i].getYear() > year) {
                System.out.print(cars[i]);
            }
        }

    }
}