public class Usuario{
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        smartTv.ligarTv();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume aumentado para: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume abaixado para: " + smartTv.volume);

        System.out.println("O canal está no: " + smartTv.canal);
        smartTv.proxCanal();
        System.out.println("Canal alterado para: " + smartTv.canal);
        smartTv.antCanal();
        System.out.println("Canal alterado para: " + smartTv.canal);

        smartTv.alterCanal(11);
        System.out.println("Canal alterado para: " + smartTv.canal);

    }
}