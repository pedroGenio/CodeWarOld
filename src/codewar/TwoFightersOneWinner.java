package codewar;

import domain.Fighter;

/**
 *
 * @author Pedro Elias
 */
public class TwoFightersOneWinner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        int health1 = fighter1.health;
        int health2 = fighter2.health;
        Fighter first = (fighter1.name.equals(firstAttacker) ? fighter1 : fighter2);
        Fighter second = (!fighter1.name.equals(firstAttacker) ? fighter1 : fighter2);
        String live = "";
        while (first.health > 0 && second.health > 0) {
            second.health = (second.health - first.damagePerAttack);
            System.out.println(first.name + " attacks " + second.name + "; " + second.name + " now has " + second.health + " health " + ((second.health <= 0) ? "and is dead. " + first.name + " wins" : "."));
            if (second.health <= 0) {
                live = first.name;
                break;
            }
            first.health = first.health - second.damagePerAttack;
            System.out.println(second.name + " attacks " + first.name + "; " + first.name + " now has " + first.health + " health " + ((first.health <= 0) ? "and is dead. " + second.name + " wins" : "."));
            if (first.health <= 0) {
                live = second.name;
                break;
            }
        }

        return live;
    }

}
