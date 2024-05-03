package week04.w04_1;

class OurClass {
    private final Boolean just = true;

    // 신규 문법 throws!
    public void thisMethodIsDangerous() throws OurBadException {
        if (just) {
            // 신규 문법 throw!
            throw new OurBadException();
        }
    }
}
