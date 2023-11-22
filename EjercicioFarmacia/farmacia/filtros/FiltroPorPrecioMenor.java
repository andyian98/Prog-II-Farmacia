package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroPorPrecioMenor extends Filtro{
    private double precioMax;

    public FiltroPorPrecioMenor(double precioMax) {
        this.precioMax = precioMax;
    }


    @Override
    public boolean cumple(Medicamento med) {
        return med.getPrecio() <= precioMax;
    }
}
