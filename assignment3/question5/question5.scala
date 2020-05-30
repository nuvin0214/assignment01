object Sumeven extends App{
def isEven(n:Int): Boolean = n match{
    case 0 => true;
    case _ => isOdd(n-1);
    }
def isOdd(n:Int): Boolean = !(isEven(n));

def EvenADD(x:Int): Int= x match{
    case x if(x<0) => 0;
    case x if(isEven(x)) => x + EvenADD(x-1);
    case x if(!isEven(x)) => EvenADD(x-1);
    }

    printf("Enter a number: ");
    var p:Int = scala.io.StdIn.readInt(); 
 
printf("Sum of even numbers less than %d : %d",p,EvenADD(p-1));

}