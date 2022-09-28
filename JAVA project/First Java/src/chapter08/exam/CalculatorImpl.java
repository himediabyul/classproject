package chapter08.exam;

public class CalculatorImpl implements Calculator{

	@Override
	public long add(long n1, long n2) {
		return n1+n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1-n2;
	}

	@Override
	public long multifly(long n1, long n2) {
		return n1*n2;
	}

	@Override
	public double devide(double n1, double n2) {
		return n1/n2;
	}
	

	public static void main(String[] args) {
		
		CalculatorImpl cal1 = new CalculatorImpl();
		Calculator cal2 = new CalculatorImpl();
		Calculator cal3 = new CalculatorImpl(); {
			
		}
		
	}

}
