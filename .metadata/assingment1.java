import java.util.Scanner;

public class assingment1 {
    public static void main(String[] args) {
        //ques 1: declare variables od different data types
        int  num = 23;
        double num1 = 345.445;
        char ch = 'a';
        boolean bl = 34>46;
        String st = "Prince CSEAIML";
        System.out.println(num+" "+num1+" "+ch+" "+bl+" "+st);



        //ques 2 Swap two number.

        int n1 = 34,n2=45;
        System.out.println("before swap \n "+"n1="+n1+" "+"n2="+n2);
        int temp = n1;
        n1 = n2;
        n2 = n1;
        System.out.println("after swap \n "+"n1="+n1+" "+"n2="+n2);



        //ques 3 area of circle.
        int radius = 34;
        System.out.println("Area of Circle = "+(double)22/7*radius*radius);


      

        // ques 4 calculate the simple interest.
        double principal = 2348.34;
        double rate = 10.5;
        double time = 4.5;
        System.out.println("Simple interest = "+principal*rate*time/100);



        // quea 5 swap a two num airthmatic or xor..
        int a = 5;
        int b = 10;
        System.out.println("before swap \n "+"a="+a+" "+"b="+b);
         a = a^b;
         b = a^b;
         a = a^b;
        System.out.println("after swap \n "+"a="+a+" "+"b="+b);
       
      //ques 6 calculate average or sum..
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Hindi marks : ");
        double hin = sc.nextInt();
        System.out.print("enter English marks : ");
        double Eng = sc.nextInt();
        System.out.print("enter Physics marks : ");
        double Phy = sc.nextInt();
        System.out.print("enter Mathematics marks : ");
        double Math = sc.nextInt();
        System.out.print("enter Science marks : ");
        double Sci = sc.nextInt();
        double total = hin+Eng+Phy+Math+Sci;
        System.out.println("Total marks = "+total);
        System.out.println("Average is = "+total/5);



        // ques 7 convert temperature celsius to fahrenheit.

        Scanner ss = new Scanner(System.in);
        System.out.print("enter celsius temperature : ");
        int  celsius =ss.nextInt();
        System.out.print("celius to fahrenheit : "+(32+celsius)*9/5);


       //ques 8 number is positive or negetive or zero.
       
        Scanner sss = new Scanner(System.in);
        int  num3 =sss.nextInt();
        String res = (num3>0)?"Positive":(num3<0)?"Negative":"Zero";
        System.out.print("The number is :"+res);


        //ques 9 largest number in tree number using else if ..
         Scanner nn = new Scanner(System.in);
         System.out.print("enter the first number : ");
         double  l1 =nn.nextInt();
         System.out.print("enter the Second number : ");
         double l2 =nn.nextInt();
         System.out.print("enter the third number : ");
         double  l3 =nn.nextInt();
         if(l1>l2 && l1>l3){
            System.out.println("first number is largest : "+l1);
         }else {
            if(l2>l1 && l2>l3){
                 System.out.println("Second number is largest : "+l2);
            }else{
                 System.out.println("third number is largest : "+l3);
            }
         }

    
         //ques 10 assing grades uing conditions..
          Scanner marks = new Scanner(System.in);
         System.out.print("enter the marks : ");
         double  grade =marks.nextInt();

         if(grade>=90){
            System.out.println("Grade A");
         }else{
            if(grade>=75 && grade<=89){
                System.out.println("Grade B");
            }else{
                if(grade>=50 && grad<=74){
                    System.out.println("Grade C");
                }else{
                    System.out.println("Fail");
                }
            }
              
         }


         //ques 11 display weekdays using switch case..
         Scanner Sw = new Scanner(System.in);
         System.out.print("enter the number : ");
         int num4 =Sw.nextInt();
         switch(num4) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
             case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break; 
             case 7:
                System.out.println("Sunday");
                break;        
            default:
            System.out.println("please enter number 1 to 7");
            break;



            //ques 14 grade cahracter 
         Scanner g= new Scanner(System.in);
         System.out.print("enter the character : ");
         char  var =g.next().charAt(0);
         switch(var) {
            case 'A':
                System.out.println("Exellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
             case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
            System.out.println("please enter character A to D or F");   
            break;
            



            //ques 15 color red yellow greeen display action..
         Scanner Ac = new Scanner(System.in);
         System.out.print("enter the color : ");
         String num7 =Ac.nextLine();
             switch(num7) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
             case "Green":
                System.out.println("Go");
                break;
            default:
            System.out.println("Please enter the  Red or Green or Yellow color");
            break;
            


 
             //ques 16 evev or odd...
         Scanner num5 = new Scanner(System.in);
         System.out.print("enter the number : ");
         int num6 =num5.nextInt();
         if(num6%2!=0 && num6<=20 || num6%2==0 && num6>=6 && num6<=20){
            System.out.println("Weird");
         }else{
            if(num6>20 || num6>=2 && num6<=5){
                System.out.println("Not Weird");
            }
         }
        
         }
    }

}


//ques 17 trangle is equilateral ,isosceles,scalence.

        Scanner num10 = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int aa = sc.nextInt();
        System.out.print("Enter second side: ");
        int bb = sc.nextInt();
        System.out.print("Enter third side: ");
        int cc = sc.nextInt();

        // Check if valid triangle
        if (a+b>c && a+c>b && b+c>a) {
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    
     //ques 18 two number in accebnding order
     Scanner dd = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num11 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num12 = sc.nextInt();
        if (num1 < num2) {
            System.out.println("Numbers in ascending order: " + num1 + ", " + num2);
        } else {
            System.out.println("Numbers in ascending order: " + num2 + ", " + num1);
        }


        //ques 19 calculate gross salary based..
        Scanner scs = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        double basic = scs.nextDouble();
        double hra = 0, da = 0, pf = 0, gross = 0;
        // Salary conditions
        if (basic <= 10000) {
            hra = 0.20 * basic;
            da = 0.80 * basic;
            pf = 0.05 * basic;
        } else if (basic>= 10001 && basic<=20000) {
            hra = 0.25 * basic;
            da = 0.90 * basic;
            pf = 0.07 * basic;
        } else {
            hra = 0.30 * basic;
            da = 0.95 * basic;
            pf = 0.10 * basic;
        }

        // Gross salary formula
        gross = basic + hra + da - pf;
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gross);


  //ques 20 leap year
   Scanner num8 = new Scanner(System.in);
         System.out.print("enter the year : ");
         int num9 =num8.nextInt();
         if(num9%100!=0 && num9%4==0 || num9%400==0){
               System.out.println("it is leap year");
         }else{
            System.out.println("not leap year");
         }


}
}