public class Main {
    public static void main(String[] args) {
        // Задача 1
        int i=1;
        while (i<=10)
         { System.out.print (" "+i);
            i++;}
        System.out.println();
        for (i=10;i>0;i--)
         {System.out.print(" "+i);}
        // Задача 2
            System.out.println();
              int numberP=5;
          while (numberP<=31)
            { System.out.println("Сегодня пятница, "+numberP+"-е число. Необходимо подготовить отчет");numberP +=7;}
        // Задача 3
        System.out.println();
          int FirstYear=1896;
          int period=79;
          int a=FirstYear;
          while (a<FirstYear+200)
            {System.out.println(a);a=a+period;}

    }
}