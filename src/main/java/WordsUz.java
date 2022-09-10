public enum WordsUz {
    SALOM("HELLO","ПРИВЕТ"),
    XAYR("BYE","ПОКА"),
    OTA("FATHER","ОТЕЦ"),
    ONA("MATHER","МАM"),
    AKA("BROTHER","БРАТ"),
    OPA("SISTER","СЕСТРА"),
    MAKTAB("SCHOOL","ШКОЛА"),
    KITOB("BOOK","КНИГА"),
    DAFTAR("NOTEBOOK","НОУТБУК");


    final String en;
    final String ru;


    WordsUz(String en, String ru) {
        this.en = en;
        this.ru = ru;
    }

    public String getEn() {
        return en;
    }

    public String getRu() {
        return ru;
    }

}
