package ch.fhnw.oop2.module05.streams.ab1;
import java.util.stream.Stream;


public class Arbeitsblatt01 {

    public static void main(String[] args) {
       Tuple<Integer> tuple1 = new Tuple<Integer>(0,1);
       
       Stream
           .iterate(tuple1, n -> new Tuple<Integer>(n.t2, n.t1 + n.t2))
           .map(tuple -> String.valueOf(tuple))
           .limit(10)
           .forEach(System.out::println); 
           
    }

}
