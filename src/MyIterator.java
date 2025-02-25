public class MyIterator {

    private int[] array;
    private int cont;

    MyIterator(int[] array){
        this.array = array;
        this.cont = 0;
    }
    
    MyIterator(){
        this.array = new int[0];
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

    public void resetCounter(){
        this.cont = 0;
    }

    public void addElemento(int nuovoElemento){

        int[] temp;

        if (array.length != 0){
            temp = new int[array.length + 1];
    
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }

            temp[array.length] = nuovoElemento;
        } else {
            temp = new int[1];
            temp[0] = nuovoElemento;
        }
        
        this.array = temp;
    }

}
