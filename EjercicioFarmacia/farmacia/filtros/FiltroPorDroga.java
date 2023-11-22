package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroPorDroga extends Filtro{
    String droga;

    public FiltroPorDroga(String droga) {
        this.droga = droga;
    }

    @Override
    public boolean cumple(Medicamento med) {
        return med.contieneDroga(droga);
    }
}
