public class ReturnStatementsAdvanced {
  public static void main(String[] args) {
    String englishExplanation = explainArea("English");
    String frenchExplanation = explainArea("French");
    String spanishExplanation = explainArea("Spanish");
    String germanExplanation = explainArea("German");

    System.out.println(englishExplanation); // Area equals length * width
    System.out.println(frenchExplanation); // La surface est egale a la longueur * la largeur
    System.out.println(spanishExplanation); // area es igual a largo * ancho
    System.out.println(germanExplanation); // Language not supported
  }

  // `String` -> return type
  public static String explainArea(String language) {
    switch (language) {
      case "English":
        return "Area equals length * width";
      case "French":
        return "La surface est egale a la longueur * la largeur";
      case "Spanish":
        return "area es igual a largo * ancho";

      // must needed otherwise, it will return `null` and cause an error
      default:
        return "Language not supported";
    }
  }

  // ! Here we didn't need any `break` statements because the `return` statement
  // ! breaks the flow of execution
}
