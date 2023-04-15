public class Main {

    public static void main(String[] args) {
        printName("Prasanna");
        printName("Kaif");
        float num = (float) 10;
        int numOne = 2;
        int numTwo = 3;
        int numThree = 4;
        float resultOne = addNums(numOne,numTwo);
        int resultTwo = addNums(numOne,numTwo,numThree);

        System.out.printf("The sum of %d and %d is %f \n",numOne,numTwo,resultOne);
        System.out.printf("The sum of %d and %d and %d is %d \n",numOne,numTwo,numThree,resultTwo);

    }
//    returnType fnName(argType argName){}
    static void printName(String name){
        System.out.println(name);
    }

    static float addNums(float a , float b){
        return a+b;
    }

    static int addNums(int a ,int b, int c){
        return a+b+c;
    }

}
