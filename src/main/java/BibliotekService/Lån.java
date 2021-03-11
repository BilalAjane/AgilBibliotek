package BibliotekService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lån {

    private ArrayList<Bog> bøger;
    private ArrayList<Medie> medier;
    private LocalDate låneDato;
    private LocalDate afleveringsFrist;

    public Lån(LocalDate låneDato, LocalDate afleveringsFrist) {
        this.låneDato = låneDato;
        this.afleveringsFrist = afleveringsFrist;
        this.medier = new ArrayList<Medie>();
        this.bøger = new ArrayList<Bog>();
    }


    public void tilføjBog(Bog bog){
        bøger.add(bog);
    }

    public void tilføjMedie(Medie medie){
        bøger.add(medie);
    }

    public ArrayList<Bog> getBøger() {
        return bøger;
    }

    public void setBøger(ArrayList<Bog> bøger) {
        this.bøger = bøger;
    }

    public ArrayList<Medie> getMedier() {
        return medier;
    }

    public void setMedier(ArrayList<Medie> medier) {
        this.medier = medier;
    }

    public LocalDate getLåneDato() {
        return låneDato;
    }

    public void setLåneDato(LocalDate låneDato) {
        this.låneDato = låneDato;
    }

    public LocalDate getAfleveringsFrist() {
        return afleveringsFrist;
    }

    public void setAfleveringsFrist(LocalDate afleveringsFrist) {
        this.afleveringsFrist = afleveringsFrist;
    }
}
