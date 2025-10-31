package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Enemy;
import se.iths.fabian.adventuregame.model.characters.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    @DisplayName("attack() ska minska Enemy-objektets hälsa med spelarens strength")
    void testAttack() {
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        Enemy enemy = new Enemy("testEnemy", 100, 0, 0);

        player.attack(enemy);

        assertEquals(90, enemy.getHealth());
    }
}
