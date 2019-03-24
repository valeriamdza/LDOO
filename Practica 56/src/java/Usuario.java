public class Usuario {
    private String cnombre, ccorreo, ccontra, cnacimiento;

    public Usuario(String cnombre, String ccorreo, String ccontra, String cnacimiento) {
        this.cnombre = cnombre;
        this.ccorreo = ccorreo;
        this.ccontra = ccontra;
        this.cnacimiento = cnacimiento;

    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public String getCcorreo() {
        return ccorreo;
    }

    public void setCcorreo(String ccorreo) {
        this.ccorreo = ccorreo;
    }

    public String getCcontra() {
        return ccontra;
    }

    public void setCcontra(String ccontra) {
        this.ccontra = ccontra;
    }

    public String getCnacimiento() {
        return cnacimiento;
    }

    public void setCnacimiento(String cnacimiento) {
        this.cnacimiento = cnacimiento;
    }

    
    
}
