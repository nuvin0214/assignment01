object primeseq extends App{
def gcd(x:Int,y:Int): Int = y match{
       case 0 => x;
       case y if (y>x)=> gcd(y,x);
       case _ => gcd(y,x%y);
       }
def prime(p:Int,n:Int=2):Boolean = n match{
       case x if(p==x) => true;
       case x if (gcd(p,x)>1) => false;
       case x => prime(p,x+1);
       }
def primeSeq(a:Int):Any = a match{
       case x if(x<2) => return;
       case x if(prime(x)) => primeSeq(x-1);
                              printf("%d,",x);
       case x if(!prime(x)) =>primeSeq(x-1); 
       }
    printf("Enter a number: ");
    var p:Int = scala.io.StdIn.readInt(); 
	printf("prime numbers less than %d\n",p);
    primeSeq(p-1);
}