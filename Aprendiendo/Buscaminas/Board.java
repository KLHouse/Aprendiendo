import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author BELSOFT
 */
public class Board {
    Feld[][] felds;
    
    int numZeilen;
    int numSpalten;
    int numMinen;
    
    int numOpenFelder;
    boolean gameOver;
    
    private Consumer<List<Feld>> setGameLost;
    private Consumer<List<Feld>> setGameWon;
    
    private Consumer<Feld> FeldOpen;
    

    public Board(int numZeilen, int numSpalten, int numMinen) {
        this.numZeilen = numZeilen;
        this.numSpalten = numSpalten;
        this.numMinen=numMinen;
        this.felderStarten();
    }
    
    public void felderStarten(){
        felds=new Feld[this.numZeilen][this.numSpalten];
        for (int i = 0; i < felds.length; i++) {
            for (int j = 0; j < felds[i].length; j++) {
                felds[i][j]=new Feld(i, j);
            }
        }
        minenGenerieren();
    }

    private void minenGenerieren(){
        int generierteMinen=0;
        while(generierteMinen!=numMinen){
            int posTmpZeile=(int)(Math.random()*felds.length);
            int posTmpColumna=(int)(Math.random()*felds[0].length);
            if (!felds[posTmpZeile][posTmpColumna].isMina()){
                felds[posTmpZeile][posTmpColumna].setMina(true);
                generierteMinen++;
            }
        }
        actualizarNumeroMinasAlrededor();
    }
    
    public void imprimirTablero() {
        for (int i = 0; i < felds.length; i++) {
            for (int j = 0; j < felds[i].length; j++) {
                System.out.print(felds[i][j].isMina()?"*":"0");
            }
            System.out.println("");
        }
    }

    private void imprimirPistas() {
        for (int i = 0; i < felds.length; i++) {
            for (int j = 0; j < felds[i].length; j++) {
                System.out.print(felds[i][j].getNumMinenAround());
            }
            System.out.println("");
        }
    }
    
    private void actualizarNumeroMinasAlrededor(){
        for (int i = 0; i < felds.length; i++) {
            for (int j = 0; j < felds[i].length; j++) {
                if (felds[i][j].isMina()){
                    List<Feld> felderAround=obtenerCasillasAlrededor(i, j);
                    felderAround.forEach((c)->c.increaseNumMinenAround());
                }
            }
        }
    }

	private List<Feld> obtenerCasillasAlrededor(int posZeile, int posSpalte){
        List<Feld> felderListe=new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            int tmpPosZeile=posZeile;
            int tmpPosSpalte=posSpalte;
            switch(i){
                case 0: tmpPosZeile--;break; //Arriba
                case 1: tmpPosZeile--;tmpPosSpalte++;break; //Arriba Derecha
                case 2: tmpPosSpalte++;break; //Derecha
                case 3: tmpPosSpalte++;tmpPosZeile++;break; //Derecha Abajo
                case 4: tmpPosZeile++;break; //Abajo
                case 5: tmpPosZeile++;tmpPosSpalte--;break; //Abajo Izquierda
                case 6: tmpPosSpalte--;break; //Izquierda
                case 7: tmpPosZeile--; tmpPosSpalte--;break; //Izquierda Arriba
            }
            
            if (tmpPosZeile>=0 && tmpPosZeile<this.felds.length
                    && tmpPosSpalte>=0 && tmpPosSpalte<this.felds[0].length){
                felderListe.add(this.felds[tmpPosZeile][tmpPosSpalte]);
            }
            
        }
        return felderListe;
    }
    
    List<Feld> getFelderMinen() {
        List<Feld> felderMitMinen = new LinkedList<>();
        for (int i = 0; i < felds.length; i++) {
            for (int j = 0; j < felds[i].length; j++) {
                if (felds[i][j].isMina()) {
                    felderMitMinen.add(felds[i][j]);
                }
            }
        }
        return felderMitMinen;
    }
    
    public void seleccionarCasilla(int posZeile, int posSpalte) {
        FeldOpen.accept(this.felds[posZeile][posSpalte]);
        if (this.felds[posZeile][posSpalte].isMina()) {
            setGameLost.accept(getFelderMinen());
        }else if (this.felds[posZeile][posSpalte].getNumMinenAround()==0){
        	feldOpenMarkieren(posZeile, posSpalte);
            List<Feld> casillasAlrededor=obtenerCasillasAlrededor(posZeile, posSpalte);
            for(Feld feld: casillasAlrededor){
                if (!feld.isOpen()){
                    seleccionarCasilla(feld.getposZeile(), feld.getposSpalte());
                }
            }
        }else{
        	feldOpenMarkieren(posZeile, posSpalte);
        }
        if (gameWon()){
           setGameWon.accept(getFelderMinen());
        }
    }
    
    void feldOpenMarkieren(int posZeile, int posSpalte){
        if (!this.felds[posZeile][posSpalte].isOpen()){
            numOpenFelder++;
            this.felds[posZeile][posSpalte].setOpen(true);
        }
    }
    
    boolean gameWon(){
        return numOpenFelder>=(numZeilen*numSpalten)-numMinen;
    }
    
    
    
    public static void main(String[] args) {
        Board board=new Board(5, 5, 5);
        board.imprimirTablero();
        System.out.println("---");
        board.imprimirPistas();
    }

    public void setGameLost(Consumer<List<Feld>> setGameLost) {
        this.setGameLost = setGameLost;
    }

    public void setFeldOpen(Consumer<Feld> FeldOpen) {
        this.FeldOpen = FeldOpen;
    }

    public void setGameWon(Consumer<List<Feld>> setGameWon) {
        this.setGameWon = setGameWon;
    }
    
    
}
