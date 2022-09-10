public enum WordsRu {
    ПРИВЕТ("HELLO","SALOM"),
    ПОКА("BYE","XAYR"),
    ОТЕЦ("FATHER","OTA"),
    МАM("MATHER","ONA"),
    БРАТ("BROTHER","AKA"),
    СЕСТРА("SISTER","OPA"),
    ШКОЛА("SCHOOL","MAKTAB"),
    КНИГА("BOOK","KITOB"),
    НОУТБУК("NOTEBOOK","DAFTAR");


    String en;
    String uz;

    WordsRu(String en, String uz) {
        this.en = en;
        this.uz = uz;
    }

    public String getEn() {
        return en;
    }

    public String getRu() {
        return uz;
    }



}
