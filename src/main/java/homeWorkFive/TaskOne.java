package homeWorkFive;

public class TaskOne {

    static boolean isEdekaOpen = true;
    static boolean isReweOpen = false;

    public static void main(String[] args) {
        System.out.println("Я могу купить еду, это " + canBuy());
    }
    public static boolean canBuy(){
        return (isEdekaOpen || isReweOpen && true) ? true : false;
        // Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false. (используйте &&)
    }
}
