package animal;

public class Human extends Animal implements Thinkable {

    //フィールド
    private String hobby;

    //引数なしコンストラクタ
    public Human() {
    }

    //引数ありコンストラクタ（名前と年齢の初期はスーパークラスのコンストラクタを利用する）
    public Human(String name, int old, String hobby){
        super(name, old);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は"+ this.hobby + "について考えています。");
    }

    //setter & getter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}