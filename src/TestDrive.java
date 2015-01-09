public class TestDrive {
	public static void main(String[] args) {
		LuckyNumber luckyNumber = new LuckyNumber();
		luckyNumber.setLuckyNumber(ScanANumber.scanANumber());
		
		luckyNumber.summParts(luckyNumber.getLuckyNumber());
	}
}
