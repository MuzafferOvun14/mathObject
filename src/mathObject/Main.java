package mathObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math=new Math();
		System.out.println(math.sum(5, 13));
		System.out.println(math.sub(5, 13));
		System.out.println(math.divide(12,5));
		System.out.println(math.getPi());
		// pi*r*r   areaOfCircle
		System.out.println(math.areaOfCircle(8.7));
		System.out.println(math.factoriyel(5));
		System.out.println(math.sumOfSmallNumbers(6));
		System.out.println(math.sumOfBetweenNumber(3, 6));
	}

}
