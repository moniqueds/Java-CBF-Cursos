public class CursoJava1 {
  public static void main(String[] args) {

    // IF
    // IF...ELSE
    // ?
    // SWITCH
    // == igual > maior < menor >= maior ou igual <= menor ou igual
    // != diferente ! not negacao (true / false)

    int nota = 50;
    int faltas = 4;
    int maxFaltas = 5;
    int media = 60;

    // forma de fazer com string
    String res;

    res = (nota >= media ? "Aprovado" : "Reprovado");
    System.out.println("Resultado: " + res);

    // forma de fazer sem a string

    if ((nota >= media) && (faltas <= maxFaltas)) {
      System.out.println("Aprovado! =D ");
    } else if (nota >= 40) {
      System.out.println("Você está de recuperação! :( ");
    } else {
      System.out.println("Você está reprovado! :'( ");
    }
    System.out.println("Fim do Programa :)");

    // outra forma de fazer

    int pos = 5;

    switch (pos) {
      case 1:
        System.out.println("Primeiro Lugar.");
        break;
      case 2:
        System.out.println("Segundo Lugar.");

      case 3:
        System.out.println("Terceiro Lugar.");
        break;
      case 4:
      case 5:
      case 6:
        System.out.println("Prêmio de participação.");
        break;
      default:
        System.out.println("Não ganhou prêmio.");
        break;

    }
  }
}