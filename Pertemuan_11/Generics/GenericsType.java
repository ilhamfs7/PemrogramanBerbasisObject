public class GenericsType<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsType<Integer> type = new GenericsType<>();
        type.set(1); //valid
        System.out.println(type.get());

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Java"); //valid
        System.out.println(type1.get().getClass());
        type1.set(10.5); //valid and autoboxing support
        System.out.println(type1.get().getClass());
    }
}