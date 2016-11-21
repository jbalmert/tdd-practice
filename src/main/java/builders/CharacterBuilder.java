package builders;

import dnd.CharacterSheet;
import dnd.enums.Alignment;

public class CharacterBuilder {
    private String name;
    private Alignment alignment;

    public CharacterSheet build() {
        return new CharacterSheet(name, alignment);
    }

    public CharacterBuilder withAlignment(Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public CharacterBuilder withName(String name) {
        this.name = name;
        return this;
    }
}
