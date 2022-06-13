public class Empresa {
    public void añadirTrabajador(){
        Trabajador trabajador =new Trabajador("Juan","Perez", "207872954","Cruz blanca","modelo");
        System.out.println("Trabajador");
        String datos ="Nombre: " +trabajador.getNombre()+" Apellido: "+trabajador.getApellido()+" Rut: "+trabajador.getRut()+ " Isapre: " +Isapre.CRUZBLANCA.getIsapre()+ " AFP: " +Afp.MODELO.getAfp();
        System.out.println(datos);
        System.out.println("-----------------");
    }
}
