import java.util.Scanner;

public class WorkbookD {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Ask user for input
    System.out.print("\nWhich animal would you like to draw?\n");
    System.out.println("Write 1 for butterfly ");
    System.out.println("Write 2 for elephant  ");
    System.out.println("Write 3 for bear      ");
    System.out.println("Write 4 for snake     ");

    int num = scan.nextInt();

    scan.close();

    // Call the draw function, and pass in the user's choice.
    draw(num);
  }

  /**
   * Function name: draw <-----
   * 
   * @param choice: (int)
   *
   *                Inside the function:
   *                Based on the choice, draw:
   *                1. a butterfly
   *                2. elephant
   *                3. bear
   *                4. snake
   */
  public static void draw(int choice) {
    switch (choice) {
      case 1:
        System.out.println("  .==-.                   .-==.     ");
        System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
        System.out.println("   (88\"   ::.  \\./  .::   \"88)   ");
        System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
        System.out.println("      `._... .q(_)p. ..._.'         ");
        System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
        System.out.println("        .\"\"' .'|=|`. `\"\".       ");
        System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
        System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
        System.out.println("      \\O `::/       \\::' O/       ");
        System.out.println("       \"\"--'         `--\"\"      ");
        break;

      case 2:
        System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
        System.out.println("   _.-'         \\ __...----...__ /         '-._");
        System.out.println(" .'      .:::...,'              ',...:::.      '.");
        System.out.println("(     .'``'''::;                  ;::'''``'.     )");
        System.out.println(" \\             '-)              (-'             /");
        System.out.println("  \\             /                \\             /");
        System.out.println("   \\          .'.-.            .-.'.          /");
        System.out.println("    \\         | \\0|            |0/ |         /");
        System.out.println("    |          \\  |   .-==-.   |  /          |");
        System.out.println("     \\          `/`;          ;`\\`          /");
        System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
        System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
        System.out.println("               / /`;   .==.   ;`\\ \\");
        System.out.println("         .---./_/   \\  .==.  /   \\ \\");
        System.out.println("        / '.    `-.__)       |    `\"");
        System.out.println("       | =(`-.        '==.   ;");
        System.out.println("        \\  '. `-.           /");
        System.out.println("         \\_:_)   `\"--.....-'");
        break;

      case 3:
        System.out.println("            ___   .--. ");
        System.out.println("      .--.-\"   \"-' .- |");
        System.out.println("     / .-,`          .'");
        System.out.println("     \\   `           \\");
        System.out.println("      '.            ! \\");
        System.out.println("        |     !  .--.  |");
        System.out.println("        \\        '--'  /.____");
        System.out.println("       /`-.     \\__,'.'      `\\");
        System.out.println("    __/   \\`-.____.-' `\\      /");
        System.out.println("    | `---`'-'._/-`     \\----'    _");
        System.out.println("    |,-'`  /             |    _.-' `\\");
        System.out.println("   .'     /              |--'`     / |");
        System.out.println("  /      /\\              `         | |");
        System.out.println("  |   .\\/  \\      .--. __          \\ |");
        System.out.println("   '-'      '._       /  `\\         /");
        System.out.println("               `\\    '     |------'`");
        System.out.println("                 \\  |      |");
        System.out.println("                  \\        /");
        System.out.println("                   '._  _.'");
        System.out.println("                      ``");
        break;

      case 4:
        System.out.println("         ,,'6''-,.");
        System.out.println("        <====,.;;--.");
        System.out.println("        _`---===. \"\"\"==__");
        System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
        System.out.println("     |( @@@  |===|  @@@  ||");
        System.out.println("      \\\\ @@   |===|  @@  //");
        System.out.println("        \\\\ @@ |===|@@@ //");
        System.out.println("         \\\\  |===|  //");
        System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
        System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
        System.out.println("             |==||                           `\\   \\");
        System.out.println("            |==| |                             )   |");
        System.out.println("           |==| |       _____         ______,--'   '");
        System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
        System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
        System.out.println("                \"\"\"\"		");
        break;

      default:
        System.out.println("Please enter a number b/w 1-4!");
    }
  }
}
