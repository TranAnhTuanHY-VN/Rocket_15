package entity.Exercise3;

public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

   public static class Processor {
        private int coreAmount;
        private String menufacturer;

        public Processor(int coreAmount, String menufacturer) {
            this.coreAmount = coreAmount;
            this.menufacturer = menufacturer;
        }

        public double getCache() {
            return 4.3;
        }
    }

    public static class RAM {
        private int memory;
        private String menufacturer;

        public RAM(int memory, String menufacturer) {
            this.memory = memory;
            this.menufacturer = menufacturer;
        }

        public double getClockSpeed() {
            return 5.5;
        }
    }

}
