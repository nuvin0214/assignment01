object profitmovie extends App{
def attendees(price:Int): Int = 120 + (15-price)/5*20;
def revenue(price:Int):Int = attendees(price)*price;
def cost(price:Int):Int=500+attendees(price);
def profit(price:Int): Int = revenue(price)-cost(price);
var x:Int = 5;
while(x<41){
      printf("ticket price : %d => profit : %d\n",x,profit(x)); 
      x = x+5;
   }
}