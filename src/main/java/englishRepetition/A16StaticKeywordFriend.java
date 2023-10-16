package englishRepetition;

public class A16StaticKeywordFriend {

    String name;

    static int numberOfFriends;



    public A16StaticKeywordFriend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends+" friends");

    }




}
