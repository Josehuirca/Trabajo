public class Trabajador extends  Persona{

    private String isapre, afp;
    public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.afp = afp;
    }

    public String getIsapre() {
        return isapre;
    }

    public String getFonasa() {
        return afp;
    }
}
