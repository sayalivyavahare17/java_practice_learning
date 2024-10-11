public class App {
    public static void main(String[] args) throws Exception {
        int i, fact=1;
        int number = 5;

        for(i=1; i<=number; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial "+number+"is:"+fact);
    }
}
