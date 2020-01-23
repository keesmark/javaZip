public class Pair<T, O> {
    private T value;
    private O word;

    //Pairは２つの値を順序通りに持つだけのクラスですが、
    //valueとwordという変数名はどんな意味がありますか？

    public Pair(T value, O word) {
        this.value = value;
        this.word = word;
    }

    public T getValue() {
        return this.value;
    }

    public O getWord() {
        return this.word;
    }
}
