package Demo.Week3;

public class SBIBank implements RBI, CibilScore {
	

	@Override
	public void getCreditScore() {
		System.out.println("score");

	}

	@Override
	public void setTransactionLimit() {
		System.out.println("transaction");

	}

	@Override
	public void kyc() {
		System.out.println("kyc");		
	}

public static void main(String[] args) {
	SBIBank sbi = new SBIBank();
	sbi.kyc();
}
}
