package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroNOT extends Filtro{
    Filtro filtro1;

    public FiltroNOT(Filtro filtro1) {
        this.filtro1 = filtro1;
    }

    @Override
    public boolean cumple(Medicamento med) {
        return !filtro1.cumple(med);
    }
}
