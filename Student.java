public class Student {
    int id;
    String name;
    int compCredits;

   void printSummary() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(compCredits);

    }

    void rename(String name) {
        this.name = name;
    }

    void addCredits(int amount) {
        this.compCredits += amount;
    }
}