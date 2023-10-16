package turkishRepetition;

public class A44Inheritance03Test {
    public static void main(String[] args) {

        A44Inheritance02Yonetici yonetici1=new A44Inheritance02Yonetici("alican",2500,"It",10);

        //yonetici1.bilgilerigoster();//Ilk bunu miras aldigi icin cikti asagidaki gibi ancak yonetici kendi methodunu
                                      //ayni isimle kullanir yani override ederse kendi methodu cagrilir

       /* isim alican
        maas 2500
        departman It
        sorumlu kisi sayisi 10

        */

        yonetici1.zam_yap(200);

        yonetici1.bilgilerigoster();

    }
}
