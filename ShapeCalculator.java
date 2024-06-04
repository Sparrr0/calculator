import java.util.*;

public class ShapeCalculator {
   
   
   
   public static void main(String[]args) 
   {
      //creates scanner
      Scanner input = new Scanner(System.in);
      int test = 1;
      
      //loops to repeat code until number 9 is pressed
      while(test!=0)
    {
      int value=0;
      int value2;
      
      String output, output2;
      System.out.println("Press the number corresponding to the shape you want to find data on");
      System.out.println("1) Square                     2) Sphere");
      System.out.println("3) Rhombus                    4) Rectangular Prism");
      System.out.println("5) Circle                     6) Cylinder");
      System.out.println("7) Equilateral Triangle       8) Cone");
      System.out.println("9) Quit Calculator");
     output = input.next();
    
    
    
    
        //error checks to make sure user inputs correct number to calculate for a shape
        while(output.equals("1")==false&&output.equals("2")==false&&output.equals("3")==false&& output.equals("4")==false
        &&output.equals("5")==false&&output.equals("6")==false&&output.equals("7")==false&&output.equals("8")==false&&output.equals("9")==false)
        {
            System.out.println("Invalid Input make sure value is an integer from 1-9");
            output = input.next();
            
        }
        value= Integer.parseInt(output);
        showCalculations(value);
        
        //ends code when value of 9 is pressed in beginning screen
        if(value ==9)
        {
          System.out.println("Thanks for playing good bye!");
          test = 0;
          break;
        }
        
         output2 = input.next();
         if(value%2!=0)
         {
            while(output2.equals("1")==false&&output2.equals("2")==false&&output2.equals("3")==false&& output2.equals("4")==false
            &&output2.equals("5")==false)
            {
               System.out.println("Invalid input make sure value is an integer from 1-5");
               output2 = input.next();
            }
            value2 = Integer.parseInt(output2);
          }
         else
         {
            while(output2.equals("1")==false&&output2.equals("2")==false&&output2.equals("3")==false)
            {
               System.out.println("Invalid input make sure value is an integer from 1-5");
               output2 = input.next();
            }
            value2 = Integer.parseInt(output2);
         }
         
        //calculates the values for the shape corresponding to the number 1(Square) using the users input
        if(value==1){

            System.out.println("Enter the length of the side:");
            String m = input.next();
            while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the length of the side:");
               m = input.next();
            }
            double v = Double.parseDouble(m);
            calculateSquare(value2, v);
            
            } 
        //calculates the values for the shape corresponding to the number 3(Rhombus) using the users input
        if(value==3)
        {
            
            
            System.out.println("Enter the length of the side:");
            String m = input.next();
            while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the length of the side:");
               m = input.next();
               
            }
            double x = Double.parseDouble(m);
            
            
            System.out.println("Enter first diagonal:");
            String v = input.next();
            while(checkDigit(v)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the first diagonal of the side:");
               v = input.next(); 
            }
            double y = Double.parseDouble(v);
            
            System.out.println("Enter the second diagonal:");
            String t = input.next();
            while(checkDigit(t)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the second diagonal of the side:");
               t= input.next();
            }
            double z = Double.parseDouble(t);
            calculateRhombus(value2, x,y,z);
        }
        //calculates the values for the shape corresponding to the number 5(Circle) using the users input
        if(value==5)
        {
            System.out.println("Enter the radius of the circle: ");
            String m = input.next();
            while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the radius of the circle: ");
               m = input.next();
            }
            double x = Double.parseDouble(m);
            calculateCircle(value2, x);
        }
        //calculates the values for the shape corresponding to the number 7(triangle) using the users input
        if(value==7)
        {
            System.out.println("Enter the length of the triangle side: ");
            String m = input.next();
            while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the length of the triangle side: ");
               m = input.next();
            }
            double x = Double.parseDouble(m);
            calculateTriangle(value2, x);
        }
        //calculates the values for the shape corresponding to the number 2(sphere) using the users input
        if(value==2)
        {
            System.out.println("Enter the radius of the sphere: ");
            String m = input.next();
            while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the radius of the sphere: ");
               m = input.next();
            }
            double x = Double.parseDouble(m);
            calculateSphere(value2, x);
        }
        //calculates the values for the shape corresponding to the number 4(prism) using the users input
        if(value ==4)
        {
            System.out.println("Enter the length of the prism:");
            String m = input.next();
            while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the length of the side:");
               m = input.next();
               
            }
            double x = Double.parseDouble(m);
            
            
            System.out.println("Enter the height of the prism:");
            String v = input.next();
            while(checkDigit(v)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the height of the prism:");
               v = input.next(); 
            }
            double y = Double.parseDouble(v);
            
            System.out.println("Enter the width of the prism:");
            String t = input.next();
            while(checkDigit(t)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the width of the prism:");
               t= input.next();
            }
            double z = Double.parseDouble(t);
            calculateRectangularPrism(value2, x,y,z);            
         
        }
        //calculates the values for the shape corresponding to the number 8(cone) using the users input
        if(value==8)
        {
         System.out.println("Enter the radius of the cone: ");
         String m = input.next();
         while(checkDigit(m)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the radius of the cone:");
               m = input.next();
               
            }
            double x = Double.parseDouble(m);
         
         
         System.out.println("Enter the height of the cone: ");
         String v = input.next();
            while(checkDigit(v)==false)
            {
               System.out.println("Invalid input make sure value is an integer");
               System.out.println("Enter the height of the cone:");
               v = input.next(); 
            }
            double y = Double.parseDouble(v);
         calculateCone(value2,x,y);
        }
        //calculates the values for the shape corresponding to the number 6(cylinder) using the users input
        if(value==6)
        {
            System.out.println("Enter the radius of the cylinder: ");
            String m = input.next();
            while(checkDigit(m)==false)
               {
                  System.out.println("Invalid input make sure value is an integer");
                  System.out.println("Enter the radius of the cylinder:");
                  m = input.next();
                  
               }
               double x = Double.parseDouble(m);
            
            
            System.out.println("Enter the height of the cylinder: ");
            String v = input.next();
               while(checkDigit(v)==false)
               {
                  System.out.println("Invalid input make sure value is an integer");
                  System.out.println("Enter the height of the cylinder:");
                  v = input.next(); 
               }
               double y = Double.parseDouble(v);

            calculateCylinder(value2,x,y);
        }
        
   }
   
     

  }
  //checks if the input is a digit or not in order to evaluate if error checking must occur
   public static boolean checkDigit(String x)
   {
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      int count = 0;
      boolean value = true;
      for(int i =0;i<alphabet.length();i++)
      {
         if(x.substring(0,1).equals(alphabet.substring(i,i+1)))
         {
            count++;
         }
      }
      if(count>0)
      {
         value = false;
      }
      return value;
   }
   //Displays the choice of calculations for different shapes when number corresponding to the shape is chosen
   public static void showCalculations(int x)
   {
      if(x==1||x==3)
      {
         System.out.println("Choose one of the following calculations:");
         System.out.println("1) Perimeter       2) Area");
         System.out.println("3) Surface Area    4) Diagonal Length");
         System.out.println("5) All of the above");
      }
      else if(x==5)
      {
         System.out.println("Choose one of the following calcualtions:");
         System.out.println("1) Circumference   2) Area");
         System.out.println("3) Diameter        4) Diagonal Length");
         System.out.println("5) All of the above");
      }   
      else if(x==7)
      {
         System.out.println("Choose one of the following calculations:");
         System.out.println("1) Perimeter       2) Area");
         System.out.println("3) Height          4) Diagonal Length");
         System.out.println("5) All of the above");
      
      }
      if(x%2==0)
      {
         System.out.println("Choose one of the following calculations:");
         System.out.println("1) Volume          2) Surface Area");
         System.out.println("3) All of the Above");
     
   }
 }
   //calculates the perimeter, surface area, area, and diagonal of a square
   public static void calculateSquare(int x, double length)
   {
      if(x==1){
         double perim = length *4;
         System.out.println("Perimeter: "+perim);
      }
      else if(x==2){
         double area = length*length; 
         System.out.println("Area: "+area);
      }
      else if(x==3){
         System.out.println("Surface Area: N/A");
      }
      else if(x==4){
         double diag = length * Math.sqrt(2);
         System.out.println("Diagonal: "+diag);
      }
      else
      {
         double perim = length *4;
         System.out.println("Perimeter: "+perim);
         double area = length*length;
         System.out.println("Area: "+area);
         System.out.println("Surface Area: N/A");
         double diag = length * Math.sqrt(2);
         System.out.println("Diagonal: "+diag);
      }
   }
   //calculates the perimeter, area, surface area, and diagonal of a rhombus
   public static void calculateRhombus(int x, double length, double diagonal1, double diagonal2)
   {
      if(x==1){
         double perim = length *4;
         System.out.println("Perimeter: "+perim);
      }
      else if(x==2){
         double area = (diagonal1*diagonal2)/2; 
         System.out.println("Area: "+area);
      }
      else if(x==3){
         System.out.println("Surface Area: N/A");
      }
      else if(x==4){
         System.out.println("Diagonal: "+diagonal1+ " and "+diagonal2);
      }
      else
      {
         double perim = length *4;
         System.out.println("Perimeter: "+perim);
         double area = (diagonal1*diagonal2)/2;
         System.out.println("Area: "+area);
         System.out.println("Surface Area: N/A");
         System.out.println("Diagonal: "+diagonal1+ " and "+diagonal2);
      
      }
   
   }
      //calculates the circumference, area, diameter, and diagonal of a circle
      public static void calculateCircle(int x, double radius)
      {
         if(x==1)
         {
            double circum = 2*Math.PI*radius;
            System.out.println("Circumference: "+circum);
         }
         else if(x==2)
         {
            double area = Math.PI*(radius*radius);
            System.out.println("Area: "+area);
         }
         else if(x==3)
         {
            double diam = radius * 2;
            System.out.println("Diameter: "+diam);
         }
         else if(x==4)
         {
            System.out.println("Diagonal: N/A");
         }
         else
         {
            double circum = 2*Math.PI*radius;
            System.out.println("Circumference: "+circum);
            double area = Math.PI*(radius*radius);
            System.out.println("Area: "+area);
            double diam = radius * 2;
            System.out.println("Diameter: "+diam);
            System.out.println("Diagonal: N/A");

         }
         
      }
      //calculates the perimeter, area, height, and diagonal of a triangle
      public static void calculateTriangle(int x, double length)
      {
         if(x==1){
         double perim = length*3;
         System.out.println("Perimeter: "+perim);
         }
         else if(x==2){
            double area = (Math.sqrt(3)/4)*(length*length);
            System.out.println("Area: "+area);
         }
         else if(x==3){
            double height = (Math.sqrt(3)/2)*length;
            System.out.println("Height: "+height);
         }
         else if(x==4){
            System.out.println("Diagonal: N/A");
         }
         else
         {
            double perim = length*3;
            System.out.println("Perimeter: "+perim);
            double area = (Math.sqrt(3)/4)*(length*length);
            System.out.println("Area: "+area);
            double height = (Math.sqrt(3)/2)*length;
            System.out.println("Height: "+height);
            System.out.println("Diagonal: N/A");
         
         }
      
      }
      //calculates the volume and surface area of a sphere
      public static void calculateSphere(int x, double radius)
      {
         if(x==1)
         {
            double newrad = Math.pow(radius,3);
            System.out.println(newrad);
            double vol = ((4*newrad)/3)*Math.PI;
            System.out.println("Volume: "+vol);
         }
         if(x==2)
         {
            double newrad = Math.pow(radius,2);
            double area = 4*Math.PI*newrad;
            System.out.println("Surface Area "+area);       
         }
         if(x==3)
         {
            double newrad = Math.pow(radius,3);
            double vol = (4*newrad/3)*Math.PI;
            System.out.println("Volume: "+vol);
            newrad = Math.pow(radius,2);
            double area = 4*Math.PI*newrad;
            System.out.println("Surface Area "+area);       

         }
      }
      //calculates the volume and surface area of a rectangular prism
      public static void calculateRectangularPrism(int x, double length, double width, double height)
      {
         if(x==1)
         {
            double vol = length*width*height;
            System.out.println("Volume: "+vol);
            
         }
         if(x==2)
         {
            double area = 2*((length*width)+(length*height)+(width*height));
            System.out.println("Surface Area: "+area);
         }
         if(x==3)
         {
            double vol = length*width*height;
            System.out.println("Volume: "+vol);
            double area = 2*((length*width)+(length*height)+(width*height));
            System.out.println("Surface Area: "+area);
            
         }
      }
      //calculates the volume and surface area of a cone
      public static void calculateCone(int x, double radius, double height)
      {
         if(x==1)
         {
            double newrad = Math.pow(radius,2);
            double vol = ((newrad*height)/3)*Math.PI;
            System.out.println("Volume: "+vol);
         }
         if(x==2)
         {
            double newrad = Math.pow(radius,2);
            double newhei = Math.pow(height,2);
            double area = (Math.PI*radius)*(radius+Math.sqrt(newrad+newhei));
            System.out.println("Surface Area "+area);       
         }
         if(x==3)
         {
            double newrad = Math.pow(radius,2);
            System.out.println(newrad);
            double vol = ((newrad*height)/3)*Math.PI;
            System.out.println("Volume: "+vol);
            newrad = Math.pow(radius,2);
            double newhei = Math.pow(height,2);
            double area = (Math.PI*radius)*(radius+Math.sqrt(newrad+newhei));
            System.out.println("Surface Area "+area);       

      }
     }
     
     //Calculates the volume and surface area of a cylinder
     public static void calculateCylinder(int x, double radius, double height)
     {
         if(x==1)
         {
            double newrad = Math.pow(radius,2);
            double vol = (newrad*height)*Math.PI;
            System.out.println("Volume: "+vol);
         }
         if(x==2)
         {
            double newrad = Math.pow(radius,2);
            double area = (2*Math.PI*radius*height)+(2*Math.PI*newrad);
            System.out.println("Surface Area: "+area);
         }
         if(x==3)
         {
            double newrad = Math.pow(radius,2);
            double vol = Math.PI*newrad*height;
            System.out.println("Volume: "+vol);
            newrad = Math.pow(radius,2);
            double area = (2*Math.PI*radius*height)+(2*Math.PI*newrad);
            System.out.println("Surface Area: "+area);
         }
     }
      
   
   
}





