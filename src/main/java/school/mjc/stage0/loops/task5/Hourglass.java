package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i = 0;
        int lineLength = height;
        boolean crossed = false;

        while (i < height) {
            String line = "";
            int skip = (height - lineLength) / 2;

            if (lineLength > 1 && !crossed) {
                for (int j = 0; j < height; j++) {
                    if (j >= skip && j < height - skip) {
                        line = line + "8";
                    } else {
                        line = line + " ";
                    }
                }
                System.out.println(line);
                lineLength = lineLength - 2;
                i++;
            } else {
                crossed = true;
                if(lineLength == 0) {
                    lineLength = 2;
                    skip = (height - lineLength) / 2;
                }
                for (int j = 0; j < height; j++) {
                    //System.out.println(j + skip + "test");
                    if (j >= skip && j < height - skip) {
                        line = line + "8";
                    } else {
                        line = line + " ";
                    }
                }
                System.out.println(line);
                lineLength = lineLength + 2;
                i++;
            }
        }


/*
        for (int i = 1; i <= height; i++) {
            String line = "";
            int midX = (int) height / 2;
            for (int j = 0; j < height; j++) {
                int limY = 0;
                if (i < midX) {
                    limY = midX - i + 1;
                } else if(i > midX) {
                    limY = -midX + i;
                } else {
                    limY = 1;
                }
                if((j < midX && j >= midX - limY ) || (j > midX && j < midX + limY) || j == midX) {
                    line = line + "8";
                } else {
                    line = line + " ";
                }
            }
            System.out.println(line);
        }
 */
    }
}
