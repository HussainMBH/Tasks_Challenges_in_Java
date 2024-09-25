package JavaProgramming.StackHeapTest;

import java.util.Arrays;

//Primitive and reference variable save in Stack Memory, Reference variable's object save in Heap Memory

public class Memory {
    public static void main(String[] args) {
        int a = 20;
        int b = a;
        System.out.println(b);

        int zig[] = new int[5];
        int zag[] = zig;

        int zeg[] = new int[5];

        System.out.println(zig);
        System.out.println(zag);
        System.out.println(zeg);

        zag[2] = 4;
        System.out.println(Arrays.toString(zag));
        System.out.println(Arrays.toString(zig));
        System.out.println(Arrays.toString(zeg));


    }
}
