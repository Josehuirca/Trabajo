public enum Isapre {
    CRUZBLANCA ("Cruz blanca"),
    COLMENA("Colmena"),
    CONSALUD("Consalud"),
    FONASA("Fonasa");
    private String isapre;
    private Isapre(String isapre){
        this.isapre = isapre;
    }
    public String getIsapre(){
        return isapre;
    }
}