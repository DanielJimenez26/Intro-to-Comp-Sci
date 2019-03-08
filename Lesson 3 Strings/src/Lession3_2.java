
public class Lession3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("a\\b\\c\\\"d\"");
    System.out.println("\\t is a tab, \\n is new line, \"prints a \"quote\"");
    System.out.println("\"line one\"\n\\line\t\ttwo\\");
    System.out.println("\\\\denotes a single line comment \n\\*detonates a multiline comment*\\");
    System.out.println("\"\\\"\\\"\"\n\t\\\"\\\"\"\\\n\\\"\"\"\"\"\\");
    String word = "Birthday";
    System.out.println(word.toUpperCase());
    word = "it's my party";
    System.out.println(word.substring(0,4) + " a \"" + word.substring(8,13).toUpperCase()+"\"");
    word = "whose a whats it";
    System.out.println(word.substring(0,5).toUpperCase()+"\n is "  + word.substring(8,12).toUpperCase());
    word = "Every Way The Wind Blows";
    System.out.println(word.substring(0,5).toLowerCase()+" "+ word.substring(6,9).toUpperCase() +" "+ word.substring(10,13) +"" + "\\" + "" + word.substring(14,18).toUpperCase());
	}

}
