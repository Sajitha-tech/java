public class Product{
    String pcode;
    String pname;
    int price;
     public static void main(String[] args) {
     Product obj1 = new Product();
      Product obj2 = new Product();
       Product obj3 = new Product();
      
        
        obj1.pcode="p001";
        obj1.pname="pencil";
        obj1.price=50;
        
        obj2.pcode="p002";
        obj2.pname="pen";
        obj2.price=100;
        
        obj3.pcode="p003";
        obj3.pname="crayon";
        obj3.price=40;
            System.out.println("Product 1"+obj1.pname +" "+ obj1.price+"/-");
                System.out.println("Product 2"+obj2.pname +" "+ obj2.price+"/-");
                    System.out.println("Product 3"+obj3.pname +" "+ obj3.price+"/-");
            
        
        if(obj1.price < obj2.price && obj1.price < obj3.price)
        System.out.println("Product 1 has lowest Price"+" :"+" "+obj1.pname +" "+ obj1.price+"/-");
        else if(obj2.price < obj3.price &&obj2.price < obj1.price)
        System.out.println("Product 2 has lowest Price"+" :"+ obj2.pname +" "+ obj2.price+"/-");
        else
        System.out.println("Product 3 has lowest Price"+": "+ obj3.pname +" "+ obj3.price+"/-");
        
     }
    }
