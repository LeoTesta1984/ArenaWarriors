/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warriors;

/**
 *
 * @author Casa
 */
public class Warrior {    
    private String name;
    private String type;
    private int attack;
    private int defense;
    private int attackDist;
    private int distance;
    private int life;
    
    private static String[][] names={
        {"Edgar","Tom","Kevin","Susan","Etna","Philip"},
        {"Krog","Kodor","Tork","Empa","Ika","Mork"}
    };

    private static int[] countNames={0, 0};
    
    public Warrior(String name, String type, int attack, int defense, int attackDist, int distance){
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.attackDist = attackDist;
        this.distance = distance;
        this.life = 4;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public int getAttackDist() {
        return attackDist;
    }

    public void setAttackDist(int attackDist) {
        this.attackDist = attackDist;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    public static String chooseName(int player){    
        
        String name="No name";
               
        name=names[player][countNames[player]];
        countNames[player]++;
 
        return name;
    }
    

    public static Warrior createWarrior(int player, String typeWarrior){
        
        Warrior warrior = null;
        
        switch(typeWarrior){
        
            case "swordman": 
                warrior = new Swordman(chooseName(player));
                break;
                
            case "archer": 
                warrior = new Archer(chooseName(player));
                break;

            case "dwarf": 
                warrior = new Dwarf(chooseName(player));
                break;

                
                
            case "orc": 
                warrior = new Orc(chooseName(player));
                break;

            case "goblin": 
                warrior = new Goblin(chooseName(player));
                break;
                
            case "barbarian": 
                warrior = new Barbarian(chooseName(player));
                break;
                
            default:
                break;            
        }
                
        return warrior;        
    }
    
} //END CLASS.
