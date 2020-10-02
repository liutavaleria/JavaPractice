public class ListOfCarFirst {
    static public void FirstFunction1(Car[] cars, final String mark) {
        System.out.print("All cars of this brand :\n");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMark() == mark)
                System.out.print(cars[i]);
        }

    }
}

