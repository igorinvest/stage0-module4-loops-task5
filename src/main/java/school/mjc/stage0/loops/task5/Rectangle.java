package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < length; j++) {
                if(i == 0 || j == 0 || (length - j - 1) == 0 || (height - i - 1) == 0) {
                    line = line + "8";
                } else {
                    line = line + " ";
                }
            }
            System.out.println(line);
        }
    }
}
