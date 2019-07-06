package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    private String ime;
    private TelefonskiBroj broj;
    private HashMap<TelefonskiBroj, String> mapa = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        mapa.putIfAbsent(broj, ime);
    }

    String dajBroj(String ime) {
        return  broj.ispisi();
    }

    String dajIme(TelefonskiBroj broj) {
        return mapa.get(broj);
    }

    String naSlovo(char s) {
        StringBuilder all = new StringBuilder();
        int i = 1;
        for(Map.Entry<TelefonskiBroj, String> element : mapa.entrySet()) {
            if(element.getValue().equals(s)) {
                all.append(i + ". " + ime + " - " + broj.ispisi() + "\n");
                i++;
            }
        }
        return String.valueOf(all);
    }

    Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> set = new TreeSet<>();
        String pozivni[] = {"030", "031", "032", "033", "034", "035", "036", "037",
                "038", "039", "049", "050", "051", "052", "053", "054", "055", "056", "057", "058", "059"};
        String pozivniTemp = pozivni[g.ordinal()];
        for(Map.Entry<TelefonskiBroj, String> element : mapa.entrySet()) {
            if(element.getKey().ispisi().substring(0,2).equals(pozivniTemp)) {
                set.add(element.getValue());
            }
        }
        return set;
    }


    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> set = new TreeSet<>();
        String pozivni[] = {"030", "031", "032", "033", "034", "035", "036", "037",
                "038", "039", "049", "050", "051", "052", "053", "054", "055", "056", "057", "058", "059"};
        String pozivniTemp = pozivni[g.ordinal()];
        for(Map.Entry<TelefonskiBroj, String> element : mapa.entrySet()) {
            for(Map.Entry<TelefonskiBroj, String> elementt : mapa.entrySet()) {
                if(elementt.getKey().ispisi().substring(0,2).equals(pozivniTemp)) {

                }
            }
        }
        return set;

    }

}