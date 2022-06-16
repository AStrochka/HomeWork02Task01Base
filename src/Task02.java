public class Task02 {
    public static void main(String[] args) {
        int ageChildren = 10;
        if (ageChildren < 6) {
            System.out.println("пошел с сад");
        } else if (ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("пошел в старшую школу");
        } else {
            System.out.println("пошел в институт");
        }
    }
}