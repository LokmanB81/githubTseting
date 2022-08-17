public class C01_ilk_Kavramlar {

    public static void main(String[] args) {

        System.out.println("git init ile git repo olusturuldu");
        System.out.println("git add . ile proje working den stage alındı");
        System.out.println("git commit -m 'message' ile projenin commiti olusturuldu"); // commit aaa

        // github a push yapalım
        // git remote add origin https://github.com/LokmanB81/githubTseting.git
        //git push -u origin main

        System.out.println("projede degisik yaptik yeni commit olusturalim");
        // git commit -a -m "message"
        /*branch 'master' set up to track 'origin/master'.
PS C:\GitGitHubTesting> git commit -a -m "bbb"
[master 41fee02] bbb
 1 file changed, 9 insertions(+)

 ve bbb commiti github u push edelim

 git push

 remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/LokmanB81/githubTseting.git
   cfe3a87..41fee02  master -> master

*/
        // git branch ile branch olusturalım
        // git branch ..branch adı...


    }
}
