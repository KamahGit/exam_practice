package exam_practice;



public class StringPlay {

	public static void main(String[] args) {
		String identityString = "  Joe Jonah Jameson @!#$#$#$8*^";
		String[] opStrings = new String[] { "equals Jay Jonah Jameson", "equals ignore case", "char at 9", 
											"index of Jameson", "space is Empty", "space is blank", "to Upper Case",
											"to Lower case", "trim", "replace", "length"
				
									  };
		String[] resultStrings = new String[opStrings.length];
		System.out.println("Test string: "+ identityString+"\n");
		
		resultStrings[0] = Boolean.toString(identityString.equals("Jay Jonah Jameson"));
		resultStrings[1] = identityString.equals("joe jonah jameson @!#$#$#$8*^")+"";
		resultStrings[2] = identityString.charAt(9)+"";
		resultStrings[3] = identityString.indexOf("Jameson")+"";
		resultStrings[4] = Boolean.toString(" ".isEmpty());
		resultStrings[5] = " ".isBlank()+"";
		resultStrings[6] = identityString.toUpperCase();
	    resultStrings[7] = identityString.toLowerCase();
		resultStrings[8] = identityString.trim();
		resultStrings[9] = identityString.replace("J", "Q");
		resultStrings[10] = identityString.length()+"";
		
		for (int i = 0; i < opStrings.length; i++) {
			System.out.println(opStrings[i]+" ==> "+resultStrings[i]);
		}
	}

}
