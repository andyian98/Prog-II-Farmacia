import farmacia.*;
import farmacia.filtros.*;
import netscape.javascript.JSObject;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Farmacia peralta = new Farmacia("Peralta");

        Medicamento paracetamol = new Medicamento("Tafirol", 1000, "Bayer");
        Medicamento aspirina = new Medicamento("Bayaspirina", 100, "Bayer");
        Medicamento ibuflex = new Medicamento("IbuFlex", 2000, "Otro laboratorio");
        Medicamento magnesio = new Medicamento("Total Magnesiano", 3000, "RGM");
        Medicamento efedrina = new Medicamento("Efedrina", 4000, "RGM");

        peralta.agregarMedicamento(paracetamol);
        peralta.agregarMedicamento(aspirina);
        peralta.agregarMedicamento(ibuflex);
        peralta.agregarMedicamento(magnesio);
        peralta.agregarMedicamento(efedrina);
        System.out.println("\nMedicamentos de laboratorio RGM");
        System.out.println(peralta.buscar(new FiltroPorLaboratorio("rgm")));
        //System.out.println(peralta.buscarPorLaboratorio("rgm"));

        System.out.println("\nMedicamentos que contienen INA en su nombre");
        //System.out.println(peralta.buscarPorNombre("INA"));
        System.out.println(peralta.buscar(new FiltroPorNombre("INA")));

        System.out.println("\nMedicamentos baratos");
        //System.out.println(peralta.buscarPorPrecio(1500.0));
        System.out.println(peralta.buscar(new FiltroPorPrecioMenor(1500.0)));

        Filtro contieneIna = new FiltroPorNombre("ina");
        Filtro bayer = new FiltroPorLaboratorio("Bayer");
        Filtro precioMenor1500 = new FiltroPorPrecioMenor(1500);

        System.out.println(peralta.buscar(
                new FiltroAND(contieneIna,
                        new FiltroAND(new FiltroNOT(bayer), new FiltroNOT(precioMenor1500)))));
    }
}