public class teste {
    public static void main(String[] args) {
        SensorXbox2 adaptee = new SensorXbox2();
        ControlePS5 target = new ControlePS5();

        //Cria-se um falso sensor de PS5 que, na verdade, traduz e repassa os comandos para o Xbox em questão:
        AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);

        //Conecta-se o controle ao adapter:
        target.Conectar(adapter);
    }
}