package LS_04_ObjektOrientierung.Aufgabe_04;

public class Gold {
    double unze;

    public Gold(double unze) {
        this.unze = unze;
    }
    public Gold() {
        this.unze = 0.0;
    }

    public double getUnze() {
        return unze;
    }

    public void setUnze(double unze) {
        this.unze = unze;
    }

    public void grammInUnze(double gramm){
        unze = gramm/31.1034768;
    }
    public double bekommeGoldwert(double goldTagesPreis){
        return unze * goldTagesPreis;
    }
}
