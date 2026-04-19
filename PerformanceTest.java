/* 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
one is better.
    */
package String;
public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;

        // Test StringBuffer
        long startBuffer = System.currentTimeMillis();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ms");

        // Test StringBuilder
        long startBuilder = System.currentTimeMillis();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ms");
    }
}
