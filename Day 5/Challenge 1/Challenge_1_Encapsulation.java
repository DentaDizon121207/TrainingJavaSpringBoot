import java.util.*;

class Cat
{
    private String full_color;
    private Integer num_of_leg;

    public Cat(){

    }
    public Cat(String full_color, Integer num_of_leg)
    {
        this.full_color = full_color;
        this.num_of_leg = num_of_leg;
    }
    public void setFullColor(String full_color)
    {
        this.full_color = full_color;
    }
    public void setNumOfLeg(Integer num_of_leg)
    {
        this.num_of_leg = num_of_leg;
    }
    public String getFullColor()
    {
        return this.full_color;
    }
    public Integer getNumOfLeg()
    {
        return this.num_of_leg;
    }
    public void show_identity()
    {
        System.out.println("Saya kucing dengan detail, Warna Bulu : " + this.getFullColor() + " dengan jumlah kaki : " + this.getNumOfLeg());
    }
}

class Fish
{
    private String type;
    private String feed;

    public Fish(){

    }
    public Fish(String type, String feed)
    {
        this.type = type;
        this.type = feed;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setFeed(String feed)
    {
        this.feed = feed;
    }
    public String getType()
    {
        return this.type;
    }
    public String getFeed()
    {
        return this.feed;
    }
    public void show_identity()
    {
        System.out.println("Saya ikan dengan detail, Jenis : " + this.getType() + " makanan : " + this.getFeed());
    }
}

class Flower
{
    private String nama;
    private String color;
    private Integer num_of_petal;

    public Flower(){

    }
    public Flower(String nama, String color, Integer num_of_petal)
    {
        this.nama = nama;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setNumOfPetal(Integer num_of_petal)
    {
        this.num_of_petal = num_of_petal;
    }
    public String getNama()
    {
        return this.nama;
    }
    public String getColor()
    {
        return this.color;
    }
    public Integer getNumOfPetal()
    {
        return this.num_of_petal;
    }
    public void show_identity()
    {
        System.out.println("Saya bunga dengan detail, Jenis : " + this.getNama() + " color : " + this.getColor() + " num of petal : " + this.getNumOfPetal());
    }
}

class Car
{
    private String type;
    private String color;
    private Integer num_of_tire;

    public Car(){

    }
    public Car(String type, String color, Integer num_of_tire)
    {
        this.type = type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setNumOfTire(Integer num_of_tire)
    {
        this.num_of_tire = num_of_tire;
    }
    public String getType()
    {
        return this.type;
    }
    public String getColor()
    {
        return this.color;
    }
    public Integer getNumOfTire()
    {
        return this.num_of_tire;
    }
    public void show_identity()
    {
        System.out.println("Saya mobil dengan detail, Type : " + this.getType() + " color : " + this.getColor() + " num of tire : " + this.getNumOfTire());
    }
}

public class Challenge_1_Encapsulation
{
    public static void main(String[] arg)
    {
        Cat();
        Fish();
        Flower();
        Car();
    }
    public static void Cat()
    {
        Cat cat1 = new Cat();
        cat1.setFullColor("Hitam");
        cat1.setNumOfLeg(4);
        cat1.show_identity();

        Cat cat2 = new Cat();
        cat2.setFullColor("Putih");
        cat2.setNumOfLeg(3);
        cat2.show_identity();

        Cat cat3 = new Cat();
        cat3.setFullColor("Hitam Putih");
        cat3.setNumOfLeg(4);
        cat3.show_identity();

        Cat cat4 = new Cat();
        cat4.setFullColor("Poleng Poleng");
        cat4.setNumOfLeg(3);
        cat4.show_identity();

        Cat cat5 = new Cat();
        cat5.setFullColor("Bintik Bintik");
        cat5.setNumOfLeg(4);
        cat5.show_identity();
    }

    public static void Fish()
    {
        Fish Fish1 = new Fish();
        Fish1.setType("Paus");
        Fish1.setFeed("Plankton");
        Fish1.show_identity();

        Fish Fish2 = new Fish();
        Fish2.setType("Cupang");
        Fish2.setFeed("Cacing");
        Fish2.show_identity();

        Fish Fish3 = new Fish();
        Fish3.setType("Arwana");
        Fish3.setFeed("Jangkrik");
        Fish3.show_identity();

        Fish Fish4 = new Fish();
        Fish4.setType("Sapu Sapu");
        Fish4.setFeed("Pelet");
        Fish4.show_identity();
    }

    public static void Flower()
    {
        Flower Flower1 = new Flower();
        Flower1.setNama("Bangkai");
        Flower1.setColor("Merah");
        Flower1.setNumOfPetal(12);
        Flower1.show_identity();

        Flower Flower2 = new Flower();
        Flower1.setNama("Anggrek");
        Flower1.setColor("Putih");
        Flower1.setNumOfPetal(8);
        Flower2.show_identity();

        Flower Flower3 = new Flower();
        Flower3.setNama("Mawar");
        Flower3.setColor("Merah");
        Flower3.setNumOfPetal(3);
        Flower3.show_identity();

        Flower Flower4 = new Flower();
        Flower4.setNama("Melati");
        Flower4.setColor("Kuning");
        Flower4.setNumOfPetal(5);
        Flower4.show_identity();
    }

    public static void Car()
    {
        Car Car1 = new Car();
        Car1.setType("Sedan");
        Car1.setColor("Merah");
        Car1.setNumOfTire(4);
        Car1.show_identity();

        Car Car2 = new Car();
        Car2.setType("Truk");
        Car2.setColor("Hijau");
        Car2.setNumOfTire(6);
        Car2.show_identity();

        Car Car3 = new Car();
        Car3.setType("Tronton");
        Car3.setColor("Coklat");
        Car3.setNumOfTire(12);
        Car3.show_identity();

        Car Car4 = new Car();
        Car4.setType("Angkot");
        Car4.setColor("Kuning");
        Car4.setNumOfTire(4);
        Car4.show_identity();
    }
}
