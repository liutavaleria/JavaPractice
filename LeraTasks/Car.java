public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private String registrationNumber;

    public final String getMark() {
        return mark;
    }
    public final int getYear() {
        return year;
    }
    public final String getModel() {
        return model;
    }
    public final int getPrice() {
        return price;
    }
    public final String getRegistrationNumber() {
        return registrationNumber;
    }

    public Car (int id,String mark,String model,int year,String color, int price, String registrationNumber){
        this.id=id;
        this.mark = mark;
        this.model = model;
        this.year =year;
        this.color =color;
        this.price =price;
        this.registrationNumber =registrationNumber;
    }
    @Override

    public String toString() {
        String str = "";
        str+=" " +id+" "+mark+" "+model+" "+year+" "+color+" "+price+""+registrationNumber+" ";
        str+= " \n";
        return str;
    }

}
