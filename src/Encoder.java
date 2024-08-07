import java.util.Scanner;
import java.util.Base64;

public class Encoder {

    static Scanner scanner = new Scanner(System.in);
    static Base64.Encoder encoder = Base64.getEncoder();
    static Base64.Decoder decoder = Base64.getDecoder();

    public static void startEncoder() {
        int choice = displayEncoderMenu();
        switch (choice){
            case 1:
                encode();
                break;
            case 2:
                decode();
                break;
            default:
                break;
        }

    }
    public static int displayEncoderMenu(){
        System.out.println("Please choose an option");
        System.out.println("1.- Encode a String to Base64\n2.- Decode a String from Base64\n");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void encode(){
        System.out.println("Please enter the String to encode:");
        String message = scanner.nextLine();
        System.out.println("Encoded String is:"+encoder.encodeToString(message.getBytes()));
    }
    public static void decode(){
        System.out.println("Please enter the String to decode:");
        String encodedString = scanner.nextLine();
        byte[] decodedBytes = decoder.decode(encodedString);
        System.out.println("Decoded String is: \""+new String(decodedBytes)+"\"");
    }

}
