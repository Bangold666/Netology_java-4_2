public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

       int expected = 30;
       long fact = service.calculate(amount, registered);
       if (fact == expected) {
           System.out.println(" Проверку прошел ");
    }
}

