 object total extends App{
      def bookPrice(x:Double)=x*24.95;
      def discount(x:Double)=x*.6
      def shippingcost(x:Double)=if(x<=50) 3 else 3+(x-50)*.75;
      def totalprice(x:Double)=discount(bookPrice(x))+shippingcost(x);
      println((totalprice(60)*100)/100);
      }