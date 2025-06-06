// example showing the concept of Predicate

import java.util.function.Predicate;
class Demo10{
        public static void main(String args[]){
        Predicate<Integer> lessThan = i -> i < 10;
        System.out.println("Result : "+lessThan.test(345));
        System.out.println("Result : "+lessThan.negate().test(345));
        
        Predicate<Integer> greaterThan = i -> i > 100;
        System.out.println("Result : "+lessThan.and(greaterThan).test(345));
        System.out.println("Result : "+lessThan.or(greaterThan).test(345));
        
        Predicate<String> str = Predicate.isEqual("Andrew");
        System.out.println("Result : "+str.test("ANDREW"));
        System.out.println("Result : "+str.test("Andrew"));
    }
}

