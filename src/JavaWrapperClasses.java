public class JavaWrapperClasses {
    public static void main(String[] args) {
        // Declaration
        short aUnboxed = 2;
        int bUnboxed = 2;
        long cUnboxed = 2L;
        float dUnboxed = 2F;
        double eUnboxed = 2D;
        char fUnboxed = 'a';
        byte gUnboxed = 2;
        boolean hUnboxed = true;

        // Autoboxing 1
        Short aAutoboxed = aUnboxed;
        Integer bAutoboxed = bUnboxed;
        Long cAutoboxed = cUnboxed;
        Float dAutoboxed = dUnboxed;
        Double eAutoboxed = eUnboxed;
        Character fAutoboxed = fUnboxed;
        Byte gAutoboxed = gUnboxed;
        Boolean hAutoboxed = hUnboxed;

        // Autoboxing 2
        aAutoboxed = Short.valueOf(aUnboxed);
        bAutoboxed = Integer.valueOf(bUnboxed);
        cAutoboxed = Long.valueOf(cUnboxed);
        dAutoboxed = Float.valueOf(dUnboxed);
        eAutoboxed = Double.valueOf(eUnboxed);
        fAutoboxed = Character.valueOf(fUnboxed);
        gAutoboxed = Byte.valueOf(gUnboxed);
        hAutoboxed = Boolean.valueOf(hUnboxed);

        // Unboxing 1
        aUnboxed = aAutoboxed;
        bUnboxed = bAutoboxed;
        cUnboxed = cAutoboxed;
        dUnboxed = dAutoboxed;
        eUnboxed = eAutoboxed;
        fUnboxed = fAutoboxed;
        gUnboxed = gAutoboxed;
        hUnboxed = hAutoboxed;

        // Unboxing 2
        aUnboxed = aAutoboxed.shortValue();
        bUnboxed = bAutoboxed.intValue();
        cUnboxed = cAutoboxed.longValue();
        dUnboxed = dAutoboxed.floatValue();
        eUnboxed = eAutoboxed.doubleValue();
        fUnboxed = fAutoboxed.charValue();
        gUnboxed = gAutoboxed.byteValue();
        hUnboxed = hAutoboxed.booleanValue();
    }
}
