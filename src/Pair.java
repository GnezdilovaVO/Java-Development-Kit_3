public class Pair <J, T> {
    private J j;
    private T t;

    public Pair(J j, T t) {
        this.j = j;
        this.t = t;
    }
    public J getFirst(){
        return j;
    }
    public T getSecont(){
        return t;
    }

    @Override
    public String toString() {
        return "Pair {" + j + " " + t +'}';
    }
}
