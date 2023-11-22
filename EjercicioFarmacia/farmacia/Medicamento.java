package farmacia;

import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private double precio;
    private String laboratorio;

    private ArrayList<String> drogas;

    public Medicamento(String nombre, double precio, String laboratorio) {
        this.nombre = nombre;
        this.precio = precio;
        this.laboratorio = laboratorio;
        this.drogas = new ArrayList<>();
    }

    public void addDroga(String droga){
        this.drogas.add(droga);
    }

    public ArrayList<String> getDrogas() {
        return new ArrayList<>(drogas);
    }

    public boolean contieneDroga(String droga){
        return this.drogas.contains(droga);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    @Override
    public String toString(){
        return this.getNombre()+" de "+this.getLaboratorio()+
                " ($"+this.getPrecio()+")";
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Medicamento otro = (Medicamento) obj;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getLaboratorio().equals(otro.getLaboratorio());
        } catch (Exception e){
            return false;
        }
    }
}
