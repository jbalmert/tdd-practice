package dnd.enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlignmentTest {

    @Test
    public void charactersCanBeGoodEvilOrNeutral() throws Exception {
        Alignment alignment =Alignment.GOOD;
        alignment = alignment.EVIl;
        alignment = alignment.NEUTRAL;
    }
}