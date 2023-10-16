package englishRepaet;

public class A15StaticKeyword {
    //single copy
    //The class own the static member

    public static void main(String[] args) {

        A16StaticKeywordFriend friend1 = new A16StaticKeywordFriend("Bob");

        A16StaticKeywordFriend friend2 = new A16StaticKeywordFriend("Patrick");

        A16StaticKeywordFriend friend3 = new A16StaticKeywordFriend("Squid");

        A16StaticKeywordFriend friend4 = new A16StaticKeywordFriend("Lucka");

        System.out.println(friend1.name);//we must creat object , because this variables are not static

        System.out.println(A16StaticKeywordFriend.numberOfFriends);//we can reach number of friends
                                                                   //even though we did not create object
                                                                   //Because it is static

        A16StaticKeywordFriend.displayFriends();



    }
}
