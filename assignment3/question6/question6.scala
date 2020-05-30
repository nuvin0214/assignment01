object fibonacciSeq extends App{
def febonacci(x:Int): Int = x match{
    case 0 => 0;
    case 1 => 1;
    case _ => febonacci(x-1) + febonacci(x-2);
    }
def febonacciser(x:Int):Any= x match{
    case x if(x<0) => return;
    case _ => febonacciser(x-1);
	      printf("%d,",febonacci(x));
    }
    printf("Enter a number: ");
    var p:Int = scala.io.StdIn.readInt(); 
    febonacciser(p);
}