package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	static final int NUMBERS_AMOUNT = 12;
	static final int CALL_UNSUCCESSFUL = -1;
	static final int BUFFER_FULL = 11;

	private int[] NUMBERS = new int[NUMBERS_AMOUNT];

	private int total = CALL_UNSUCCESSFUL;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == CALL_UNSUCCESSFUL;
		}
		
		public boolean isFull() {
				return total == BUFFER_FULL;
			}
		
		protected int peekaboo() {
			if (callCheck())
				return CALL_UNSUCCESSFUL;
			return NUMBERS[total];
		}
			
		public int countOut() {
			if (callCheck())
				return CALL_UNSUCCESSFUL;
			return NUMBERS[total--];
		}

}
