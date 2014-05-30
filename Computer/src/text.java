import java.util.Scanner;


public class text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complex com1,com2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first complex number:");
		com1 = new Complex(input.nextDouble(),input.nextDouble());
		System.out.print("Enter the second complex number:");
		com2 = new Complex(input.nextDouble(),input.nextDouble());
		System.out.println(com1.toString()+" + "+com2.toString()+" = "+com1.add(com1, com2).toString());
		System.out.println(com1.toString()+" - "+com2.toString()+" = "+com1.substract(com1, com2).toString());
		System.out.println(com1.toString()+" * "+com2.toString()+" = "+com1.multiply(com1, com2).toString());
		System.out.println(com1.toString()+" / "+com2.toString()+" = "+com1.divide(com1, com2).toString());
		System.out.println("|"+com1.toString()+"|"+" = "+com1.abs());
		System.out.println("|"+com2.toString()+"|"+" = "+com2.abs());
	}

}
