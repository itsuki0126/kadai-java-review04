package animal;

public class Human extends Animal implements Thinkable{
    //フィールドの定義
    private String hobby;

    //引数なしのコンストラクタ
    public Human() {
    }
    //引数ありのコンストラクタ（名前と年齢はスーパークラスのコンストラクタを利用）
    public Human(String name, int age, String hobby) {
        super.setName(name);
        super.setAge(age);
        this.hobby = hobby;
    }

    //趣味についてthinkメソッドで出力
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}