package turkishRepetition;

class Hayvan{

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konusuyor...";
    }

}
//***********************************************************************************************

class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"...miyavliyor...";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim()+"...havliyor...";
    }
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"...kisniyor...";
    }
}


public class A45Polymorphism {

//    public static void konustur(Hayvan hayvan){
//        System.out.println(hayvan.konus());
//    }

    public static void konustur(Object object){
        //System.out.println(object.konus());

        if ( object instanceof Kopek){
            Kopek kopek=(Kopek)object;
            System.out.println(kopek.konus());
        }

        else if ( object instanceof Kedi){
           Kedi kedi=(Kedi)object;
            kedi.konus();

            System.out.println(kedi.konus());
        }






    }
    public static void main(String[] args) {
        //bir nesnenin birden fazla nesne gibi davranmasi
        //public yazmadan bir dosyaya birden fazla class koyabiliriz

        //instance of objenin hangi class dan oldugunu anlamak icin kullanilir
        //true false dondurur//nesne miras alinan sinifta olsa true verir


//        Kopek kopek=new Kopek("Kara");
//
//        if(kopek instanceof Hayvan){//true
//            System.out.println("Bu nesne hayvan sinifindan...");
//        }
//
//        if(kopek instanceof Kopek){ //true
//            System.out.println("Bu nesne kopek sinifindan...");
//        }
//
//        if(kopek instanceof Object){ //true //classlarin atasi object class tir , miras almasak da vardir
//            System.out.println("Bu nesne object sinifindan...");
//        }

        Kopek kopek=new Kopek("Karabas");

        Kedi kedi=new Kedi("Tekir");



        konustur(kopek);//Karabas...havliyor...

        konustur(kedi);//Tekir...miyavliyor...

















        //konustur(new Kedi("Tekir"));

        //konustur(new Kopek("Karabas"));

        //konustur(new At("Yilki"));//burda polymorphism faydasini gorduk hangi referansdan cagirirsan ayni method ona
        //ozel gelir


//        Hayvan hayvan=new Hayvan("Limon");
//        System.out.println(hayvan.konus());//Hayvan konusuyor...
//
//        Hayvan hayvan1=new Kedi("Tekir");
//        System.out.println(hayvan1.konus());//Tekir...miyavliyor...
//        //kedi deki konus methodunu silse idim kedide olmadigi icin hayvan nin kini alirdi
//
//        Hayvan hayvan2=new Kopek("Karabas");
//        System.out.println(hayvan2.konus());//Karabas...havliyor...
//
//        Hayvan hayvan3=new At("Sahbatur");
//        System.out.println(hayvan3.konus());//Sahbatur...kisniyor...




    }
}
