import org.lessons.java.Aquila;
import org.lessons.java.Cane;
import org.lessons.java.Delfino;
import org.lessons.java.Passerotto;

public class App {
    public static void main(String[] args) throws Exception {
        Aquila aquila = new Aquila();
        aquila.verso();
        aquila.mangia();
        aquila.dormi();

        Cane cane = new Cane();
        cane.verso();
        cane.mangia();
        cane.dormi();

        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();

        Delfino delfino = new Delfino();
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
    }
}
