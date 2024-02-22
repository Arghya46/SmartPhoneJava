package smartphonejava
 
 class Phone()
  {
    public void call(){
        System.out.println("Make phone call");
    }
    public void sms(){System.out.println("Make sms");}

  }
  interface ICamera
  {
      void click();
      void record();

  }
  interface IMusicPlayer
  {
    void play();
    void start();
    void pause();
  }
   
  class SmartPhone extends Phone implements ICamera,IMusicPlayer
  {
    public void videocall(){System.out.println("Make videocall");}
    public void click(){System.out.println("make a photo click");}
    public void record(){System.out.println("Record video");}
    public void play(){System.out.println("Play video");}
    public void start() {System.out.println("Record to play a video");}
    public void pause(){System.out.println("Pause the video");}

  }

  public class SmartPhoneJava
  {

     public static void main(Strings[] args)
     {
         SmartPhone s=new SmartPhone();
         s.click();
         s.click();
         s.pause();

     }



  }