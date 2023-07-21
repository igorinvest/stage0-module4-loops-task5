package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            String line = "";
            for (int j = 0; j < cathetusLength; j++) {
                if(j <= i) {
                    line = line + "8";
                } else {
                    line = line + " ";
                }
            }
            System.out.println(line);
        }
    }
}
