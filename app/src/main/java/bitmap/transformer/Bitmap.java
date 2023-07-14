package bitmap.transformer;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;


public class Bitmap {
    private BufferedImage image;
    private Path imagePath;

    public Bitmap(String inputFilePath) throws IOException {

        this.imagePath = Paths.get(inputFilePath);

        try {
            image = ImageIO.read(this.imagePath.toFile());
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public void invertColors(String outputFilePath) {
        System.out.println("You selected invert colors");
        // Invert colors logic using image
        // Save the modified image using ImageIO.write() with outputFilePath
    }

    public void randomizeColors(String outputFilePath) {
        System.out.println("You selected randomize colors");
        // Randomize colors logic using image
        // Save the modified image using ImageIO.write() with outputFilePath
    }

    public void darkenColors(String outputFilePath) {
        System.out.println("You selected darken colors");
        // Darken colors logic using image
        // Save the modified image using ImageIO.write() with outputFilePath
    }
}
// Properties of the bitmap to manipulate:file path, buffered image object