
public class LuckyNumber {
	int luckyNumber;

	public int getLuckyNumber() {
		return luckyNumber;
	}

	public void setLuckyNumber(int luckyNumber) {
		LuckyNumber luckyObj = new LuckyNumber();

		if (luckyObj.assertation(luckyNumber) || luckyNumber > 0) {
			this.luckyNumber = luckyNumber;
		}
	}

	public boolean assertation(int luckyNumber) {
		boolean isEligible = false;

		char charArray[] = Integer.toString(luckyNumber).toCharArray();

		// check if we have equal parts to compare
		if (charArray.length % 2 == 0) {
			isEligible = true;
		}
		return isEligible;
	}
	
	public boolean summParts(int luckyNumber) {
		char charArray[] = Integer.toString(luckyNumber).toCharArray();
		char firstPart[] = Integer.toString(luckyNumber).substring(0, charArray.length / 2).toCharArray();
		char secondPart[] = Integer.toString(luckyNumber).substring(charArray.length / 2, charArray.length).toCharArray();
		
		int firstSumm = 0;
		int SecondSumm = 0;
		
		for (char c : firstPart) {
			firstSumm += Integer.parseInt(String.valueOf(c));
		}	
		for (char c : secondPart) {
			SecondSumm += Integer.parseInt(String.valueOf(c));
		}
		/*
		System.out.println("First summ is: " + firstSumm);
		System.out.println("Second summ is: " + firstSumm);
		*/
		boolean equalityOfParts = false;
		
		if (firstSumm == SecondSumm) {
			System.out.println("are equal");
			equalityOfParts = true;
		} else {
			System.out.println("aren't equal");
		}
		return equalityOfParts;
	}
}

