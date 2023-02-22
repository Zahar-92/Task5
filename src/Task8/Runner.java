package Task8;

public class Runner {
    public void run(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println("Добавление элементов в конец:");
        myArrayList.add(1);
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.printMyListArray();
        myArrayList.add(3, 9);
        Integer i = 112;
        myArrayList.remove(i);
        myArrayList.remove(7);
        System.out.println("Получение элемента по индексу 0: ");
        System.out.println(myArrayList.get(0));
        //Замена элемента по заданному индексу 0
        myArrayList.set(0, 9);

           }
    }

