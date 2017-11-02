package rover;

public enum Direction {

    NORTH {
        @Override
        public Direction leftDirection() {
            return WEST;
        }

        @Override
        public Direction rightDirection() {
            return EAST;
        }

        @Override
        public String representation() {
            return "N";
        }
    },
    EAST {
        @Override
        public Direction leftDirection() {
            return NORTH;
        }

        @Override
        public Direction rightDirection() {
            return SOUTH;
        }

        @Override
        public String representation() {
            return "E";
        }
    },
    WEST {
        @Override
        public Direction leftDirection() {
            return SOUTH;
        }

        @Override
        public Direction rightDirection() {
            return NORTH;
        }

        @Override
        public String representation() {
            return "W";
        }
    },
    SOUTH {
        @Override
        public Direction leftDirection() {
            return EAST;
        }

        @Override
        public Direction rightDirection() {
            return WEST;
        }

        @Override
        public String representation() {
            return "S";
        }
    };

    public abstract Direction leftDirection();

    public abstract Direction rightDirection();

    public abstract String representation();
}
