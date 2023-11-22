package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroAND extends Filtro{
    private Filtro filtro1, filtro2;

    public FiltroAND(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(Medicamento med) {
        return filtro1.cumple(med) &&
                filtro2.cumple(med);
    }
}
