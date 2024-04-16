import java.util.ArrayList;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 68.9, 1.75, 11, 1, 2);
        l[1] = new Lutador("Putscript", "Brasil", 29, 57.8, 1.68, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 80.9, 1.65, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 81.6, 1.93, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 119.3, 1.70, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 105.7, 1.81, 12, 2, 4);

        System.out.println("------------------------------------------------------------------");
        System.out.println("### APRESENTAMOS NOSSOS LUTADORES ###");
        for (Lutador lutador : l) {
            lutador.status();
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("### PRÓXIMAS LUTAS DO TORNEIO ###");
        var listaLutas = new ArrayList<Luta>();

        var UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        listaLutas.add(UEC01);

        var UEC02 = new Luta();
        UEC02.marcarLuta(l[2], l[3]);
        listaLutas.add(UEC02);

        var UEC03 = new Luta();
        UEC03.marcarLuta(l[4], l[5]);
        listaLutas.add(UEC03);

        var UEC04 = new Luta();
        UEC04.marcarLuta(l[1], l[4]);
        listaLutas.add(UEC04);

        for (Luta luta: listaLutas) {
            luta.lutar(listaLutas.indexOf(luta)+1);
        }
    }
}
