package farmacia;

import farmacia.filtros.Filtro;

import java.util.ArrayList;

public class Farmacia {
    private String nombre;
    private ArrayList<Medicamento> medicamentos;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        this.medicamentos = new ArrayList<>();
    }

    public boolean tieneMedicamento(Medicamento med){
        return this.medicamentos.contains(med);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        /*ArrayList<Medicamento> copia = new ArrayList<>();
        for (Medicamento m:medicamentos)
            copia.add(m);*/
        return new ArrayList<>(medicamentos);
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        //mi atributo referencia a una lista externa
        //Viola encapsulamiento, otro tiene control sobre la lista
        this.medicamentos = medicamentos;

        //No viola encapsulamiento, pero pierdo la lista anterior
        this.medicamentos = new ArrayList<>(medicamentos);

        //agrega a la lista actual los que me llegan por parámetro
        //(podrian quedar repetidos)
        this.medicamentos.addAll(medicamentos);
    }

    public void agregarMedicamento(Medicamento med){
        this.medicamentos.add(med);
    }

    /*public ArrayList<Medicamento> buscarPorLaboratorio(String laboratorio){
        ArrayList<Medicamento> resultado = new ArrayList<>();
        for (Medicamento med:medicamentos){
            if (med.getLaboratorio().equalsIgnoreCase(laboratorio))
                resultado.add(med);
        }
        return resultado;
    }

    public ArrayList<Medicamento> buscarPorNombre(String substring){
        ArrayList<Medicamento> resultado = new ArrayList<>();
        for (Medicamento med:medicamentos){
            if (med.getNombre().toLowerCase().contains(substring.toLowerCase()))
                resultado.add(med);
        }
        return resultado;
    }

    public ArrayList<Medicamento> buscarPorPrecio(double precioMax){
        ArrayList<Medicamento> resultado = new ArrayList<>();
        for (Medicamento med:medicamentos){
            if (med.getPrecio() <= precioMax)
                resultado.add(med);
        }
        return resultado;
    }*/

    public ArrayList<Medicamento> buscar(Filtro filtro){
        ArrayList<Medicamento> resultado = new ArrayList<>();
        for (Medicamento med:medicamentos){
            if ( filtro.cumple(med) )
                resultado.add(med);
        }
        return resultado;
    }
}
