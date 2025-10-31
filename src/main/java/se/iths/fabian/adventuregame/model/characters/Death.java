package se.iths.fabian.adventuregame.model.characters;

public class Death extends AbstractCharacter{
    public Death(String name, int health, int score, int strength) {
        super(name, health, score, strength);
    }

    @Override
    public void attack(AbstractCharacter target) {

    }
}
