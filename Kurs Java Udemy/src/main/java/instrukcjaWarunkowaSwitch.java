public class instrukcjaWarunkowaSwitch {
    public static void main(String[] args) {
        int a = 50;
        switch(a) {
            case 10:
                System.out.println(10);
            case 50:
                System.out.println(50);
            case 100:
                System.out.println(100);
                break;
            default:
                System.out.println("default");
        }
    }
}
