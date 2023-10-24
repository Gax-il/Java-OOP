package org.gax.fighter.model;

public class Fighter {
    public String Name;
    public int BaseAtk; //Atk = attack
    public int BaseDef; //Def = defense
    public int BaseInt; //Int = intelligence

    public int CritChance;

    public Fighter(String name, int attack, int defense, int intelligence, int criticalChance) {
        Name = name;
        BaseAtk = attack;
        BaseDef = defense;
        BaseInt = intelligence;
        CritChance = criticalChance;
    }

    public int generateAttack(){
        int attack = BaseAtk;
        return attack;
    }

    public String getName() {
        return Name;
    }

    public int getBaseAtk() {
        return BaseAtk;
    }

    public int getBaseDef() {
        return BaseDef;
    }

    public int getBaseInt() {
        return BaseInt;
    }
}
