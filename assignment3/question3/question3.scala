object addition extends App{
def myfuntion(x:Int): Int = x match{
    case 1 => 1;
    case _ => x + myfuntion(x-1);
    }
    printf("Enter a number: ");
    var p:Int = scala.io.StdIn.readInt(); 
    printf("%d",myfuntion(p));
}