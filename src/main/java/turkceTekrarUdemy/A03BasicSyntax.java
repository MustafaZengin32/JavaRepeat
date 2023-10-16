package turkceTekrarUdemy;

public class A03BasicSyntax {

    public A03BasicSyntax() {
        // new object is created, at least one constructor will be invoked.
        // The main rule of constructors is that they should have the same name as the class
    }

    public static void main (String [] args){

        System.out.println("Hello world");


    }

    public static void myMethodName(String methodName){

        // A key word cannot be used as an identifier
        //int for;

        //Examples of legal identifiers
        int age;
        int $salary;
        int _value;
        int _1_value;

        //Examples of illegal identifiers:
        //int  123abc;
        //int -salary;

        class Dog{
            //object's state is stored in fields and behavior is shown via methods.
            String breed;
            int ageC;
            String color;
            void barking(){
            }

            void hungry(){
            }

            void sleeping(){
            }
        }

        class Puppy{

            int puppyAge;
            public Puppy(String name){
                // This constructor has one parameter, name.
                System.out.println("Name chosen is :" + name );
            }

            public void setAge( int age ){
                puppyAge = age;
            }
            public int getAge( ){
                System.out.println("Puppy's age is :" + puppyAge );
                return puppyAge;
            }

            public static void main(String []args){
                /* Object creation */
                Puppy myPuppy = new Puppy( "tommy" );
                /* Call class method to set puppy's age */
                myPuppy.setAge( 2 );
                /* Call another class method to get puppy's age */
                myPuppy.getAge( );
                /* You can access instance variable as follows as well */
                System.out.println("Variable Value :" + myPuppy.puppyAge );
            }
        }








    }
}
