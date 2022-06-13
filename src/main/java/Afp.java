public enum Afp {
    MODELO("Modelo"),
    PlanVital("Plan Vital"),
    Provida("Provida"),
    CUPRUM("Cuprum");
    private String afp;

    private Afp(String afp) {
        this.afp = afp;
    }

    public String getAfp() {
        return afp;
    }
}
