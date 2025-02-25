public class MyIterator {

    private int[] array;
    private int cont;

    MyIterator(int[] array){
        this.array = array;
        this.cont = 0;
    }


    // (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
    public int getElementoSuccessivo(){

        int toReturn = this.array[this.cont];

        this.cont++;

        return toReturn;
    }

    // che deve restituire true se ci sono ancora elementi da restituire)
    public boolean hasAncoraElementi(){

        if (cont < array.length) {
            return true;
        }
        return false;
    }

}
