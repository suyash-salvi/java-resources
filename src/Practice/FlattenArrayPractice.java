package Practice;

import java.util.*;
import java.util.stream.*;

public class FlattenArrayPractice {

    // Implement this method on your own
    public static Stream<Object> flatten(Object[] array) {
        // convert the array into stream usng Arrays.steam(array)
        return Arrays.stream(array).flatMap(a-> {
            // check if the lambda is an array nested
            if(a instanceof Object[]) {
                // recursive call
                return flatten((Object[]) a);
            } else {
                // send the stream
                return Stream.of(a);
            }
        });
    }

    public static void main(String[] args) {

        Object[] array = {
                1,
                2,
                new Object[]{
                        3,
                        4,
                        new Object[]{
                                5
                        },
                        6,
                        7
                }
        };

        List<Object> result = flatten(array).toList();

        System.out.println(result);
    }
}
