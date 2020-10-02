public class ListOfCarThird {
    static public void function_third(Car [] cars, int year, int price){
        System.out.print("All cars that are more expensive :\n");
        for( int i=0; i<cars.length; i++){
            if( cars[i].getYear() == year && cars[i].getPrice()>price){
                System.out.print(cars[i]);
            }
        }
    }
}
