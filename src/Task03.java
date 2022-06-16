public class Task03 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
if ((chicken&&vegetables&&sour&&toast&&sausage&&eggs)==true) {
    System.out.println("готовим \"Цезарь\"");
}
    else if ((vegetables&&sausage)==true|(chicken&&eggs)==true) {
        System.out.println("Готовим \"Оливье\"");
    }
    else if (vegetables==true){
        System.out.println("Готовим \"Овощной\"");
    }
    else {
        System.out.println("Ничего нет");
    }
}
    }

