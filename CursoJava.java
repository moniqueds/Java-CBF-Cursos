public class CursoJava {
  public static void main(String[] args) {

    int n1 = 10, n2 = 20, n3 = 30;
    int res = n1 + n2 + n3;
    String nome = "Bruno";

    System.out.print("CFB Cursos\n"); // \n quebra linha
    System.out.println("Curso de Java"); // println quebra linha no final da linha
    System.out.printf("%s - %d", "CBF Cursos", 2021); // printf imprime com formatação,
    // s string d inteiro e f float.
    System.out.printf("%nCanal: %s%nAno: %d", "CBF Cursos", 2021);
    System.out.printf("%nValor da variavel res:%d%nNome:%s", res, nome);
  }
}
