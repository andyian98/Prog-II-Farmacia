package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroPorLaboratorio extends Filtro{
    private String labQueBusco;

    public FiltroPorLaboratorio(String labQueBusco) {
        this.labQueBusco = labQueBusco;
    }

    @Override
    public boolean cumple(Medicamento med) {

        return med.getLaboratorio().equalsIgnoreCase(labQueBusco);
    }
}
