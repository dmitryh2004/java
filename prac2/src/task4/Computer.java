package task4;

public class Computer {
    int mac_address;
    String cpu = "default";
    String gpu = "no gpu";
    float ram = 1.0f; //in gb
    float disk_space = 1.0f; //in gb
    String additional = "";

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public float getDisk_space() {
        return disk_space;
    }

    public void setDisk_space(float disk_space) {
        this.disk_space = disk_space;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public int getMac_address() {
        return mac_address;
    }

    public void setMac_address(int mac_address) {
        this.mac_address = mac_address;
    }

    public Computer(int mac_address, String cpu, String gpu, float ram, float disk_space, String additional) {
        this.mac_address = mac_address;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.disk_space = disk_space;
        this.additional = additional;
    }

    public Computer(int mac_address)
    {
        this.mac_address = mac_address;
        this.cpu = "Default CPU";
        this.gpu = "No GPU";
        this.ram = 1.0f;
        this.disk_space = 10.0f;
        this.additional = "No additional modules";
    }

    public String toString()
    {
        return "Computer " + this.mac_address + ": CPU - " + this.cpu + ", GPU - " + this.gpu +
                ", RAM amount (in GB) - " + this.ram + ", total disk space (in GB) - " + this.disk_space +
                ", additional modules - " + this.additional;
    }

}
