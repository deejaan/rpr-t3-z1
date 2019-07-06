package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private Integer mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + Integer.toString(mobilnaMreza) + "/" + broj;
    }

    @Override
    public int hashCode() {
        return (Integer.parseInt(broj) + 5) * 7;
    }
}
