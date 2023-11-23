package animal;

public class Animal {
    //フィールドの定義
    private String name;
    private int age;

    //引数なしのコンストラクタ
    public Animal() {
    }
    //引数ありのコンストラクタ
    public Animal(String animalName, int animalAge) {
        this.name = animalName;
        this.age = animalAge;
    }

    //名前と年齢を名乗るメソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

}