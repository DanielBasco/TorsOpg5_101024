package opg2;

public class Main {
    public static void main(String[] args) {

    Cafe andreasCafe = new Cafe();
    andreasCafe.loadMenuData();

for (String kaffe: andreasCafe.getCoffeeMenu()){
    System.out.println(kaffe);
}
    }
}
