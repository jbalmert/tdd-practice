package dnd;

import builders.CharacterBuilder;
import dnd.enums.Alignment;

public class CharacterSheet {
    private String name;
    private Alignment alignment;

    public CharacterSheet(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }

}
