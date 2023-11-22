package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroPorNombre extends Filtro{
    private String substring;

    public FiltroPorNombre(String substring) {
        this.substring = substring;
    }

    @Override
    public boolean cumple(Medicamento med) {
        return med.getNombre().toLowerCase().contains(substring.toLowerCase());
    }
}
