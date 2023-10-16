package turkishRepetition;

public class A48Exception02Final {

    //try catch de dahi hata olussa da final mutlaka calisir
    //mutlaka yapilmasi gereken islem varsa buraya yazmali , mesela baglanti kesme , dosya kapama gibi

    public static void main(String[] args) {

        try{
            String s=null; //burda exp atsa dahi finally calisti

            //int a=30/0;//asagida bunu yakalayacak kod olmasa bile finally calisti

            //String s="Mustafa";

            //System.out.println(s.hashCode());
        }



        catch (NullPointerException e){
            System.out.println("Null referans hatasi");
        }



        finally {
            System.out.println("finally calisiyor");
        }
    }

}
