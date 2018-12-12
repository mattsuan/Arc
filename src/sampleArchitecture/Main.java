package sampleArchitecture;

import java.util.Scanner;

public class Main {

    public boolean loginStatus;
    public int loginPassword;

    public void main (String[] arg) {

        //ユーザーの作成
        Main user = new Main();

        //ユーザーの初期値の設定
        user.loginStatus = false;
        user.loginPassword = 1234;

        //本機能
        while (true) {
            //メニュー画面の表示
            System.out.println("=========会員管理サービス=========\n" +
                    "1．会員登録\n" +
                    "2．ログイン/ログアウト\n" +
                    "3．会員情報検索\n" +
                    "4．会員情報変更\n" +
                    "5．サービス利用登録/停止\n" +
                    "0．終了\n" +
                    "機能を選んでください：");

            //メニュー選択（全角数字）
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();



            //各種メニューへの条件分岐
            switch (userInput) {
            case 1:
                user.MemberRegistration();
                continue;
            case 2:
                user.LoginLogout();
                continue;
            case 3:
                user.MemberSearch();
                continue;
            case 4:
                user.MemberEdit();
                continue;
            case 5:
                user.AboutService();
                continue;
            case 0:
                user.Exit();
                continue;
            }
        }
    }

    public void MemberRegistration () {
        System.out.println("-----会員登録機能です-----");
    }

    public void LoginLogout () {
        System.out.println("-----ログイン/ログアウト機能です-----");
    }

    public void MemberSearch () {
        System.out.println("-----会員検索機能です-----");
    }

    public void MemberEdit () {
        System.out.println("-----会員編集機能です-----");
    }

    public void AboutService () {
        System.out.println("-----サービス利用登録/停止機能です-----");
    }

    public void Exit () {
        System.out.println("-----終了機能です-----");
    }

}
