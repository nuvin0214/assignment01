object oddeven extends App{
def isEven(n:Int): Boolean = n match{
    case 0 => true;
    case _ => isOdd(n-1);
    }
def isOdd(n:Int): Boolean = !(isEven(n));
    printf("Enter a number: ");
    var p:Int = scala.io.StdIn.readInt(); 
    isEven(p) match {
    case true=> print("Even");
    case false=> print("Odd");
    }
}