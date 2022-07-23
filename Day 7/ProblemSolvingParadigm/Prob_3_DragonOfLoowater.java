import java.util.*;

class DragonofLoowater
{
    private String status;

    public DragonofLoowater()
    {

    }

    public void setStatus(String Status)
    {
        this.status = Status;
    }

    public String getStatus()
    {
        return this.status;
    }
}

class Dragon extends DragonofLoowater
{
    private ArrayList<Integer> ListDragon;

    Dragon()
    {

    }

    public void setDragonDiameter(ArrayList<Integer> ListDragon){
        this.ListDragon = ListDragon;
    }

    public ArrayList<Integer> getDragonLength()
    {
        return this.ListDragon;
    }
}

class Knight extends DragonofLoowater
{
    private ArrayList<Integer> knHeight;

    Knight()
    {

    }

    public void setKnightHeight(ArrayList<Integer> height){
        this.knHeight = height;
    }

    public ArrayList<Integer> getKnightHeight(){
        return this.knHeight;
    }
}


public class Prob_3_DragonOfLoowater
{
    public static void main(String[] args)
    {
        Result();
    }

    public static void Result()
    {
        Dragon enemy = new Dragon();
        ArrayList<Integer> listDragon = new ArrayList<Integer>();
        listDragon.add(5);
        listDragon.add(4);
        enemy.setDragonDiameter(listDragon);

        Knight heroes = new Knight();
        ArrayList<Integer> listKnight = new ArrayList<Integer>();
        listKnight.add(7);
        listKnight.add(8);
        listKnight.add(4);
        heroes.setKnightHeight(listKnight);

        ArrayList<Integer> potentialHeroes = new ArrayList<Integer>();
        Integer minimumKnightHP = 0;

        for(Integer i = 0; i < enemy.getDragonLength().size(); i++)
        {
            for(Integer j = 0; j < heroes.getKnightHeight().size(); j++)
            {
                if(heroes.getKnightHeight().get(j) >= enemy.getDragonLength().get(i))
                {
                    potentialHeroes.add(heroes.getKnightHeight().get(j));
                }
            }

            Collections.sort(potentialHeroes);
            potentialHeroes.subList(1, potentialHeroes.size()).clear();
            ArrayList<Integer> tempKnight = heroes.getKnightHeight();
            tempKnight.remove(potentialHeroes.get(0));
            heroes.setKnightHeight(tempKnight);
            minimumKnightHP += potentialHeroes.get(0);
        }

        System.out.println("Output : " + minimumKnightHP);

    }
}