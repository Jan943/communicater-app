package app;

public class Computer {

    private String ddrType;
    private long mhz;
    private int memorySize;

    public Computer() {
    }

    public Computer(String ddrType, long mhz, int memorySize) {
        this.ddrType = ddrType;
        this.mhz = mhz;
        this.memorySize = memorySize;
    }

    public String getDdrtype() {
        return ddrType;
    }

    public void setDdrtype(String ddrtype) {
        this.ddrType = ddrtype;
    }

    public long getMhz() {
        return mhz;
    }

    public void setMhz(long mhz) {
        this.mhz = mhz;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
