class Vehicle{
    protected String name;
    protected Boolean with_engine;

    Vehicle()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setWithEngine(Boolean with_engine)
    {
        this.with_engine = with_engine;
    }
    public String getName()
    {
        return this.name;
    }
    public Boolean getWithEngine()
    {
        return this.with_engine;
    }
    public void IdentityMySelf()
    {
        System.out.print("Hi I am Parent of All Vehicles, " + "My name is " + this.getName());
        Boolean isEngine = this.getWithEngine();
        if(isEngine)
        {
            System.out.println(", My engine status is \'with engine\'");
        }
        else
        {
            System.out.println(", My engine status is \'no engine\'");
        }
    }
}

class Bikes extends Vehicle
{
    private Integer wheel_count;

    Bikes()
    {
        super();
    }
    public void setWheelCount(Integer wheel_count)
    {
        this.wheel_count = wheel_count;
    }
    public Integer getWheelCount()
    {
        return this.wheel_count;
    }

    @Override
    public void IdentityMySelf()
    {
        System.out.print("Hi, I am Bike, " + "My name is " + super.getName());
        Boolean isEngine = super.getWithEngine();
        if(isEngine)
        {
            System.out.print(", My engine status is \'with engine\'");
        }
        else
        {
            System.out.print(", M>y engine status is \'no engine\'");
        }
        System.out.println(", I have " + this.getWheelCount() + " wheel(s)");
    }
}

class Car extends Vehicle
{
    private Integer wheel_count;
    private String engine_type;

    Car()
    {
        super();
    }
    public void setWheelCount(Integer wheel_count)
    {
        this.wheel_count = wheel_count;
    }
    public void setEngineType(String engine_type)
    {
        this.engine_type = engine_type;
    }
    public Integer getWheelCount()
    {
        return this.wheel_count;
    }
    public String getEngineType()
    {
        return this.engine_type;
    }

    @Override
    public void IdentityMySelf()
    {
        System.out.print("Hi, I am Cars, " + "My name is " + super.getName());
        Boolean isEngine = super.getWithEngine();
        if(isEngine)
        {
            System.out.print(", My engine status is \'with engine\'");
        }
        else
        {
            System.out.print(", M>y engine status is \'no engine\'");
        }
        System.out.println(", I have " + this.getWheelCount() + " wheel(s)" + ", My engine type = " + this.getEngineType());
    }
}

class Buses extends Vehicle
{
    private Integer wheel_count;
    private Boolean flag_private_bus;

    Buses()
    {
        super();
    }
    public void setWheelCount(Integer wheel_count)
    {
        this.wheel_count = wheel_count;
    }
    public void setFlagPrivateBus(Boolean flag_private_bus)
    {
        this.flag_private_bus = flag_private_bus;
    }
    public Integer getWheelCount()
    {
        return this.wheel_count;
    }
    public Boolean getFlagPrivateBus()
    {
        return this.flag_private_bus;
    }

    @Override
    public void IdentityMySelf()
    {
        Boolean isType = this.getFlagPrivateBus();
        if(isType)
        {
            System.out.print("Hi, I am Bus {Private Bus}, ");
        }
        else
        {
            System.out.print("Hi, I am Bus {Public Bus}, ");
        }
        System.out.print("My name is " + super.getName());
        Boolean isEngine = super.getWithEngine();
        if(isEngine)
        {
            System.out.print(", my engine status is \'with engine\'");
        }
        else
        {
            System.out.print(", my engine status is \'no engine\'");
        }
        System.out.println(", I have " + this.getWheelCount() + " wheel(s)");
    }
}

public class Challenge_3_Inheritance_Polymorpishm_Vehicle
{
    public static void main(String[] args)
    {
        Vehicle vhc = new Vehicle();
        vhc.setName("Gerobak");
        vhc.setWithEngine(false);
        vhc.IdentityMySelf();

        Bikes();
        Cars();
        Buses();
    }
    public static void Bikes()
    {
        Bikes bikes1 = new Bikes();
        bikes1.setName("Pedal Bikes");
        bikes1.setWheelCount(2);
        bikes1.setWithEngine(false);
        bikes1.IdentityMySelf();

        Bikes bikes2 = new Bikes();
        bikes2.setName("Motor Bikes");
        bikes2.setWheelCount(2);
        bikes2.setWithEngine(true);
        bikes2.IdentityMySelf();
    }
    public static void Cars()
    {
        Car car1 = new Car();
        car1.setName("Sport Car");
        car1.setWheelCount(4);
        car1.setWithEngine(true);
        car1.setEngineType("V8");
        car1.IdentityMySelf();

        Car car2 = new Car();
        car2.setName("Pickup Car");
        car2.setWheelCount(4);
        car2.setWithEngine(true);
        car2.setEngineType("Solar");
        car2.IdentityMySelf();
    }
    public static void Buses()
    {
        Buses buses1 = new Buses();
        buses1.setName("Trans Jakarta");
        buses1.setFlagPrivateBus(false);
        buses1.setWheelCount(4);
        buses1.setWithEngine(true);
        buses1.IdentityMySelf();

        Buses buses2 = new Buses();
        buses2.setName("School Bus");
        buses2.setFlagPrivateBus(true);
        buses2.setWheelCount(4);
        buses2.setWithEngine(true);
        buses2.IdentityMySelf();
    }
}