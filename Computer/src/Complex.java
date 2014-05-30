
@SuppressWarnings({ "serial", "rawtypes" })
public class Complex extends Number implements Comparable {
	
	/**
	 * 
	 */
	private double realPart;
	private double imaginaryPart;
	
	public Complex(double a,double b) {
		this.realPart = a;
		this.imaginaryPart = b;
	}
	public Complex(double a) {
		this(a,0);
	}
	public Complex() {
		this(0,0);
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public Complex add(Complex add1,Complex add2) {
		return(new Complex(add1.realPart+add2.realPart,add1.imaginaryPart+add2.imaginaryPart));
	}
	
	public Complex substract(Complex sub1,Complex sub2) {
		return(new Complex(sub1.realPart-sub2.realPart,sub1.imaginaryPart-sub2.imaginaryPart));
	}
	
	public Complex multiply(Complex mul1,Complex mul2) {
		return(new Complex(mul1.realPart*mul2.realPart-mul1.imaginaryPart*mul2.imaginaryPart,
				mul1.imaginaryPart*mul2.realPart+mul1.realPart*mul2.imaginaryPart));
	}
	
	public Complex divide(Complex div1,Complex div2) {
		return(new Complex((div1.realPart*div2.realPart+div1.imaginaryPart*div2.imaginaryPart)/
				(div2.realPart*div2.realPart+div2.imaginaryPart*div2.imaginaryPart),
				(div1.imaginaryPart*div2.realPart-div1.realPart*div2.imaginaryPart)/
				(div2.realPart*div2.realPart+div2.imaginaryPart*div2.imaginaryPart)));
	}
	
	public double abs() {
		return(Math.sqrt(this.realPart*this.realPart+this.imaginaryPart*this.imaginaryPart));
	}
	
	public String toString() {
		return(String.valueOf(this.realPart)+" + "+String.valueOf(this.imaginaryPart)+"i");
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.realPart>((Complex)o).realPart)
			return 1;
		else if(this.realPart<((Complex)o).realPart)
			return -1;
		else{
			if(this.imaginaryPart>((Complex)o).imaginaryPart)
				return 1;
			else if(this.imaginaryPart<((Complex)o).imaginaryPart)
				return -1;
			else 
				return 0;
		}
	}
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
