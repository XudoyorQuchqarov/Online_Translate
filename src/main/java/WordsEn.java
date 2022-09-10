public enum WordsEn {
   HELLO("ПРИВЕТ","SALOM"),
    BYE("ПОКА","XAYR"),
    FATHER("ОТЕЦ","OTA"),
    MOTHER("MAM","ONA"),
    BROTHER("БРАТ","AKA"),
    SISTER("СЕСТРА","OPA"),
    SCHOOL("ШКОЛА","MAKTAB"),
    BOOK("КНИГА","KITOB"),
    NOTEBOOK("НОУТБУК","KITOB");

   String ru;
   String uz;

    WordsEn(String ru, String uz) {
        this.ru = ru;
        this.uz = uz;
    }

    public String getRu() {
        return ru;
    }

    public String getEn() {
        return uz;
    }

}
