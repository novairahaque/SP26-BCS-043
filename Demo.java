public class Demo{
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student();

       s1.id = 015;
       s1.name = "Usman";
       s1.compCredits = 16;

       s2.id = 016;
       s2.name = "Sana";
       s2.compCredits = 18;

       System.out.println("Before changes: ");

       s1.printSummary();
       s2.printSummary();

       s1.name = "Ali";
       s1.compCredits = 17;
       
       s2.addCredits(10);

       
       System.out.println("After adding credits to s2: ");   

       s1.printSummary();
       s2.printSummary();

         }
    }