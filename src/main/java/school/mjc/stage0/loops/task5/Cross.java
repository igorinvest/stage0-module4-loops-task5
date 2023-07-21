package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            String line = "";
            for (int j = 0; j < sideLength; j++) {
                if(i == (int)sideLength/2 || j == (int)sideLength/2) {
                    line = line + "8";
                } else {
                    line = line + " ";
                }
            }
            System.out.println(line);
        }
    }
}
