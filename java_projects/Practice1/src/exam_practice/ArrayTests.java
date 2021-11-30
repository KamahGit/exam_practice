package exam_practice;

class ArrayTests {
	private int[] testScores = new int[4];
	
	
	
	public void setTestScores(int[] scores) {
		this.testScores = scores;
	}
	public static void main(String[] args) {
		
		ArrayTests arrayTest = new ArrayTests();
		int[] scores = new int[] {1, 2, 4, 5};
		arrayTest.setTestScores(scores);
		System.out.println("testscores first "+ arrayTest.testScores[3]);
	}

}


