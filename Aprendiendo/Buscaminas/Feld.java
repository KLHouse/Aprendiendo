/**
 *
 * @author BELSOFT
 */
public class Feld {
    private int posZeile;
    private int posSpalte;
    private boolean mina;
    private int numMinenAround;
    private boolean abierta;

    public Feld(int posZeile, int posSpalte) {
        this.posZeile = posZeile;
        this.posSpalte = posSpalte;
    }

    public int getposZeile() {
        return posZeile;
    }

    public void setposZeile(int posZeile) {
        this.posZeile = posZeile;
    }

    public int getposSpalte() {
        return posSpalte;
    }

    public void setposSpalte(int posSpalte) {
        this.posSpalte = posSpalte;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    public int getNumMinenAround() {
        return numMinenAround;
    }

    public void setNumMinenAround(int numMinasAlrededor) {
        this.numMinenAround = numMinasAlrededor;
    }
    
    public void increaseNumMinenAround(){
        this.numMinenAround++;
    }

    public boolean isOpen() {
        return abierta;
    }

    public void setOpen(boolean abierta) {
        this.abierta = abierta;
    }
    
    
}
