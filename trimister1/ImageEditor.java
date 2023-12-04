import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;


public class ImageEditor {

    

    public static void PrintDiagonal(int a[][]) {// Iterations ---->> N
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
        }
        System.out.println();
    }

    public static void PrintOffDiagonal(int a[][]) {// Iterations ---->> N
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][a.length - 1 - i] + " ");
        }
        System.out.println();
    }

    public static int[][] TransposeMatrix(int A[][]) {

        for (int i = 0; i < A.length; i++) {// rows
            for (int j = 0; j < i; j++) {// columns
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }

    // Printing the values of The Pixels in the Image
    public static void PrintPixelsValues(BufferedImage inputImage) {
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();

        for (int i = 0; i < height; i++) {// Height is Acttuvally -- ROws
            for (int j = 0; j < width; j++) {// Width Is Actuvallyy -- Colomns
                // --->>Exatracting The Combination of Red`Blue`Green
                // System.out.print(inputImage.getRGB(i, j)+" ");//Here I and J are Heigth &

                // Creating a Color Object
                Color pixel = new Color(inputImage.getRGB(i, j));
                System.out.print("{" + pixel.getRed() + " " + pixel.getGreen() + " " + pixel.getGreen() + "}");

            }
            System.out.println();
        }
    }

    // Converting the Image To GreyScale
    public static BufferedImage ConvertToGrayScale(BufferedImage inputImage) {
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage newimage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < height / 2; i++) {// Height is Acttuvally -- ROws
            for (int j = 0; j < width / 2; j++) {// Width Is Actuvallyy -- Colomns

                newimage.setRGB(i, j, inputImage.getRGB(i, j));
                // System.out.print("{"+pixel.getRed()+" "+pixel.getGreen()+"
                // "+pixel.getGreen()+"}");

            }
        }
        return newimage;
    }

    public static BufferedImage RotateanImageRight(BufferedImage image) {
        
        BufferedImage image1 = RotateanImageLeft(image);
        BufferedImage image2 =  RotateanImageLeft(image1);
        BufferedImage final1 =  RotateanImageLeft(image2);

       return final1;

        /**

        BufferedImage Transpose = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);
                // Here We Are Changing The Height--> Width && Width to -->Heigth


        //Here We are Transposing The Given Matrix
        for(int h=0;h<height;h++){
            for(int w=0;w<width;w++){

                //Retrivin Pixels and Transposing along Off-Diagonal
                Color pixels = new Color(image.getRGB(w, h));
                int temp = pixels.getRGB();
                Transpose.setRGB(Transpose.getWidth()-1-h,Transpose.getHeight()-1-h,temp);
            }
        }

        // BufferedImage TransPose = image;

        //Here WE Inverse The TransPosed Image
        for (int h = 0; h < Transpose.getHeight(); h++) {
            for (int w = 0; w < Transpose.getWidth() / 2; w++) {

                // Retrive Pixels
                Color pixel = new Color(Transpose.getRGB(w, h));
                int temp = pixel.getRGB();
                Color Inverse_Pixel = new Color(Transpose.getRGB(Transpose.getWidth() - 1 - w, h));
                Transpose.setRGB(w, h, Inverse_Pixel.getRGB());
                Transpose.setRGB(Transpose.getWidth() - 1 - w, h, temp);
            }
        }

        
        // Use The Roatate Left THree Times

         return Transpose;  **/
    }

    public static BufferedImage RotateanImageLeft(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

         BufferedImage tRANSPOSE = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);
        // BufferedImage tRANSPOSE = image;
        // Here We Are Changing The Height--> Width && Width to -->Heigth

        // Here WE TransPose The Give Matrix ------
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {

                // Retriving Pixels
                Color pixel = new Color(image.getRGB(w, h));
                int temp = pixel.getRGB();
                tRANSPOSE.setRGB(h, w, temp);

            }
        }

        // Here WE Inverse The TransPosed Image
        for (int h = 0; h < tRANSPOSE.getHeight(); h++) {
            for (int w = 0; w < tRANSPOSE.getWidth() / 2; w++) {

                // Retrive Pixels
                Color pixel = new Color(tRANSPOSE.getRGB(w, h));
                int temp = pixel.getRGB();
                Color Inverse_Pixel = new Color(tRANSPOSE.getRGB(tRANSPOSE.getWidth() - 1 - w, h));
                tRANSPOSE.setRGB(w, h, Inverse_Pixel.getRGB());
                tRANSPOSE.setRGB(tRANSPOSE.getWidth() - 1 - w, h, temp);
            }
        }
        // BufferedImage Inversion = new BufferedImage(null, null, false, null)

        return tRANSPOSE;
    }

    public static BufferedImage changeBrightness(BufferedImage image, int increase) {
        int height = image.getHeight();
        int width = image.getWidth();

        BufferedImage newimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < height; i++) {// Height is Acttuvally -- ROws
            for (int j = 0; j < width; j++) {// Width Is Actuvallyy -- Colomns
                // retriving the pixelsss -----------------
                Color pixel = new Color(image.getRGB(j, i));// Here First Give Width And Then Height
                int red = pixel.getRed();
                int blue = pixel.getBlue();
                int green = pixel.getGreen();
                // Modifing The Pixel ---------------------
                red = red + (increase * red / 100);
                blue += (increase * blue / 100);
                green += (increase * green / 100);
                // Conditioning The Pixel ---------
                if (red > 255)
                    red = 255;
                if (blue > 255)
                    blue = 255;
                if (green > 255)
                    green = 255;

                if (red < 0)
                    red = 0;
                if (blue < 0)
                    blue = 0;
                if (green < 0)
                    green = 0;
                // ReCreating The Pixels To RGB COlor-----------------
                Color newPixel = new Color(red, green, blue);

                newimage.setRGB(j, i, newPixel.getRGB());
            }
        }
        return newimage;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int a[][] = {
        // { 0, 0, 0, },
        // { 1, 1, 1 },
        // { 1, 5, 9 }
        // };
        // a = TransposeMatrix(a);

        // for (int i = 0; i < a.length; i++)
        // System.out.println(Arrays.toString(a[i]));

        // How to Open a File in Java .. -->> We Use This File Ans Do Editing --> A
        // Picture Is Just A 2D Array

        System.out.println("Enter The Name Of the File Needed To Be Edited");
        String inputfile = in.nextLine();

        // File file = new File("Nature.jpg");
        File file = new File(inputfile);

        // System.out.println("How Much BrightNess Needed To Be Increases");
        // System.out.println("");
        // int inc = in.nextInt();

        try {
            BufferedImage inImage = ImageIO.read(file);

            // BufferedImage grayScale = ConvertToGrayScale(inImage);

            // File grascale = new File("grayscale.jpg");
            // ImageIO.write(grayScale, "jpg", grascale);

            // BufferedImage bright = changeBrightness(inImage, inc);

            // File brightfile = new File("bright-nar.jpg");
            System.out.println("EnterThe Name Of the Output File");
            String outputFile = in.nextLine();
            File rotated_file = new File(outputFile);
            BufferedImage rotated = RotateanImageRight(inImage);
            ImageIO.write(rotated, "jpg", rotated_file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        in.close();

        // Trying to Convert An Image To GrayScale

    }
}
