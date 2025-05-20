import org.lessons.java.abstractAnimals.Aquila;
import org.lessons.java.abstractAnimals.Cane;
import org.lessons.java.abstractAnimals.Delfino;
import org.lessons.java.abstractAnimals.INuotante;
import org.lessons.java.abstractAnimals.IVolante;
import org.lessons.java.abstractAnimals.Passerotto;

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

        faiNuotare(delfino);
        faiVolare(passerotto);
        faiVolare(aquila);

    }

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
}
