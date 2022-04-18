package model;


public class game {
    public int Pemain;
    public int Hantu;
    public int Live_pacman;
    public int lebar_layar;
    public int tinggi_layar;


    public game(){

    }
    public game(int Pmn, int Setan, int Pcm, int Lr, int Tl){
       this.Pemain = Pmn;
       this.Hantu = Setan;
       this.Live_pacman = Pcm;
       this.lebar_layar= Lr;
       this.tinggi_layar= Tl;

    }
    public int getPemain(){
        return this.Pemain;
    
    }
    public void setPemain(int Pemain){
        this.Pemain = Pemain;
    }
    public int getHantu(){
        return this.Hantu;
    
    }
    public void setHantu(int Hantu){
        this.Hantu = Hantu;
    }
    public int getLive_pacman(){
        return this.Live_pacman;
    
    }
    public void setLive_pacman(int Live_pacman){
        this.Live_pacman =Live_pacman;
    }
    public int getlebar_layar(){
        return this.lebar_layar;
    
    }
    public void setlebar_layar(int lebar_layar){
        this.lebar_layar =lebar_layar;
    }
}
