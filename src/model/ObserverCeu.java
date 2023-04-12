package model;

public class ObserverCeu implements Observer{
    public void atualizar(String mensagem){
        String saida = "OBS-CEU: ";
        if (mensagem.equalsIgnoreCase("eclipse lunar iniciou")) {
            saida = saida + "A eclipse lunar iniciou!";
        } else if (mensagem.equalsIgnoreCase("eclipse lunar terminou")) {
            saida = saida + "A eclipse lunar terminou.";
        } else {
            saida = saida + "Nada a revelar.";
        }
        System.out.println(saida);
    }
}
