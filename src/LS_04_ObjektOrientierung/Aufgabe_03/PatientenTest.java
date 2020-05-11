package LS_04_ObjektOrientierung.Aufgabe_03;

public class PatientenTest {
    public static void main(String[] args) {
        Patient tmp = new Patient("Test_01",80.0,1.8, Patient.Geschlecht.Mann);
        System.out.println(tmp.fkt_BMI_Berechnen());
        System.out.println(tmp.fkt_IdealBerechnen());
        System.out.println(tmp.fkt_IdealBorca());
        System.out.println(tmp.fkt_ZustandBestimmen(tmp.fkt_BMI_Berechnen()));
    }
}
