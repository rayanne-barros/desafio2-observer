package model;

public class ObserverTerra implements Observer{
    public void atualizar(String mensagem){
        String saida = "OBS-TERRA: ";
        if (mensagem.equalsIgnoreCase("Wally")) {
            saida = saida + "Encontramos o Wally!";
        } else {
            saida = saida + "Nada a revelar.";
        }
        System.out.println(saida);
    }
}
