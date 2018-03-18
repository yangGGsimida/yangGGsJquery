package cn.Enum;
/*≤‚ ‘utf8±‡“Î≥ˆ¥Ì*/
public enum TrafficLamp {
	RED(30) {
        @Override
        public TrafficLamp getNextLamp() {
            return GREEN;
        }
    }, GREEN(45) {
        @Override
        public TrafficLamp getNextLamp() {
            return YELLOW;
        }
    }, YELLOW(5) {
        @Override
        public TrafficLamp getNextLamp() {
            return RED;
        }
    };

    private int time;

    private TrafficLamp(int time) {
        this.time = time;
    }

    public abstract TrafficLamp getNextLamp();


}
