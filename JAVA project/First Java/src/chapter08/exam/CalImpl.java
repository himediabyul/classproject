package chapter08.exam;

public class CalImpl implements Calculator1 {

	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}
	
	
	public static void main(String[] args) {
		
	
	CalImpl cal = new CalImpl();
	Calculator1 cal1 = new CalImpl();
	Calculator1 cal2 = new Calculator1() {

		@Override
		public long add(long n1, long n2) {
			return n1 + n2;
		}

		@Override
		public long substract(long n1, long n2) {
			return n1 - n2;
		}

		@Override
		public long multiply(long n1, long n2) {
			return n1 * n2;
		}

		@Override
		public double divide(double n1, double n2) {
			return n1 / n2;
		}
	};
	}
}
