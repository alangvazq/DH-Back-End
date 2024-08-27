package modelo;

public class Nacimiento {
    Long id;
    Integer dia;
    Integer mes;
    Integer Anio;

    public Nacimiento(Long id, Integer dia, Integer mes, Integer anio) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        Anio = anio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return Anio;
    }

    public void setAnio(Integer anio) {
        Anio = anio;
    }
}
