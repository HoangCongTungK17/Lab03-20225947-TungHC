package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            builder.append("This is a lot of garbage");
        }
        System.out.println("Finished without creating excessive garbage");
    }
}