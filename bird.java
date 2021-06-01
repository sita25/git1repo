//this is the code for bird
import java.lang.*;
public class bird{
    public class MyBird<gen>{
        private gen leg;
        private gen bodyHeight;
        public gen HeightMeasurement(gen a, gen b){
            this.leg=a;
            this.bodyHeight=b;
            return (leg);
        }
        // public void printHello(){
        //     System.out.println("Hello, world");
        // }
    }
    public static void main(String[] args) {
        int a=3;
        bird x=new bird();
        MyBird<Integer> crow=x.new MyBird<Integer>();
        //Integer.toString(int_value) method is used for converting integer to string
        // System.out.println("The height of the bird with leg 4 and body height 3 is:"+crow.HeightMeasurement(4,3));
        System.out.println("The height of the bird with leg 4 and body height 3 is:".concat (Integer.toString(crow.HeightMeasurement(4,3))));
    }
}