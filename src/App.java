public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numeri = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};


        MyIterator iterator = new MyIterator(numeri);

        while(iterator.hasAncoraElementi()){
            System.out.println(iterator.getElementoSuccessivo()); // restituisce l'elemento successivo
        }

        iterator.resetCounter();

        System.out.println("-------------------------------------------------");

        MyIterator iterator2 = new MyIterator();

        iterator2.addElemento(2);
        iterator2.addElemento(3);
        iterator2.addElemento(5);
        iterator2.addElemento(6);
        iterator2.addElemento(3);
        iterator2.addElemento(3);
        iterator2.addElemento(123);

        while (iterator2.hasAncoraElementi()) {
            System.out.println(iterator2.getElementoSuccessivo());
        }
    }
}
