
object Q1andQ2
{

	class rationalNum(n:Int,d:Int){
  	 require(d>0,"d is lower than or equal to zero");
   	 private var g = gcd(n,d);
	 if(g<0){g = -g;}
    	 def numerator=n/g;
    	 def denominator=d/g;
   	 def this(n:Int)=this(n,1);
   	 private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    	 def neg=new rationalNum(-this.numerator,this.denominator);
	 def +(r:rationalNum)=new rationalNum(this.numerator*r.denominator + this.denominator*r.numerator,this.denominator*r.denominator);
	 def -(r:rationalNum)=this+r.neg;
   	 override def toString= numerator.toString+"/"+denominator.toString;
}	
	def main(args:Array[String]):Unit=
	{
		println("-------------------------------------");
		println("question 01 =>Rational-->Negetion");
		println("-------------------------------------\n");

		val rat1=new rationalNum(1,2);
		val rat2=rat1.neg
		println("Number   : "+rat1.toString);
		println("Negetion : "+rat2.toString);

		println("\n-------------------------------------");
		println("question 02 =>Substraction-->X-Y-Z");
		println("-------------------------------------\n");

		val x=new rationalNum(3,4);
		val y=new rationalNum(5,8);
		val z=new rationalNum(2,7);
		val res=x-y-z;
		println("X-Y-Z = "+res.toString);

		println("\n-------------------------------------");
	}

}