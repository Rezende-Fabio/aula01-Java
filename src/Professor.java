public class Professor {

    private String nome;
    private String area;
    private double salario;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, String area, double salario) {
        this.nome=nome;
        this.area=area;
        this.salario=salario;
    }
}
