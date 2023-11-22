package farmacia.filtros;

import farmacia.Medicamento;

public abstract class Filtro {
    public abstract boolean cumple(Medicamento med);
}
