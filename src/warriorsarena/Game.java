/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warriorsarena;

import warriors.Warrior;

/**
 *
 * @author Casa
 */
public class Game {
    public static Warrior warriors[][] = new Warrior[2][6];    
    public static int countWarriors[] =  {0, 0};        
    public static int turn = 0;
    public static int CURRENT_PLAYER;
    
    public static String positions[][] = new String[6][6];

    public Game() {
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                positions[i][j]="empty";
            }
        }
    }

    public static Warrior[][] getWarriors() {
        return warriors;
    }

    public static void setWarriors(Warrior[][] warriors) {
        Game.warriors = warriors;
    }
    
    public static Warrior getWarrior(int player, int creatureNumber) {
        return warriors[player-1][creatureNumber];
    }

    public static void setWarrior(int player, int creatureNumber, Warrior warrior) {
        Game.warriors[player-1][creatureNumber] = warrior;
    }
    
    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String[][] getPositions() {
        return positions;
    }

    public void setPositions(String[][] positions) {
        this.positions = positions;
    }
    
    public static Warrior addWarrior(int player, String warriorType){

        Warrior warrior = Warrior.createWarrior(player, warriorType);
        
        warriors[player][countWarriors[player]] = warrior;        
        countWarriors[player]++;
        
        return warrior;
    }
    
    public void moveWarrior(int coordIni[][], int coordFin[][]){
        
    }
}
