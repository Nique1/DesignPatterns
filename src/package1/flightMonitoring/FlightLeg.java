package package1.flightMonitoring;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private double price;


    //private constructor, takes inner class object as a parameter
    private FlightLeg(FlightLegBuilder flightLegBuilder){
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed= flightLegBuilder.delayed;
        this.price= flightLegBuilder.price;
    }




    public void setPrice(double price) {
        this.price = price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder{
        private String from;
        private String to;
        private boolean delayed;
        private double price;

        //public method to build each field
        public FlightLegBuilder buildFrom(String from){
            this.from = from;
            return this;
        }

        public FlightLegBuilder buildTo(String to){
            this.to = to;
            this.delayed = false;
            return this;
        }

        public FlightLegBuilder buildPrice(double price){

            this.price = price;
            return this;

        }

        public FlightLeg build() {
            if(this.price == 0){
                throw new IllegalStateException("Missing expected value - price");
            }
            return new FlightLeg(this);
        }
    }


}
