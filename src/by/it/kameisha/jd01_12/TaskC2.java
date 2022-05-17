package by.it.kameisha.jd01_12;

import java.util.*;

public class TaskC2 {
    public static void main(String[] args) {
        List<Byte> byteList = Arrays.asList((byte)2,(byte)3,(byte)62,(byte)7,(byte)5,(byte)20,(byte)22,(byte)1,(byte)45);
        List<Long> longList =Arrays.asList(1L, 2L, 4L,56L,6L,4L,3L,22L,12L,15L);
        List<Float> floatList = Arrays.asList(4f,78f,15f,1.0f,45.2f,56.0f,2.0f);
        Set<Byte> byteSet = new HashSet<>(byteList);
        Set<Long> longSet = new TreeSet<>(longList);
        Set<Float> floatSet = new HashSet<>(floatList);
        System.out.println(byteSet);
        System.out.println(longSet);
        System.out.println(floatSet);
        Set<Number> numberSet1 = getCross(byteSet,longSet);
        System.out.println(numberSet1);
    }
    private static Set<Number> getCross(Set<? extends Number> first, Set<? extends Number> second) {
        Set<Number> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }
}
