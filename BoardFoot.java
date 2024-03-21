/**
 * This Program calculates the length of board foot.
 * so that the result is exactly 1 board foot and return that value.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2024-03-19
 */

import java.util.Scanner;

public class BoardFoot {
  public static void main(String[] args) {
    try {
      // Starts scanner.
      Scanner scanner = new Scanner(System.in);
      // asks the user for there width.
      System.out.println("Enter your width");
      // gets the users width.
      float width = scanner.nextFloat();
      // asks the user for there height.
      System.out.println("Enter your height");
      // gets the users height.
      float height = scanner.nextFloat();
      // Close scanner.
      scanner.close();
      // If the width or height is < or = 0  it tells them to enter a positive number.
      if (width <= 0 || height <= 0) {
        System.out.println("Width and height must be positive numbers ");
      }
      // else it calls calculateVolume to calculate the volume.
      // Than prints out the volume
      else {
        float length = calculateVolume(width, height); //  volume calculations
        System.out.println("The wood should be " + length + " inches long ");
      }
      // Catches invalid input.
    } catch (Exception e) {
      System.out.println("Invalid input: " + e.getMessage());
    }
  }
  // 
  public static float calculateVolume(float width, float height) {
    // length calculations
    int volume = 144;
    float  length = volume / (width * height);
    return length;
  }
}
