package animal;

public class Animal {

    //フィールド
    private String name;
    private int old;

    //引数なしコンストラクタ
    public Animal() {
    }

    //引数ありコンストラクタ
    public Animal(String name, int old) {
        this.name = name;
        this.old = old;
    }

    //名前と年齢を発言するメソッド
    public void say() {
        System.out.println(name + "です。 " + old +"歳です。");
    }

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

}
