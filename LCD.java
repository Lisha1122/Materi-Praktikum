import java.util.Arrays;

public class LCD {
      String Status;
      int Volume;
      int Brightness;
      String Cable; 
      int cable = 1;

      void turnOff() {
        Status = "off";
      }
      void turnOn() {
        Status = "on";
      }
      void freeze() {
        Status = "freeze";
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
        cable++;
      }
      void cableDown() {
        cable--;
      }      
      void setCable() {
        switch (cable) {
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
            System.out.println("---------------LCD--------------");
            System.out.println("LCD status              :" + Status);
            System.out.println("Volume                  :" + Volume);
            System.out.println("Brightnes               :" + Brightness);
            System.out.println("Cable                   :" + Cable);
        }
    }