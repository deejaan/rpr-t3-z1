package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }


    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA,
        MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO, MRKONJICGRAD,
        BANJALUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE,
        FOCA, TREBINJE
    }
    private Grad grad;
    private String broj;
    private String pozivni[] = {"030", "031", "032", "033", "034", "035", "036", "037",
            "038", "039", "049", "050", "051", "052", "053", "054", "055", "056", "057", "058", "059"};

    @Override
    public String ispisi() {
        return pozivni[grad.ordinal()] + "/" + broj;
    }
    @Override
    public int hashCode() {
        return (Integer.parseInt(broj) + 5) * 7;
    }
}