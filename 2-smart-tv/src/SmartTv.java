public class SmartTv {
    private int volume = 25;
    private int channel = 1;
    private boolean power = false;

    public void powerOn() {
        power = true;
        System.out.println("TV is on");
    }

    public void powerOff() {
        power = false;
        System.out.println("TV is off");
    }

    public void setChannel(int channel) {
        if (power) {
            this.channel = channel;
            System.out.println("Channel " + channel);
        } else {
            System.out.println("The TV is off. Please turn it on first.");
        }
    }

    public void channelDown() {
        if (channel > 1) {
            setChannel(channel - 1);
        } else {
            System.out.println("You are already on channel 1.");
        }
    }

    public void channelUp() {
        if (channel < 100) {
            setChannel(channel + 1);
        } else {
            System.out.println("You are already on the maximum channel.");
        }
    }

    public void setVolume(int volume) {
        if (power) {
            this.volume = volume;
            System.out.println("Volume " + volume);
        } else {
            System.out.println("The TV is off. Please turn it on first.");
        }
    }

    public int getVolume() {
        return volume;
    }
}
