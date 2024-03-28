import java.util.Arrays;

public class LCD {
      private String Status;
      private int Volume;
      private int Brightness;
      private String Cable; 
      private int cableindex;

      void turnOff() {
        Status = "off";
      }
      void turnOn() {
        Status = "on";
      }
      void freeze() {
        Status = "Freeze";
      }
      void volumeUp() {
        Volume++;
      }
      void volumeDown() {
        Volume--;
      }
      void setVolume(int volume) {
        Volume = volume;
      }
      void brightnessUp() {
        Brightness++;
      }
      void brightnessDown() {
        Brightness--;
      }
      void setBrightness(int brightness) {
        Brightness = brightness; 
      }    
      void cableUp() {
        cableindex++;
      }
      void cableDown() {
        cableindex--;
      }      
      void setCable() {
        switch (cableindex) {
           case 1:
                Cable = "VGA";
            break;
            case 2:
                Cable = "DVI";
            break;
            case 3:
                Cable = "HDMI";
            break;
            default:
                Cable = "DisplayPort";
            break;                       
            }
        }

        public void displayMessege() {
            System.out.println("LCD status  :" + Status);
            System.out.println("Volume      :" + Volume);
            System.out.println("Brightnes   :" + Brightness);
            System.out.println("Cable       :" + Cable);
        }
    }