class Animals{
    protected String name;
    protected String type;
    protected String teeth;

    Animals()
    {

    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setTeeth(String teeth){
        this.teeth = teeth;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public String getTeeth(){
        return this.teeth;
    }
    public void IdentityMySelf()
    {
        System.out.println("Hi, Im parent of all Animals, My name is " + this.getName());
    }
}

class Herbivora extends Animals
{
    Herbivora()
    {
        super();
        super.setType("tumbuhan");
        super.setTeeth("tumpul");
    }

    @Override
    public void IdentityMySelf()
    {
        System.out.println("Hi, Im Herbivor, My name is " + this.getName() + ", My food is " + this.getType() + ", I have " + this.getTeeth() + " teeth.");
    }
}

class Carnivora extends Animals
{
    Carnivora()
    {
        super();
        super.setType("daging");
        super.setTeeth("tajam");
    }

    @Override
    public void IdentityMySelf()
    {
        System.out.println("Hi! Im Carnivor, My name is " + this.getName() + ", My food is " + this.getType() + ", I have " + this.getTeeth() + " teeth.");
    }
}

class Omnivora extends Animals{
    Omnivora()
    {
        super();
        super.setType("semua");
        super.setTeeth("tajam dan tumpul");
    }

    @Override
    public void IdentityMySelf(){
        System.out.println("Hi! Im Omnivor, My name is " + this.getName() + ", My food is " + this.getType() + ", I have " + this.getTeeth() + " teeth.");
    }
}

public class Challenge_4_Inheritance_Polymorpihsm_Animal
{
    public static void main(String[] args)
    {
        Animals();
        Herbivora();
        Carnivora();
        Omnivora();
    }
    public static void Animals()
    {
        Animals Animal = new Animals();
        Animal.setName("Binatang");
        Animal.IdentityMySelf();
    }
    public static void Herbivora()
    {
        Herbivora Herbivora = new Herbivora();
        Herbivora.setName("Kambing");
        Herbivora.IdentityMySelf();
    }
    public static void Carnivora()
    {
        Carnivora Carnivora = new Carnivora();
        Carnivora.setName("Singa");
        Carnivora.IdentityMySelf();
    }
    public static void Omnivora()
    {
        Omnivora Omnivora = new Omnivora();
        Omnivora.setName("Ayam");
        Omnivora.IdentityMySelf();
    }
}