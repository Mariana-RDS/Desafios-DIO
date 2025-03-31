public class SmartTv{
    public boolean ligada = false;
    public int canal = 2;
    public int volume = 12;

    public void ligarTv(){
       ligada=true;
    }
    public void desligarTv(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void proxCanal(){
        canal++;
    }
    public void antCanal(){
        canal--;
    }

    public void alterCanal(int novoCanal){
        canal = novoCanal;
    }

}