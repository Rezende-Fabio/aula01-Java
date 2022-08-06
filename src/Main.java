public class Main {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Fabio", "Prog", 15.00000);
        Professor prof2= new Professor("Hellen", "Artes", 1.500);
        double nota = 9.5;

        System.out.println("NOTA: " + nota);
        System.out.println("Nome do Professor 1: " + prof1.getNome());
        System.out.println("Salário do Professor 1" + prof1.getSalario());

    }

}
