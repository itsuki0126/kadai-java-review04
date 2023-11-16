package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam a = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam b = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam c = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam d = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam e = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam f = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        a.report();
        b.report();
        c.report();
        d.report();
        e.report();
        f.report();
    }

}
