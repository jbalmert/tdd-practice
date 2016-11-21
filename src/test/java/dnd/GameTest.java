package dnd;

import dnd.enums.Alignment;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class GameTest {

    private Game game = new Game();

    @Test
    public void canCreateCharacter() throws Exception {
        CharacterSheet characterSheet = game.createCharacter()
                                            .withName("Shammamigans")
                                            .withAlignment(Alignment.GOOD)
                                            .build();

        assertNotNull(characterSheet);
    }
}
