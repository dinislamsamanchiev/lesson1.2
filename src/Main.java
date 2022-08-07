public class Main {

    public static void main(String[] args) {

        bot1 objectA = new bot1(100,5,Enum3.DOKTOR);
        bot2 objectB = new bot2(200,25,Enum3.MAGIC);
        bot3 objectC = new bot3(120,23, Enum3.BERSERK );
        System.out.println("objectA " + objectA.getInfo() + "\nobjectB " + objectB.getInfo() +
                "\nobjectC " + objectC.getInfo());

    }
}
