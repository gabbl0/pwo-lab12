package pwo.seq;

public class SeqTypeTest {
    @Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult = { SeqType.FIB, SeqType.LUC, SeqType.TRI };
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testFromString() {
        System.out.println("fromString");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

}
