package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            String line = "";
            for (int j = 0; j < sideLength; j++) {
                if(i == 0 || j == 0 || (sideLength - j - 1) == 0 || (sideLength - i - 1) == 0) {
                    line = line + "8";
                } else {
                    line = line + " ";
                }
            }
            System.out.println(line);
        }
    }
}
