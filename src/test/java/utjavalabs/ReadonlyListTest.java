package utjavalabs;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadonlyListTest {
    @Test
    public void length_emptyList_is0() {
        //given
        var sut = ReadonlyList.empty();
        //when
        var real = sut.length();
        //then
        assertEquals(0, real);
    }
    @Test
    public void length_emptyList_is1(){
        //given
        ReadonlyList sut = ReadonlyList.empty().add(488);
        //when
        var added = sut.length();
        //then
        assertEquals(1, added);
    }
    @Test
    public void givenNmrInReadonlyListwhenContainsNmrthenTrue(){
        //given
        int nmr = 375;
        ReadonlyList sut = ReadonlyList.empty().add(nmr);
        //when
        var zitErin = sut.contains(nmr);
        //then
        assertEquals(TRUE, zitErin);
    }
}
